package fengfei.fir.search.lucene;

import demo.analysis.CommaAnalyzer;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import java.io.File;
import java.io.IOException;

/**
 */
public class TagIndexCreator {
    /**
     * 索引优化后文件段的数量，数量越大，优化效率越大
     */
    private final static int DEFAULT_MAX_NUM_SEGMENTS = 3;
    /**
     * 低版本的查询索引存活周期
     */
    private final static long STALE_INDEXREADER_SURVIVAL_TIME = 60000;

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
         * mmseg4j：ComplexAnalyzer 适用于高匹配度的中文 lucene标准：StandardAnalyzer
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
        IndexWriter writer = new IndexWriter(FSDirectory
                .open(getIndexFile(dir)), conf);
        return writer;
    }

    private Analyzer getAnalyzer() {
        Analyzer analyzer = new CommaAnalyzer(Version.LUCENE_45);
        return analyzer;
    }

    private File getIndexFile(String dir) {
        final File docDir = new File(dir);
        if (!docDir.exists()) {
            docDir.mkdirs();
        }
        return docDir;

    }


    /**
     * 添加的方法
     */
    public void add(long id, String content) {
        try {

            Document doc = new Document();
            doc.add(new StringField("id", String.valueOf(id), Field.Store.YES));
            doc.add(new TextField("content", content, Field.Store.YES));//存储
            writer.addDocument(doc);//添加进写入流里
            writer.forceMerge(1);//优化压缩段,大规模添加数据的时候建议，少使用本方法，会影响性能
            writer.commit();//提交数据
            System.out.println("添加成功");
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (writer != null) {
                try {
                    writer.close();//关闭流
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        }

    }


    /**
     * 删除方法
     *
     * @param id 根据ID删除
     */
    public void delete(String id) {
        try {

            Query q = new TermQuery(new Term("id", id));
            writer.deleteDocuments(q);//删除指定ID的Document
            // writer.forceMerge(DEFAULT_MAX_NUM_SEGMENTS);
            writer.commit();//提交
            writer.close();//关闭
            System.out.println("删除id为" + id + "的记录成功");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据ID进行更行的方法
     */
    public void updateByID(String indexPath, String id, String content) throws IOException {
        try {
            Document doc = new Document();
            doc.add(new StringField("id", id, Field.Store.YES));
            doc.add(new TextField("content", content, Field.Store.YES));//存储

            writer.updateDocument(new Term("id", id), doc);

            writer.commit();

            System.out.println("更新成功!");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            writer.close();//关闭
        }
    }


}
