package fengfei.fir.search.lucene;

import fengfei.ucm.entity.photo.Photo;
import org.apache.lucene.document.*;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;

import java.io.IOException;

/**
 */
public class PhotoIndexCreator {
    LuceneFactory factory;


    public PhotoIndexCreator(LuceneFactory factory) {
        this.factory = factory;
    }


    /**
     * 添加的方法
     */
    public void add(Photo photo) throws Exception {
        try {
            Document doc = toDocument(photo);
            this.factory.getWriter().addDocument(doc);//添加进写入流里
            this.factory.getWriter().forceMerge(1);//优化压缩段,大规模添加数据的时候建议，少使用本方法，会影响性能
            this.factory.getWriter().commit();//提交数据
        } catch (Exception e) {
            e.printStackTrace();
            this.factory.getWriter().rollback();
        }
    }

    protected Document toDocument(Photo photo) throws Exception {
        Document doc = new Document();
        String title = AnalyzerUtils.toCommaString(photo.title);
        String desc = AnalyzerUtils.toCommaString(photo.description);
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(desc).append(photo.tags).append(photo.exifToCSV());
        doc.add(new StringField(PhotoFields.ID, String.valueOf(photo.idPhoto), Field.Store.YES));
        doc.add(new TextField(PhotoFields.Content, sb.toString(), Field.Store.NO));//存储
        doc.add(new StringField(PhotoFields.UserIdAndNiceName, photo.idUser + "#" + photo.niceName, Field.Store.YES));//存储
        doc.add(new StringField(PhotoFields.Title, photo.title, Field.Store.YES));//存储
        doc.add(new NumericDocValuesField(PhotoFields.At, photo.updatedAt));//存储
        return doc;
    }

    public void close() throws IOException {
        this.factory.getWriter().close();
    }

    /**
     * 删除方法
     *
     * @param id 根据ID删除
     */
    public void delete(String id) throws IOException {
        try {

            Query q = new TermQuery(new Term("id", id));
            this.factory.getWriter().deleteDocuments(q);//删除指定ID的Document
            // this.factory.getWriter().forceMerge(DEFAULT_MAX_NUM_SEGMENTS);
            this.factory.getWriter().commit();//提交

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
            this.factory.getWriter().updateDocument(new Term("id", String.valueOf(photo.idPhoto)), doc);
            this.factory.getWriter().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String dir = "/opt/lucene/index";
        LuceneFactory luceneFactory=LuceneFactory.get(dir);
        PhotoIndexCreator creator = new PhotoIndexCreator(luceneFactory);
        for (int i = 0; i < 5; i++) {
            Photo photo = new Photo();
            photo.idPhoto = i;
            if (i % 2 == 0) {
                photo.title = "贡嘎" + i;
                photo.tags = "风景";

            } else {
                photo.tags = "贡嘎,丽江,四川";
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

        SearcherLucene searcher = new SearcherLucene(luceneFactory);
        TopDocs tds = searcher.search(null, 100, 1, "贡嘎", "风景");
        out(tds, luceneFactory.getSearcher());

    }

    private static void out(TopDocs tds, IndexSearcher searcher) throws IOException {
        System.out.println("总共有【" + tds.totalHits + "】条匹配结果");
        //6.根据TopDocs获取ScoreDoc对象
        ScoreDoc[] sds = tds.scoreDocs;
        for (ScoreDoc sd : sds) {
            //7.根据searcher和TopDocs对象获取Document对象
            Document d = searcher.doc(sd.doc);//sd.doc:文档内部编号
            //8.根据Document对象获取需要的值
            System.out.println(String.format("%f  %d  %s    %s", sd.score, sd.shardIndex, d.get("id"), d.get(PhotoFields.Content)));
        }
    }
}
