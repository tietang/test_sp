package fengfei.ucm.repository.impl;

import com.google.common.collect.ListMultimap;
import fengfei.fir.model.Notify;
import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.CameraDao;
import fengfei.ucm.dao.UserConfigDao;
import fengfei.ucm.dao.UserNotifyDao;
import fengfei.ucm.dao.UserSocialDao;
import fengfei.ucm.entity.profile.Camera;
import fengfei.ucm.entity.profile.UserSocial;
import fengfei.ucm.repository.ProfileRepository;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SqlProfileRepository implements ProfileRepository {

    @Override
    public boolean addCamera(final List<Camera> models, final int idUser) throws DataAccessException {
        try {

            int updated = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<Integer>() {

                        @Override
                        public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            CameraDao.deleteByUser(grower, suffix, idUser);
                            // for (final Camera m : models) {
                            //
                            // CameraDao.addOne(grower, suffix, m);
                            // }

                            CameraDao.add(grower, suffix, models);
                            return 1;
                        }

                    });

            return updated > 0;
        } catch (Exception e) {
            throw new DataAccessException("add camera error.", e);
        }

    }

    @Override
    public boolean addOneCamera(final Camera m) throws DataAccessException {
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
                            return CameraDao.addOne(grower, suffix, m);
                        }

                    });

            return updated > 0;
        } catch (Exception e) {
            throw new DataAccessException("add camera error.", e);
        }

    }

    @Override
    public List<Camera> selectCameras(final int idUser) throws DataAccessException {
        try {

            List<Camera> cms = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Read,
                    new TaCallback<List<Camera>>() {

                        @Override
                        public List<Camera> execute(ForestGrower grower, String suffix)
                                throws SQLException {
                            suffix = "";
                            return CameraDao.select(grower, suffix, idUser);
                        }

                    });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select camera error.", e);
        }
    }

    @Override
    public List<Camera> selectCamerasForSorted(final int idUser) throws DataAccessException {
        try {

            List<Camera> cms = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Read,
                    new TaCallback<List<Camera>>() {

                        @Override
                        public List<Camera> execute(ForestGrower grower, String suffix)
                                throws SQLException {
                            suffix = "";
                            return CameraDao.select(grower, suffix, idUser);
                        }

                    });

            Collections.sort(cms, new Comparator<Camera>() {

                @Override
                public int compare(Camera o1, Camera o2) {

                    return o1.getType().compareToIgnoreCase(o2.getType());
                }
            });
            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select camera error.", e);
        }
    }

    @Override
    public ListMultimap<String, Camera> selectCamerasGroup(final int idUser) throws DataAccessException {
        try {

            ListMultimap<String, Camera> cms = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Read,
                    new TaCallback<ListMultimap<String, Camera>>() {

                        @Override
                        public ListMultimap<String, Camera>
                        execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            return CameraDao.selectGroup(grower, suffix, idUser);
                        }

                    });

            return cms;
        } catch (Exception e) {
            throw new DataAccessException("select camera error.", e);
        }
    }

    @Override
    public boolean saveNotifies(final Integer idUser, final List<Notify> notifies) throws DataAccessException {
        try {

            int updated = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<Integer>() {
                        @Override
                        public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            int updated = UserNotifyDao.writeNotify(grower, suffix, idUser, notifies);
                            return updated;
                        }

                    });

            return updated > 0;
        } catch (Exception e) {
            throw new DataAccessException("save notifications error.", e);
        }
    }

    @Override
    public long getNotifyValue(final Integer idUser) throws DataAccessException {
        try {

            Long value = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<Long>() {
                        @Override
                        public Long execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            long value = UserNotifyDao.getNotify(grower, suffix, idUser);
                            return value;
                        }

                    });

            return value;
        } catch (Exception e) {
            throw new DataAccessException("get notifications error.", e);
        }
    }

    @Override
    public boolean saveDefaultLicense(final Integer idUser, final byte license) throws DataAccessException {
        try {

            boolean value = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<Boolean>() {
                        @Override
                        public Boolean execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            Integer value = UserConfigDao.setValue(grower, suffix, "license", idUser, license);
                            return value > 0;
                        }

                    });

            return value;
        } catch (Exception e) {
            throw new DataAccessException("get notifications error.", e);
        }
    }

    @Override
    public byte getDefaultLicense(final Integer idUser) throws DataAccessException {
        try {

            Byte value = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<Byte>() {
                        @Override
                        public Byte execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            Integer value = UserConfigDao.getIntValue(grower, suffix, "license", idUser);
                            return value == null ? 0 : value.byteValue();
                        }

                    });

            return value;
        } catch (Exception e) {
            throw new DataAccessException("get notifications error.", e);
        }
    }

    @Override
    public int saveUserSocial(final UserSocial userSocial) throws DataAccessException {
        try {

            Integer value = Transactions.execute(
                    PhotoUnitName,
                    new Long(userSocial.idUser),
                    Function.Write,
                    new TaCallback<Integer>() {
                        @Override
                        public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            Integer value = UserSocialDao.save(grower, suffix, userSocial);
                            return value;
                        }

                    });

            return value;
        } catch (Exception e) {
            throw new DataAccessException("save UserSocial error.", e);
        }
    }

    @Override
    public UserSocial getUserSocial(final Integer idUser) throws DataAccessException {
        try {

            UserSocial value = Transactions.execute(
                    PhotoUnitName,
                    new Long(idUser),
                    Function.Write,
                    new TaCallback<UserSocial>() {
                        @Override
                        public UserSocial execute(ForestGrower grower, String suffix) throws SQLException {
                            suffix = "";
                            UserSocial value = UserSocialDao.get(grower, suffix, idUser);
                            return value;
                        }

                    });

            return value;
        } catch (Exception e) {
            throw new DataAccessException("get UserSocial error.", e);
        }
    }
}
