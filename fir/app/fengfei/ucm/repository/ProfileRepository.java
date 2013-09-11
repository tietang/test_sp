package fengfei.ucm.repository;

import com.google.common.collect.ListMultimap;
import fengfei.fir.model.Notify;
import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.profile.Camera;
import fengfei.ucm.entity.profile.UserSocial;

import java.util.List;

public interface ProfileRepository extends UnitNames {

    boolean addCamera(List<Camera> models, int idUser) throws DataAccessException;

    boolean addOneCamera(Camera m) throws DataAccessException;

    List<Camera> selectCameras(int idUser) throws DataAccessException;

    List<Camera> selectCamerasForSorted(int idUser) throws DataAccessException;

    ListMultimap<String, Camera> selectCamerasGroup(int idUser) throws DataAccessException;

    boolean saveNotifies(Integer idUser,
                         List<Notify> notifies) throws DataAccessException;

    long getNotifyValue(Integer idUser) throws DataAccessException;

    boolean saveDefaultLicense(Integer idUser, byte license) throws DataAccessException;

    byte getDefaultLicense(Integer idUser) throws DataAccessException;

    int saveUserSocial(UserSocial userSocial) throws DataAccessException;

    UserSocial getUserSocial(Integer idUser) throws DataAccessException;
}
