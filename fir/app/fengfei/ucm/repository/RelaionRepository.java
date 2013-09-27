package fengfei.ucm.repository;

import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.relation.State;

import java.util.List;

public interface RelaionRepository extends UnitNames {

    boolean write(long sourceId, long targetId, State state) throws Exception;

    List<Long> findTargets(long sourceId, State state) throws Exception;

    List<Long> findSources(long targetId, State state, int offset, int limit)
        throws Exception;

    List<Long> findTargets(long sourceId, State state, int offset, int limit)
        throws Exception;

    List<Long> findSources(long targetId, State state) throws Exception;

    int computeSourceCount(long targetId, State state) throws Exception;

    int computeTargetCount(long sourceId, State state) throws Exception;

    int countTarget(long sourceId, State state) throws Exception;

    int countSource(long targetId, State state) throws Exception;

    boolean isFollow(final long sourceId, final long targetId, final State state)
        throws Exception;

    int[] count(long sourceId) throws Exception;

    int[] computeCount(long sourceId) throws Exception;
}
