package fengfei.ucm.repository.impl;

import java.sql.SQLException;
import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.sprucy.AppConstants;
import fengfei.ucm.dao.CommentDao;
import fengfei.ucm.dao.PhotoSetDao;
import fengfei.ucm.dao.UserConfigDao;
import fengfei.ucm.entity.photo.Comment;
import fengfei.ucm.entity.photo.PhotoSet;
import fengfei.ucm.repository.PhotoManageRepository;

public class SqlPhotoManageRepository implements PhotoManageRepository {

    @Override
    public int saveSet(final PhotoSet m) throws DataAccessException {
        try {

            Integer updated = Transactions.execute(
                UserUnitName,
                new Long(m.idUser),
                Function.Write,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        int size = UserConfigDao.getDirLimit(grower, suffix, m.idUser);
                        if (size >= AppConstants.DirLimit) {
                            return -1;
                        } else {
                            int updated = PhotoSetDao.save(grower, suffix, m);
                            if (updated > 0) {

                                UserConfigDao.updateDirLimit(grower, suffix, m.idUser, 1);
                            }
                            return updated;
                        }

                    }

                });

            return updated;
        } catch (Exception e) {
            throw new DataAccessException("add set error.", e);
        }
    }

    @Override
    public int deleteSet(final long idSet, final Integer idUser) throws DataAccessException {
        try {

            Integer updated = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        int updated = PhotoSetDao.delete(grower, suffix, idSet, idUser);
                        if (updated > 0) {
                            PhotoSetDao.deleteUserPhotoSetsById(grower, suffix, idSet, idUser);
                            UserConfigDao.updateDirLimit(grower, suffix, idUser, -1);
                        }
                        return updated;
                    }

                });

            return updated;
        } catch (Exception e) {
            throw new DataAccessException("delete set error.", e);
        }
    }

    @Override
    public List<PhotoSet> selectUserSets(final Integer idUser) throws DataAccessException {
        try {

            List<PhotoSet> sets = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<PhotoSet>>() {

                    @Override
                    public List<PhotoSet> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        return PhotoSetDao.selectUserSets(grower, suffix, idUser);
                    }

                });

            return sets;
        } catch (Exception e) {
            throw new DataAccessException("select set error.", e);
        }
    }

    @Override
    public List<Long> selectSetPhoto(final long idSet, final Integer idUser)
        throws DataAccessException {
        try {

            List<Long> sets = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<Long>>() {

                    @Override
                    public List<Long> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        return PhotoSetDao.selectSetPhoto(grower, suffix, idSet, idUser);
                    }

                });

            return sets;
        } catch (Exception e) {
            throw new DataAccessException("select sets error.", e);
        }
    }

    @Override
    public int addPhotoSets(final Integer idUser, final long idSet, final long idPhoto)
        throws DataAccessException {
        try {

            Integer updated = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        return PhotoSetDao.addPhotoSets(grower, suffix, idUser, idSet, idPhoto);
                    }

                });

            return updated;
        } catch (Exception e) {
            throw new DataAccessException("add sets error.", e);
        }
    }

    @Override
    public int deletePhotoSets(final Integer idUser, final long idPhoto)
        throws DataAccessException {
        try {

            Integer updated = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        return PhotoSetDao.deletePhotoSets(grower, suffix, idUser, idPhoto);
                    }

                });

            return updated;
        } catch (Exception e) {
            throw new DataAccessException("delete sets error.", e);
        }
    }

    @Override
    public PhotoSet getPhotoSet(final long idPhoto, final Integer idUser)
        throws DataAccessException {
        try {

            PhotoSet ps = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<PhotoSet>() {

                    @Override
                    public PhotoSet execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        return PhotoSetDao.getPhotoSet(grower, suffix, idPhoto, idUser);
                    }

                });

            return ps;
        } catch (Exception e) {
            throw new DataAccessException("delete sets error.", e);
        }
    }

    @Override
    public long getPhotoSetId(final long idPhoto, final Integer idUser) throws DataAccessException {
        try {

            Long ps = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<Long>() {

                    @Override
                    public Long execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        return PhotoSetDao.getPhotoSetId(grower, suffix, idPhoto, idUser);
                    }

                });

            return ps;
        } catch (Exception e) {
            throw new DataAccessException("delete sets error.", e);
        }
    }

}
