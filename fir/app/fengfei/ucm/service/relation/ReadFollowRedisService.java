package fengfei.ucm.service.relation;

import java.util.ArrayList;
import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.service.ReadFollowService;

public class ReadFollowRedisService implements ReadFollowService {

    @Override
    public List<Long> findTargets(ArrayList<Object> results, long sourceId)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int computeTargetCount(ArrayList<Object> results, long sourceId)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countTarget(ArrayList<Object> results, long sourceId) throws DataAccessException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Long> findSources(ArrayList<Object> results, long targetId)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int computeSourceCount(ArrayList<Object> results, long targetId)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countSource(ArrayList<Object> results, long targetId) throws DataAccessException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int[] count(ArrayList<Object> results, long sourceId) throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int[] computeCount(ArrayList<Object> results, long sourceId) throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isFollow(ArrayList<Object> results, long sourceId, long targetId)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Long> findTargets(ArrayList<Object> results, long sourceId, int offset, int limit)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Long> findSources(ArrayList<Object> results, long targetId, int offset, int limit)
        throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

}
