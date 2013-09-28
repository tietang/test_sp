package fengfei.ucm.service;

import fengfei.ucm.dao.UnitNames;

import java.util.ArrayList;

public interface WriteFollowService extends UnitNames {

    boolean add(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception;

    boolean remove(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception;

}
