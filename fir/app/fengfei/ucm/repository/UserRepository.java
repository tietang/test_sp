package fengfei.ucm.repository;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.profile.User;
import fengfei.ucm.entity.profile.UserPwd;

@Repository
public interface UserRepository extends UnitNames {

    int addUserPwd(UserPwd userPwd) throws DataAccessException;

    int saveUserPwd(UserPwd userPwd) throws DataAccessException;

    boolean isExists(UserPwd userPwd) throws DataAccessException;

    User getUser(Integer idUser) throws DataAccessException;

    User getUserByUserName(String userName) throws DataAccessException;

    UserPwd getUserPwd(Integer idUser) throws DataAccessException;

    UserPwd getUserPwd(String emailOrName, String pwd) throws DataAccessException;

    public UserPwd getUserPwd(final String userName) throws DataAccessException;

    // /
    int saveUser(User user) throws DataAccessException;

    int updatePassword(Integer idUser, String oldPwd, String newPwd) throws DataAccessException;

    int updateUserById(User user) throws DataAccessException;

    int updateUserByEmail(User user) throws DataAccessException;

    int updateUserByUserName(User user) throws DataAccessException;

    boolean updateHeadPhoto(Integer idUser, boolean isHeadPhoto) throws DataAccessException;

    List<User> selectUserList(final Collection<? extends Number> idUsers)
        throws DataAccessException;

    User getFullUser(final Integer idUser) throws DataAccessException;

    Map<Integer, User> selectUsers(Collection<? extends Number> idUsers)
        throws DataAccessException;
}
