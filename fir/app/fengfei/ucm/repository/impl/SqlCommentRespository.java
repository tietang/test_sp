package fengfei.ucm.repository.impl;

import java.sql.SQLException;
import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.CommentDao;
import fengfei.ucm.dao.PhotoDao;
import fengfei.ucm.dao.RankDao;
import fengfei.ucm.entity.photo.Comment;
import fengfei.ucm.entity.photo.PhotoAccess.AccessType;
import fengfei.ucm.repository.CommentRepository;
import fengfei.ucm.repository.UserRepository;

public class SqlCommentRespository implements CommentRepository {

    UserRepository userRepository = new SqlUserRepository();

    @Override
    public boolean addOne(final Comment m) throws DataAccessException {
        try {

            long id = m.getIdUser();
            int updated = Transactions.execute(
                PhotoUnitName,
                new Long(id),
                Function.Write,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        RankDao.updateRank(
                            grower,
                            suffix,
                            m.idPhoto,
                            m.idUser,
                            AccessType.Comment,
                            1);
                        PhotoDao.incrCommentCount(grower, suffix, m.idPhoto);
                        return CommentDao.addOne(grower, suffix, m);
                    }

                });

            return updated > 0;
        } catch (Exception e) {
            throw new DataAccessException("add Comment error.", e);
        }
    }

    @Override
    public List<Comment> select(
        final long idPhoto,
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<Comment> cms = Transactions.execute(
                PhotoUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<Comment>>() {

                    @Override
                    public List<Comment> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        return CommentDao.select(grower, suffix, idPhoto, idUser, offset, limit);
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select comment error.", e);
        }

    }

    @Override
    public List<Comment> selectForSorted(
        final long idPhoto,
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<Comment> cms = Transactions.execute(
                PhotoUnitName,
                new Long(idPhoto),
                Function.Read,
                new TaCallback<List<Comment>>() {

                    @Override
                    public List<Comment> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        return CommentDao.select(grower, suffix, idPhoto, idUser, offset, limit);
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select comment error.", e);
        }
    }

}
