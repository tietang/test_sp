package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.impl.ForestRunner.InsertResultSet;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Photo;
import fengfei.ucm.entity.photo.Rank;

public interface PhotoRepository extends UnitNames {

    List<InsertResultSet<Long>> save(List<Photo> models, final String userName)
        throws DataAccessException;

    InsertResultSet<Long> saveOne(Photo m, final String userName) throws DataAccessException;

    boolean deleteOne(final long idPhoto, final Integer idUser) throws DataAccessException;

    // InsertResultSet<Long> addOne(final Photo m, final String userName) throws
    // DataAccessException;

    int updateOne(final Photo m, final String userName) throws DataAccessException;

    Photo selectOne(long idPhoto, Integer idUser) throws DataAccessException;

    public Photo selectOne(final long idPhoto) throws DataAccessException;

    public Rank getRank(final long idPhoto) throws DataAccessException;

    //
    public Photo view(
        final long idPhoto,
        final Integer photoIdUser,
        final Integer accessIdUser,
        final int iip) throws DataAccessException;

    int vote(
        final long idPhoto,
        final Integer photoIdUser,
        final String photoNiceName,
        final byte photoCategory,
        final Integer accessIdUser,
        final int iip) throws DataAccessException;

    int favorite(
        final long idPhoto,
        final Integer photoIdUser,
        final String photoNiceName,
        final byte photoCategory,
        final Integer accessIdUser,
        final int iip) throws DataAccessException;

    int unfavorite(long idPhoto, final Integer photoIdUser, Integer accessIdUser, final int iip)
        throws DataAccessException;

    boolean isFavorite(long idPhoto, Integer accessIdUser, int iip) throws DataAccessException;

    boolean isVote(long idPhoto, Integer accessIdUser, int iip) throws DataAccessException;
}
