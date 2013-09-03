package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.PhotoSet;

public interface PhotoManageRepository extends UnitNames {

    int saveSet(PhotoSet m) throws DataAccessException;

    int deleteSet(long idSet, Integer idUser) throws DataAccessException;

    List<PhotoSet> selectUserSets(Integer idUser) throws DataAccessException;

    List<Long> selectSetPhoto(long idSet, Integer idUser) throws DataAccessException;

    int addPhotoSets(Integer idUser, long idSet, long idPhoto) throws DataAccessException;

    int deletePhotoSets(Integer idUser, long idPhoto) throws DataAccessException;

    long getPhotoSetId(final long idPhoto, final Integer idUser) throws DataAccessException;

    PhotoSet getPhotoSet(long idPhoto, Integer idUser) throws DataAccessException;
}
