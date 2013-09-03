package fengfei.ucm.dao;

import java.sql.SQLException;

import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.sprucy.AppConstants;
import fengfei.ucm.dao.transducer.IntegerTransducer;

public class UserConfigDao {

	final static String Insert = "insert into user_config%s(id_user,%s) values(?,?)";
	final static String Update = "update user_config%s set %s=%s+? where id_user=?";
	final static String SelectForLock = "select id_user from user_config%s where id_user=?";
	final static String SelectOne = "select %s from user_config%s where id_user=? ";

	public static int updateDirLimit(ForestGrower grower, String suffix,
			Integer idUser, int value) throws SQLException {
		return incrInt(grower, suffix, "dir_size", idUser, value);

	}

	public static int incrInt(ForestGrower grower, String suffix, String field,
			Integer idUser, int value) throws SQLException {
		Integer oldIdUser = grower.selectOne(
				String.format(SelectForLock, suffix), new IntegerTransducer(),
				idUser);
		if (oldIdUser == null) {
			int updated = grower.update(String.format(Insert, suffix, field),
					idUser, value < 0 ? 0 : 1);
			return updated;
		} else {
			int updated = grower.update(
					String.format(Update, suffix, field, field), value, idUser);
			return updated;
		}

	}

	public static Integer getIntValue(ForestGrower grower, String suffix,
			String field, Integer idUser) throws SQLException {
		Integer value = grower.selectOne(
				String.format(SelectOne, field, suffix),
				new IntegerTransducer(), idUser);
		return value;
	}

	public static int getDirLimit(ForestGrower grower, String suffix,
			Integer idUser) throws SQLException {
		Integer limit = getIntValue(grower, suffix, "dir_size", idUser);
		return limit == null ? 0 : limit;
	}
}
