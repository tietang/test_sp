package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.Photo;
import fengfei.ucm.entity.photo.PhotoAccess;
import fengfei.ucm.entity.photo.Popular;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.photo.Refresh;
import fengfei.ucm.entity.photo.Upcoming;

public interface ShowRepository extends UnitNames {

    public final static long RefreshKey = 1l;

    public List<Rank> selectUserPhotos(final Integer idUser, final int offset, final int limit)
        throws DataAccessException;

    public Rank getUserRank(final Integer idUser) throws DataAccessException;

    List<Refresh> refreshed(final Byte category, int offset, int limit) throws DataAccessException;

    List<Choice> choiced(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Rank> upcomed(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Rank> popular(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Refresh> categorized(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Rank> selectRanks(final List<Long> idPhotos) throws DataAccessException;

    List<Rank> pop(final int offset, final int limit) throws DataAccessException;

    Photo get(final long idPhoto, final Integer idUser) throws DataAccessException;

    //

    List<Favorite> selectFavorites(Integer idUser, int offset, int limit)
        throws DataAccessException;

    List<Favorite> selectFavorites(String username, int offset, int limit)
        throws DataAccessException;

    List<Favorite> selectFavoritesByIP(final int iip, final int offset, final int limit)
        throws DataAccessException;

    List<PhotoAccess> selectPhotoAccesses(Integer idUser, int offset, int limit)
        throws DataAccessException;

    List<PhotoAccess> selectPhotoAccesses(String username, int offset, int limit)
        throws DataAccessException;

    List<PhotoAccess> selectPhotoViewsByUserId(
        final Integer idUser,
        final int offset,
        final int limit) throws DataAccessException;

    List<PhotoAccess> selectPhotoViewsByIP(final int iip, final int offset, final int limit)
        throws DataAccessException;
    // List<PhotoAccess> selectPhotoAccesses( int offset, int limit)
    // throws DataAccessException;

}
