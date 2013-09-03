package fengfei.ucm.repository;

import java.util.List;

import fengfei.fir.model.PhotoShow;
import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Photo;
import fengfei.ucm.entity.profile.User;

public interface SearchRespository extends UnitNames {

    <T extends PhotoShow> List<T> selectPhotosByTag(
        String qstr,
        Byte category,
        int offset,
        int limit) throws DataAccessException;

    <T extends PhotoShow> List<T> selectPhotos(String qstr, Byte category, int offset, int limit)
        throws DataAccessException;

    List<User> selectUsers(String qstr, int offset, int limit) throws DataAccessException;

}
