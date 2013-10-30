package fengfei.ucm.dao;

import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.ucm.dao.transducer.TagTransducer;
import fengfei.ucm.entity.photo.Tag;
import fengfei.ucm.entity.photo.Tag.TagType;

import java.sql.SQLException;
import java.util.List;

public class PhotoSearchDao {

    final static String Insert = "INSERT INTO photo_search(keyword) VALUES (?)";
    final static String Delete = "DELETE FROM photo_search WHERE id = ?";
    final static String SelectExists = "SELECT id_search FROM photo_search WHERE keyword = ?";
    final static String InsertRelation="INSERT INTO photo_search_relation%s(id_search,id_target) values(?,?)";
    final static String DeleteRelation="delete from photo_search_relation%s where id_target=?";

    public static int saveKeywords(
        ForestGrower grower,
        String suffix,
        long idTarget,
        String... keywords) throws SQLException {

        int deleted = grower.update(String.format(DeleteRelation, suffix), idTarget);
        for (int i = 0; i < keywords.length; i++) {

        }

        return 1;
    }

    public static int saveTag(
        ForestGrower grower,
        String suffix,
        long idContent,
        TagType type,
        String tag) throws SQLException {
   
        int inserted = grower.update(String.format(Insert, suffix), idContent, tag, type );

        return 1;
    }

    public static List<Tag> find(
        ForestGrower grower,
        String suffix,
        String name,
        String type,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT id_tag, id, name, type FROM tags where name = ? and type=? limit ?,?";
        List<Tag> tags = grower.select(sql, new TagTransducer(), name, type, offset, limit);
        return tags;
    }

    public static List<Tag> find(
        ForestGrower grower,
        String suffix,
        String name,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT id_tag, id, name, type FROM tags where name = ? limit ?,? ";
        List<Tag> tags = grower.select(sql, new TagTransducer(), name, offset, limit);
        return tags;
    }
}
