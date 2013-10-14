package fengfei.fir.search.lucene;

import fengfei.ucm.entity.photo.Photo;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
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
    public void add(Photo photo) throws IOException {
        try {
            Document doc = toDocument(photo);
            writer.addDocument(doc);//添加进写入流里
            writer.forceMerge(1);//优化压缩段,大规模添加数据的时候建议，少使用本方法，会影响性能
            writer.commit();//提交数据
        } catch (Exception e) {
            e.printStackTrace();
            writer.rollback();
        } finally {
            if (writer != null) {
                writer.close();//关闭流
            }
        }
    }

    protected Document toDocument(Photo photo) {
        Document doc = new Document();
        doc.add(new StringField(TagFields.ID, String.valueOf(photo.idPhoto), Field.Store.YES));
        doc.add(new TextField(TagFields.Title, photo.title, Field.Store.YES));//存储
        doc.add(new TextField(TagFields.Description, photo.title, Field.Store.YES));//存储
        doc.add(new TextField(TagFields.Exif, photo.title, Field.Store.YES));//存储
        doc.add(new TextField(TagFields.Tag, photo.tags, Field.Store.YES));//存储
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
        } finally {
            writer.close();//关闭
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
        } finally {
            writer.close();//关闭
        }
    }

    public static void main(String[] args) throws IOException {
        TagIndexCreator creator = new TagIndexCreator("/opt/lucene/index");
        for (int i = 0; i < 5; i++) {
            Photo photo = new Photo();
            photo.idPhoto = i;
            photo.title = "贡嘎" + i;
            photo.description = "描述";
            photo.tags = "风景";
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

    }

}
