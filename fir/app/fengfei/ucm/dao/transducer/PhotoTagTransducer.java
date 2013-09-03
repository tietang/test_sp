package fengfei.ucm.dao.transducer;

import java.sql.ResultSet;
import java.sql.SQLException;

import fengfei.forest.database.dbutils.Transducer;
import fengfei.ucm.entity.photo.PhotoTag;
import fengfei.ucm.entity.photo.Tag;
import fengfei.ucm.entity.photo.Tag.TagType;

public class PhotoTagTransducer implements Transducer<PhotoTag> {

    @Override
    public PhotoTag transform(ResultSet rs) throws SQLException {
        long idTag = rs.getLong("id_tag");
        long id = rs.getLong("id");
        byte category = rs.getByte("category");
        String name = rs.getString("name");
        PhotoTag tag = new PhotoTag(id, category, name);
        tag.idTag = idTag;
        return tag;

    }
}
