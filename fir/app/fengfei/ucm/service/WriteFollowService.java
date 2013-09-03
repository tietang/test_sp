package fengfei.ucm.service;

import java.util.ArrayList;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;

public interface WriteFollowService extends UnitNames {

    boolean add(ArrayList<Object> results, long sourceId, long targetId)
        throws DataAccessException;

    boolean remove(ArrayList<Object> results, long sourceId, long targetId)
        throws DataAccessException;

}
