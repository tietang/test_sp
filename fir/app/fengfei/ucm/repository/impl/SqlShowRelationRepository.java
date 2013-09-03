package fengfei.ucm.repository.impl;

import java.sql.SQLException;
import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.PhotoFavoriteDao;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.PhotoInfo;
import fengfei.ucm.repository.PhotoRepository;
import fengfei.ucm.repository.ShowRelationRepository;
import fengfei.ucm.repository.UserRepository;

public class SqlShowRelationRepository implements ShowRelationRepository {

    UserRepository userRepository = new SqlUserRepository();
    PhotoRepository photoRepository = new SqlPhotoRepository();

    @Override
    public List<PhotoInfo> folllowingPhoto(int idUser, int offset, int row)
        throws DataAccessException {

        return null;
    }

}
