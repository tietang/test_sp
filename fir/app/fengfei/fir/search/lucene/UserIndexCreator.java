package fengfei.fir.search.lucene;

import fengfei.sprucy.AppConstants;
import fengfei.ucm.entity.profile.User;
import fengfei.ucm.entity.profile.UserPwd;
import org.apache.lucene.document.*;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;

import java.io.IOException;

/**
 */
public class UserIndexCreator {
    LuceneFactory factory;


    public UserIndexCreator(LuceneFactory factory) {
        this.factory = factory;
    }


    /**
     * 添加的方法
     */
    public void add(UserPwd user) throws Exception {
        try {
            Document doc = toDocument(user);
            this.factory.getWriter().addDocument(doc);//添加进写入流里
            this.factory.getWriter().forceMerge(1);//优化压缩段,大规模添加数据的时候建议，少使用本方法，会影响性能
            this.factory.getWriter().commit();//提交数据
        } catch (Exception e) {
            e.printStackTrace();
            this.factory.getWriter().rollback();
        }
    }

    protected Document toDocument(UserPwd user) throws Exception {
        Document doc = new Document();

        String content = toContent(user);
        doc.add(new StringField(UserFields.ID, String.valueOf(user.idUser), Field.Store.YES));
        doc.add(new TextField(UserFields.Content, content, Field.Store.YES));//存储
        doc.add(new NumericDocValuesField(UserFields.At, user.createAt));//存储
        return doc;
    }

    private String toContent(UserPwd user) {
        StringBuilder sb = new StringBuilder();
        sb.append(user.userName).append(AppConstants.CommaSeparator)
                .append(user.email).append(AppConstants.CommaSeparator);
        if (user instanceof User) {
            User u = (User) user;
            if (u.getNiceName() != null) sb.append(u.getNiceName()).append(AppConstants.CommaSeparator);
            if (u.getRealName() != null) sb.append(u.getRealName()).append(AppConstants.CommaSeparator);
//            sb.append(((User) user).getGender())


        }
        return sb.toString();

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
    public void updateByID(UserPwd user) throws IOException {
        try {
            Document doc = toDocument(user);
            this.factory.getWriter().updateDocument(new Term("id", String.valueOf(user.idUser)), doc);
            this.factory.getWriter().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
