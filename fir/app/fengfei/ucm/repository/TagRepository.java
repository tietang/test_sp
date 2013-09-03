package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Comment;
import fengfei.ucm.entity.photo.Tag;
import fengfei.ucm.entity.photo.Tag.TagType;

public interface TagRepository extends UnitNames {

    boolean addTags(long idContent, TagType type, String... tags) throws DataAccessException;

    List<Tag> select(String name, String type, int offset, int limit) throws DataAccessException;

    List<Tag> select(String name, int offset, int limit) throws DataAccessException;

}
