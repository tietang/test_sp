package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.PhotoInfo;

public interface ShowRelationRepository extends UnitNames {

    List<PhotoInfo> folllowingPhoto(int idUser, int offset, int row) throws DataAccessException;

}
