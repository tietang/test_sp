package fengfei.ucm.service;

import fengfei.ucm.dao.UnitNames;

import java.util.ArrayList;
import java.util.List;

public interface ReadFollowService extends UnitNames {

    List<Long> findTargets(ArrayList<Object> results, long sourceId) throws Exception;

    List<Long> findTargets(ArrayList<Object> results, long sourceId, int offset, int limit)
        throws Exception;

    int computeTargetCount(ArrayList<Object> results, long sourceId) throws Exception;

    int countTarget(ArrayList<Object> results, long sourceId) throws Exception;

    List<Long> findSources(ArrayList<Object> results, long targetId) throws Exception;

    List<Long> findSources(ArrayList<Object> results, long targetId, int offset, int limit)
        throws Exception;

    int computeSourceCount(ArrayList<Object> results, long targetId) throws Exception;

    int countSource(ArrayList<Object> results, long targetId) throws Exception;

    int[] count(ArrayList<Object> results, long sourceId) throws Exception;

    int[] computeCount(ArrayList<Object> results, long sourceId) throws Exception;

    boolean isFollow(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception;
}
