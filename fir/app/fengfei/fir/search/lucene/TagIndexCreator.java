package fengfei.fir.search.lucene;

import fengfei.ucm.entity.photo.Photo;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import java.io.IOException;

/**
 */
public class TagIndexCreator extends TagBase {
    /**
     * 索引优化后文件段的数量，数量越大，优化效率越大
     */
    private final static int DEFAULT_MAX_NUM_SEGMENTS = 3;
    /**
     * 低版本的查询索引存活周期
     */
    private final static long STALE_INDEXREADER_SURVIVAL_TIME = 60000;
    private static TagIndexCreator creator = new TagIndexCreator("../index");

    public static TagIndexCreator get() {
        return creator;
    }

    Directory directory;
    private IndexWriter writer;

    public TagIndexCreator(String dir) {
        try {
            writer = createIndexWriter(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private IndexWriter createIndexWriter(String dir)
            throws Exception {
        /*
         */
        IndexWriterConfig conf = new IndexWriterConfig(Version.LUCENE_45,
                getAnalyzer());
        /*
         * 创建索引模式：CREATE，覆盖模式； conf.setOpenMode(OpenMode.CREATE);
         *
         * APPEND，追加模式 conf.setOpenMode(OpenMode.CREATE_OR_APPEND);
         */
        conf.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
        if (IndexWriter.isLocked(FSDirectory.open(getIndexFile(dir)))) {
            IndexWriter.unlock(FSDirectory.open(getIndexFile(dir)));
        }
        directory = FSDirectory.open(getIndexFile(dir));
        IndexWriter writer = new IndexWriter(directory, conf);
        return writer;
    }


    /**
     * 添加的方法
     */
    public void add(Photo photo) throws Exception {
        try {
            Document doc = toDocument(photo);
            writer.addDocument(doc);//添加进写入流里
            writer.forceMerge(1);//优化压缩段,大规模添加数据的时候建议，少使用本方法，会影响性能
            writer.commit();//提交数据
        } catch (Exception e) {
            e.printStackTrace();
            writer.rollback();
        }
    }

    protected Document toDocument(Photo photo) throws Exception {
        Document doc = new Document();
        String title = AnalyzerUtils.toCommaString(photo.title);
        String desc = AnalyzerUtils.toCommaString(photo.description);
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(desc).append(photo.tags).append(photo.exifToCSV());
        doc.add(new StringField(TagFields.ID, String.valueOf(photo.idPhoto), Field.Store.YES));
        doc.add(new TextField(TagFields.Content, sb.toString(), Field.Store.YES));//存储
        doc.add(new NumericDocValuesField(TagFields.At, photo.updatedAt));//存储
        return doc;
    }

    public void close() throws IOException {
        writer.close();
    }

    /**
     * 删除方法
     *
     * @param id 根据ID删除
     */
    public void delete(String id) throws IOException {
        try {

            Query q = new TermQuery(new Term("id", id));
            writer.deleteDocuments(q);//删除指定ID的Document
            // writer.forceMerge(DEFAULT_MAX_NUM_SEGMENTS);
            writer.commit();//提交

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据ID进行更行的方法
     */
    public void updateByID(Photo photo) throws IOException {
        try {
            Document doc = toDocument(photo);
            writer.updateDocument(new Term("id", String.valueOf(photo.idPhoto)), doc);
            writer.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String dir = "/opt/lucene/index";
        TagIndexCreator creator = new TagIndexCreator(dir);
        for (int i = 0; i < 5; i++) {
            Photo photo = new Photo();
            photo.idPhoto = i;
            if (i % 2 == 0) {
                photo.title = "贡嘎" + i;
                photo.tags = "风景";

            } else {
                photo.tags = "贡嘎,丽江,四川" ;
                photo.title = "风景";
            }
            photo.description = "描述";
            photo.make = "";
            photo.model = "";
            photo.aperture = "";
            photo.shutter = "";
            photo.iso = "";
            photo.lens = "";
            photo.focus = "";
            photo.ev = "";
            creator.add(photo);
        }
        creator.close();

        TagSearcher searcher = new TagSearcher(dir);
        TopDocs tds = searcher.search(null, 100, 1, "贡嘎", "风景");
        out(tds, searcher.getSearcher());

    }

    private static void out(TopDocs tds, IndexSearcher searcher) throws IOException {
        System.out.println("总共有【" + tds.totalHits + "】条匹配结果");
        //6.根据TopDocs获取ScoreDoc对象
        ScoreDoc[] sds = tds.scoreDocs;
        for (ScoreDoc sd : sds) {
            //7.根据searcher和TopDocs对象获取Document对象
            Document d = searcher.doc(sd.doc);//sd.doc:文档内部编号
            //8.根据Document对象获取需要的值
            System.out.println(String.format("%f  %d  %s    %s", sd.score, sd.shardIndex, d.get("id"), d.get(TagFields.Content)));
        }
    }
}
