package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Comment;

public interface CommentRepository extends UnitNames {

    boolean addOne(Comment m) throws DataAccessException;

    List<Comment> select(
        final long idPhoto,
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException;

    List<Comment> selectForSorted(long idPhoto, final Integer idUser, int offset, int limit)
        throws DataAccessException;

}
