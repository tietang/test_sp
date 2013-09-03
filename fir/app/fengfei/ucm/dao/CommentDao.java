package fengfei.ucm.dao;

import java.sql.SQLException;
import java.util.List;

import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.ucm.dao.transducer.CommentTransducer;
import fengfei.ucm.entity.photo.Comment;

public class CommentDao {

    final static String Insert = "INSERT INTO photo_comments%s(id_photo, content, id_user, user_nice_name,ip, create_at, "
            + "create_at_gmt, disabled, id_user_reply, id_parent)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";

    public static int addOne(ForestGrower grower, String suffix, Comment m) throws SQLException {

        String insert = String.format(Insert, suffix);
        int updated = grower.update(
            insert,
            m.idPhoto,
            m.content,
            m.idUser,
            m.niceName,
            m.ip,
            m.createAt,
            m.createAtGmt,
            Comment.Approved,
            m.idUserReply,
            m.idParent);
        return updated;

    }

    final static String Select = "SELECT id_comment, id_photo, content, id_user,user_nice_name, ip, create_at, create_at_gmt,  disabled, id_user_reply, id_parent "
            + " FROM photo_comments%s where id_photo=? and id_user=? ORDER BY id_comment desc  limit ?,?";

    public static List<Comment> select(
        ForestGrower grower,
        String suffix,
        long idPhoto,
        Integer idUser,
        int offset,
        int limit) throws SQLException {
        List<Comment> comments = grower.select(
            String.format(Select, suffix),
            new CommentTransducer(),
            idPhoto,
            idUser,
            offset,
            limit);
        return comments;
    }
}
