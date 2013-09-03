package fengfei.ucm.dao;

import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;

public class Sequence {

    final static String SequenceUnitName = "Sequence";
    final static AtomicInteger nextSeq = new AtomicInteger();

    public static long next(final String table) throws DataAccessException {

        try {
            final long seed = nextSeq.getAndIncrement();
            long id = Transactions.execute(
                SequenceUnitName,
                new Long(seed),
                Function.Write,
                new TaCallback<Long>() {

                    @Override
                    public Long execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = String.valueOf(seed % 2 + 1);
                        return SequenceDao.nextIdFromSequenceTable(grower, suffix, table);
                    }

                });

            return id;
        } catch (Exception e) {
            throw new DataAccessException("get next seq error.", e);
        }
    }

    public static boolean install(final long id, final String... tables)
        throws DataAccessException {

        try {
            boolean created = Transactions.execute(
                SequenceUnitName,
                new Long(id),
                Function.Write,
                new TaCallback<Boolean>() {

                    @Override
                    public Boolean execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = String.valueOf(id % 2 + 1);
                        int[] i = SequenceDao.createSequenceTable(grower, suffix,id, tables);
                        return true;
                    }

                });

            return created;
        } catch (Exception e) {
            throw new DataAccessException("install seq error.", e);
        }
    }
}
