package fengfei.ucm.repository.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.PhotoAccessDao;
import fengfei.ucm.dao.PhotoFavoriteDao;
import fengfei.ucm.dao.RankDao;
import fengfei.ucm.dao.ShowDao;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.Photo;
import fengfei.ucm.entity.photo.PhotoAccess;
import fengfei.ucm.entity.photo.Popular;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.photo.Refresh;
import fengfei.ucm.entity.photo.Upcoming;
import fengfei.ucm.entity.profile.UserPwd;
import fengfei.ucm.repository.PhotoExtRepository;
import fengfei.ucm.repository.ShowRepository;

public class SqlShowRepository implements ShowRepository {

    SqlUserRepository userRepository = new SqlUserRepository();

    @Override
    public List<Rank> selectUserPhotos(final Integer idUser, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Rank> photos = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<Rank>>() {

                    @Override
                    public List<Rank> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Rank> res = RankDao.selectUserTotalRank(
                            grower,
                            suffix,
                            idUser,
                            offset,
                            limit);

                        //
                        return res;
                    }

                });

            return photos;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Rank> pop(final int offset, final int limit) throws DataAccessException {
        try {

            List<Rank> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Rank>>() {

                    @Override
                    public List<Rank> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Rank> res = RankDao.popRank(grower, suffix, offset, limit);

                        //
                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    private Map<Long, Map<String, Object>> toMap(List<Map<String, Object>> photos) {
        Map<Long, Map<String, Object>> maps = new HashMap<Long, Map<String, Object>>();
        for (Map<String, Object> map : photos) {
            Long id = MapUtils.getLong(maps, "id_photo");
            maps.put(id, map);
        }
        return maps;
    }

    @Override
    public List<Refresh> refreshed(final Byte category, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Refresh> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Refresh>>() {

                    @Override
                    public List<Refresh> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Refresh> res = ShowDao.pagedRefreshPhoto(
                            grower,
                            suffix,
                            category,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Rank> popular(final Byte category, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Rank> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Rank>>() {

                    @Override
                    public List<Rank> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Rank> res = ShowDao.pagedPopularPhoto(
                            grower,
                            suffix,
                            category,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Choice> choiced(final Byte category, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Choice> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Choice>>() {

                    @Override
                    public List<Choice> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Choice> res = ShowDao.pagedChoicePhoto(
                            grower,
                            suffix,
                            category,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Rank> upcomed(final Byte category, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Rank> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Rank>>() {

                    @Override
                    public List<Rank> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Rank> res = ShowDao.pagedUpcomingPhoto(
                            grower,
                            suffix,
                            category,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Refresh> categorized(final Byte category, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Refresh> cms = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Refresh>>() {

                    @Override
                    public List<Refresh> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Refresh> res = ShowDao.pagedCategoryPhoto(
                            grower,
                            suffix,
                            category,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }

    }

    @Override
    public List<Rank> selectRanks(final List<Long> idPhotos) throws DataAccessException {
        try {

            List<Rank> ranks = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Read,
                new TaCallback<List<Rank>>() {

                    @Override
                    public List<Rank> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Rank> ranks = RankDao.selectTotalRank(grower, suffix, idPhotos);

                        return ranks;
                    }

                });

            return ranks;
        } catch (Exception e) {
            throw new DataAccessException("select rank error.", e);
        }

    }

    @Override
    public Photo get(final long idPhoto, final Integer idUser) throws DataAccessException {
        try {

            Photo photo = Transactions.execute(
                UserUnitName,
                RefreshKey,
                Function.Write,
                new TaCallback<Photo>() {

                    @Override
                    public Photo execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        return ShowDao.getPhoto(grower, suffix, idPhoto, idUser);
                    }

                });

            return photo;
        } catch (Exception e) {
            throw new DataAccessException("select photo  error.", e);
        }
    }

    @Override
    public Rank getUserRank(final Integer idUser) throws DataAccessException {
        try {

            Rank rank = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Write,
                new TaCallback<Rank>() {

                    @Override
                    public Rank execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = "";
                        return RankDao.getUserTotalRank(grower, suffix, idUser);
                    }

                });

            return rank;
        } catch (Exception e) {
            throw new DataAccessException("get user rank error.", e);
        }
    }

    @Override
    public List<Favorite> selectFavorites(final Integer idUser, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Favorite> cms = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<Favorite>>() {

                    @Override
                    public List<Favorite> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Favorite> res = PhotoFavoriteDao.selectFavoritesByUser(
                            grower,
                            suffix,
                            idUser,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select Favorite error.", e);
        }
    }

    @Override
    public List<Favorite> selectFavoritesByIP(final int iip, final int offset, final int limit)
        throws DataAccessException {
        try {

            List<Favorite> cms = Transactions.execute(
                UserUnitName,
                new Long(iip),
                Function.Read,
                new TaCallback<List<Favorite>>() {

                    @Override
                    public List<Favorite> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<Favorite> res = PhotoFavoriteDao.selectFavoritesByIP(
                            grower,
                            suffix,
                            iip,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select Favorite error.", e);
        }
    }

    @Override
    public List<Favorite> selectFavorites(String username, final int offset, final int limit)
        throws DataAccessException {

        UserPwd up = userRepository.getUserPwd(username);
        return selectFavorites(up.idUser, offset, limit);
    }

    @Override
    public List<PhotoAccess> selectPhotoAccesses(
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<PhotoAccess> cms = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<PhotoAccess>>() {

                    @Override
                    public List<PhotoAccess> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<PhotoAccess> res = PhotoAccessDao.selectPhotoAccessesByUser(
                            grower,
                            suffix,
                            idUser,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select PhotoAccess error.", e);
        }
    }

    @Override
    public
        List<PhotoAccess>
        selectPhotoAccesses(String username, final int offset, final int limit)
            throws DataAccessException {
        UserPwd up = userRepository.getUserPwd(username);
        return selectPhotoAccesses(up.idUser, offset, limit);
    }

    @Override
    public
        List<PhotoAccess>
        selectPhotoViewsByIP(final int iip, final int offset, final int limit)
            throws DataAccessException {
        try {

            List<PhotoAccess> cms = Transactions.execute(
                UserUnitName,
                new Long(iip),
                Function.Read,
                new TaCallback<List<PhotoAccess>>() {

                    @Override
                    public List<PhotoAccess> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<PhotoAccess> res = PhotoAccessDao.selectPhotoViewsByIP(
                            grower,
                            suffix,
                            iip,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select PhotoAccess error.", e);
        }
    }

    @Override
    public List<PhotoAccess> selectPhotoViewsByUserId(
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<PhotoAccess> cms = Transactions.execute(
                UserUnitName,
                new Long(idUser),
                Function.Read,
                new TaCallback<List<PhotoAccess>>() {

                    @Override
                    public List<PhotoAccess> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = "";
                        List<PhotoAccess> res = PhotoAccessDao.selectPhotoViewsByUser(
                            grower,
                            suffix,
                            idUser,
                            offset,
                            limit);

                        return res;
                    }

                });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select PhotoAccess error.", e);
        }
    }
}
