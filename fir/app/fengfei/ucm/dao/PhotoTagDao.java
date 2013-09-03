package fengfei.ucm.dao;

import java.sql.SQLException;
import java.util.List;

import fengfei.fir.utils.AppUtils;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.database.dbutils.LongTransducer;
import fengfei.ucm.dao.transducer.PhotoTagTransducer;
import fengfei.ucm.entity.photo.PhotoTag;

public class PhotoTagDao {

    final static String Insert = "INSERT INTO photo_tag%s(id, name, category) VALUES (?,?,?)";
    final static String Delete = "DELETE FROM photo_tag%s WHERE id = ? AND category = ?";
    final static String DeleteALL = "DELETE FROM photo_tag%s WHERE id = ? AND category = ? and name=?";
    final static String SelectOne = "SELECT id FROM photo_tag%s WHERE id = ? AND category = ? and name=?";

    public static int saveTags(
        ForestGrower grower,
        String suffix,
        long idContent,
        byte categry,
        String... tags) throws SQLException {
        int deleted = grower.update(String.format(Delete, suffix), idContent, categry);
        Object[][] params = new Object[tags.length][];
        for (int i = 0; i < tags.length; i++) {
            params[i] = new Object[] { idContent, tags[i], categry };
        }
        int[] inserted = grower.batchUpdate(String.format(Insert, suffix), params);

        return 1;
    }

    public static int saveTag(
        ForestGrower grower,
        String suffix,
        long idContent,
        byte categry,
        String tag) throws SQLException {
        Long id = grower.selectOne(
            String.format(SelectOne, suffix),
            new LongTransducer(),
            idContent,
            categry,
            tag);
        if (id == null) {
            int inserted = grower.update(String.format(Insert, suffix), idContent, tag, categry);
            return inserted;
        } else {
            return 0;
        }

    }

    public static List<PhotoTag> find(
        ForestGrower grower,
        String suffix,
        String name,
        Byte category,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT id_tag, id, name, category FROM tags where name like ? and category=? limit ?,?";
        List<PhotoTag> tags = grower.select(
            sql,
            new PhotoTagTransducer(),
            AppUtils.toLike(name),
            category,
            offset,
            limit);
        return tags;
    }

    public static List<Long> findPhotoIds(
        ForestGrower grower,
        String suffix,
        String name,
        Byte category,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT  id, name FROM tags where name like ? and category=? limit ?,?";
        List<Long> tags = grower.select(
            sql,
            new LongTransducer(),
            AppUtils.toLike(name),
            category,
            offset,
            limit);
        return tags;
    }

    public static List<Long> findPhotoIds(
        ForestGrower grower,
        String suffix,
        String name,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT  id, name FROM tags where name like ? limit ?,?";
        List<Long> tags = grower.select(
            sql,
            new LongTransducer(),
            AppUtils.toLike(name),
            offset,
            limit);
        return tags;
    }

    public static List<PhotoTag> find(
        ForestGrower grower,
        String suffix,
        String name,
        int offset,
        int limit) throws SQLException {
        String sql = "SELECT id_tag, id, name, type FROM tags where name like ? limit ?,? ";
        List<PhotoTag> tags = grower.select(
            sql,
            new PhotoTagTransducer(),
            AppUtils.toLike(name),
            offset,
            limit);
        return tags;
    }

}
