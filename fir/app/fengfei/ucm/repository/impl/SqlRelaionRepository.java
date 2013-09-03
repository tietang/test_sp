package fengfei.ucm.repository.impl;

import java.sql.SQLException;
import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.database.dbutils.impl.DefaultForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.PoolableDatabaseResource;
import fengfei.forest.slice.database.utils.MutiTransaction;
import fengfei.forest.slice.database.utils.MutiTransaction.MutiTaCallback;
import fengfei.forest.slice.database.utils.MutiTransaction.TransactionModel;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.RelationDao;
import fengfei.ucm.entity.relation.Relation;
import fengfei.ucm.entity.relation.State;
import fengfei.ucm.repository.RelaionRepository;

public class SqlRelaionRepository implements RelaionRepository {

    final static byte Type = 0;
    final RelationDao dao = RelationDao.get();

    @Override
    public boolean write(long sourceId, long targetId, State state) throws DataAccessException {
        long ctime = System.currentTimeMillis();
        long updatedAt = ctime;
        int createdAt = (int) (ctime / 1000);
        final Relation relation = new Relation(
            sourceId,
            targetId,
            Type,
            state.getCode(),
            updatedAt,
            createdAt);

        try {

            TransactionModel<Integer> sModel = getTransactionModel(
                relation.getSourceId(),
                true,
                new MutiTaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower) throws SQLException {
                        Relation r = index == 1 ? switchRelation(relation) : relation;
                        return dao.write(grower, suffix, r);
                    }
                });
            TransactionModel<Integer> tModel = getTransactionModel(
                relation.getTargetId(),
                false,
                new MutiTaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower) throws SQLException {
                        Relation r = index == 1 ? switchRelation(relation) : relation;
                        return dao.write(grower, suffix, r);
                    }
                });

            MutiTransaction<Integer> transaction = new MutiTransaction<>();
            transaction.addTransactionModel(sModel);
            transaction.addTransactionModel(tModel);
            transaction.execute();
        } catch (Exception e) {
            throw new DataAccessException("write relation error.", e);
        }
        return true;
    }

    private <T> TransactionModel<T> getTransactionModel(
        long id,
        boolean isFoloowing,
        MutiTaCallback<T> callback) throws Exception {
        PoolableDatabaseResource resource = Transactions.get(Relation, id, Function.Write);
        return getTransactionModel(isFoloowing, resource, callback);
    }

    private <T> TransactionModel<T> getTransactionModel(
        boolean isFoloowing,
        PoolableDatabaseResource resource,
        MutiTaCallback<T> callback) throws SQLException {
        ForestGrower grower = new DefaultForestGrower(resource.getConnection());
        String alias = resource.getAlias();
        TransactionModel<T> model = new TransactionModel<>(grower, getFullSuffix(
            alias,
            isFoloowing), callback);
        return model;
    }

    protected String getFullSuffix(String alias, boolean isFoloowing) {
        return alias + (isFoloowing ? "_following" : "_followed");
    }

    @Override
    public List<Long> findTargets(final long sourceId, final State state)
        throws DataAccessException {
        try {

            List<Long> targets = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<List<Long>>() {

                    @Override
                    public List<Long> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.findTargets(grower, suffix, sourceId, state);
                    }

                });
            return targets;
        } catch (Exception e) {
            throw new DataAccessException("find targets error.", e);
        }
    }

    @Override
    public List<Long> findTargets(
        final long sourceId,
        final State state,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<Long> targets = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<List<Long>>() {

                    @Override
                    public List<Long> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.findTargets(grower, suffix, sourceId, state, offset, limit);
                    }

                });
            return targets;
        } catch (Exception e) {
            throw new DataAccessException("find targets error.", e);
        }
    }

    @Override
    public int computeTargetCount(final long sourceId, final State state)
        throws DataAccessException {
        try {

            Integer count = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.computeRelationCount(grower, suffix, sourceId, state);
                    }

                });
            return count;
        } catch (Exception e) {
            throw new DataAccessException("compute to count targets error.", e);
        }
    }

    @Override
    public int countTarget(final long sourceId, final State state) throws DataAccessException {
        try {

            Integer count = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.count(grower, suffix, sourceId, state);
                    }

                });
            return count;
        } catch (Exception e) {
            throw new DataAccessException("count targets error.", e);
        }
    }

    private Relation switchRelation(Relation relation) {

        Relation relationb = relation.deepCopy();
        relationb.setSourceId(relation.getTargetId());
        relationb.setTargetId(relation.getSourceId());

        return relationb;

    }

    @Override
    public List<Long> findSources(final long targetId, final State state)
        throws DataAccessException {
        try {

            List<Long> targets = Transactions.execute(
                Relation,
                targetId,
                Function.Read,
                new TaCallback<List<Long>>() {

                    @Override
                    public List<Long> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.findTargets(grower, suffix, targetId, state);
                    }

                });
            return targets;
        } catch (Exception e) {
            throw new DataAccessException("find sources error.", e);
        }
    }

    @Override
    public List<Long> findSources(
        final long targetId,
        final State state,
        final int offset,
        final int limit) throws DataAccessException {
        try {

            List<Long> targets = Transactions.execute(
                Relation,
                targetId,
                Function.Read,
                new TaCallback<List<Long>>() {

                    @Override
                    public List<Long> execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.findTargets(grower, suffix, targetId, state, offset, limit);
                    }

                });
            return targets;
        } catch (Exception e) {
            throw new DataAccessException("find sources error.", e);
        }
    }

    @Override
    public int computeSourceCount(final long targetId, final State state)
        throws DataAccessException {
        try {

            Integer count = Transactions.execute(
                Relation,
                targetId,
                Function.Read,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = getFullSuffix(suffix, false);
                        return dao.computeRelationCount(grower, suffix, targetId, state);
                    }

                });
            return count;
        } catch (Exception e) {
            throw new DataAccessException("find targets error.", e);
        }
    }

    @Override
    public int countSource(final long targetId, final State state) throws DataAccessException {
        try {

            Integer count = Transactions.execute(
                Relation,
                targetId,
                Function.Read,
                new TaCallback<Integer>() {

                    @Override
                    public Integer execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = getFullSuffix(suffix, false);
                        return dao.count(grower, suffix, targetId, state);
                    }

                });
            return count;
        } catch (Exception e) {
            throw new DataAccessException("count sources error.", e);
        }
    }

    @Override
    public boolean isFollow(final long sourceId, final long targetId, final State state)
        throws DataAccessException {
        try {

            Boolean isFollow = Transactions.execute(
                Relation,
                targetId,
                Function.Read,
                new TaCallback<Boolean>() {

                    @Override
                    public Boolean execute(ForestGrower grower, String suffix) throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        return dao.isFollow(grower, suffix, sourceId, targetId, Type, state);
                    }

                });
            return isFollow;
        } catch (Exception e) {
            throw new DataAccessException("is follow error.", e);
        }
    }

    @Override
    public int[] count(final long sourceId) throws DataAccessException {
        try {

            Integer[] follow = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<Integer[]>() {

                    @Override
                    public Integer[] execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        int following = dao.count(grower, suffix, sourceId, State.Normal);
                        suffix = getFullSuffix(suffix, false);
                        int followed = dao.count(grower, suffix, sourceId, State.Normal);
                        return new Integer[] { following, followed };
                    }

                });

            return new int[] { follow[0], follow[1] };
        } catch (Exception e) {
            throw new DataAccessException("count sources error.", e);
        }

    }

    @Override
    public int[] computeCount(final long sourceId) throws DataAccessException {
        try {

            Integer[] follow = Transactions.execute(
                Relation,
                sourceId,
                Function.Read,
                new TaCallback<Integer[]>() {

                    @Override
                    public Integer[] execute(ForestGrower grower, String suffix)
                        throws SQLException {
                        suffix = getFullSuffix(suffix, true);
                        int following = dao.computeRelationCount(
                            grower,
                            suffix,
                            sourceId,
                            State.Normal);
                        suffix = getFullSuffix(suffix, false);
                        int followed = dao.computeRelationCount(
                            grower,
                            suffix,
                            sourceId,
                            State.Normal);
                        return new Integer[] { following, followed };
                    }

                });

            return new int[] { follow[0], follow[1] };
        } catch (Exception e) {
            throw new DataAccessException("count sources error.", e);
        }

    }

}
