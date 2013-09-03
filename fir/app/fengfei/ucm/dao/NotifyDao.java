package fengfei.ucm.dao;

import java.sql.SQLException;

import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.database.dbutils.LongTransducer;
import fengfei.ucm.entity.profile.NotifyType;

public class NotifyDao {

    final static String InsertNotify = "insert into notice%s(id_user,value) values(?,?)";
    final static String UpdateNotify = "update set value=? where id_user=? ";
    final static String ExsitsNotify = "select value from notice%s where id_user=?";

    public static int writeNotify(
        ForestGrower grower,
        String suffix,
        int idUser,
        boolean isNotify,
        NotifyType type) throws SQLException {
        Long value = grower.selectOne(
            String.format(ExsitsNotify, suffix),
            new LongTransducer(),
            idUser);
        long v = value == null ? 0 : value.longValue();
        if (isNotify) {
            v |= 1 << type.ordinal();
        } else {
            v &= ~(1 << type.ordinal());
        }
        int updated = 0;
        if (value == null) {
            updated = grower.update(String.format(InsertNotify, suffix), v);
        } else {
            updated = grower.update(String.format(UpdateNotify, suffix), v);
        }

        return updated;
    }

    public static long getNotify(ForestGrower grower, String suffix, int idUser)
        throws SQLException {
        Long value = grower.selectOne(
            String.format(ExsitsNotify, suffix),
            new LongTransducer(),
            idUser);
        return value == null ? 0 : value.longValue();

    }

    private static long sy(int index, long v, int value) {
        if (value == 1) {
            v |= 1 << index;
        } else {
            v &= ~(1 << index);
        }
        return v;
    }

    public static void main(String[] args) {
        long s = 0;

        System.out.println(Long.toString(s = sy(23, s, 1), 2));
        System.out.println(Long.toString(s = sy(3, s, 1), 2));
        System.out.println(Long.toString(s = sy(3, s, 0), 2));
        System.out.println(Long.toString(s = sy(4, s, 1), 2));
        System.out.println(Long.toString(s = sy(5, s, 0), 2));

    }
}
