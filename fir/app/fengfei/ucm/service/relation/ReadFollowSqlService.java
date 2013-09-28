package fengfei.ucm.service.relation;

import fengfei.ucm.entity.relation.State;
import fengfei.ucm.repository.RelaionRepository;
import fengfei.ucm.service.ReadFollowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ReadFollowSqlService implements ReadFollowService {

    static Logger logger = LoggerFactory.getLogger(ReadFollowSqlService.class);
    private RelaionRepository repository;

    public ReadFollowSqlService(RelaionRepository repository) {
        super();
        this.repository = repository;

    }

    @Override
    public List<Long> findTargets(ArrayList<Object> results, long sourceId)
        throws Exception {
        return repository.findTargets(sourceId, State.Normal);
    }

    @Override
    public List<Long> findTargets(ArrayList<Object> results, long sourceId, int offset, int limit)
        throws Exception {
        return repository.findTargets(sourceId, State.Normal, offset, limit);
    }

    @Override
    public int computeTargetCount(ArrayList<Object> results, long sourceId)
        throws Exception {
        return repository.computeTargetCount(sourceId, State.Normal);
    }

    @Override
    public int countTarget(ArrayList<Object> results, long sourceId) throws Exception {
        return repository.countTarget(sourceId, State.Normal);
    }

    @Override
    public List<Long> findSources(ArrayList<Object> results, long targetId)
        throws Exception {
        return repository.findSources(targetId, State.Normal);
    }

    @Override
    public List<Long> findSources(ArrayList<Object> results, long targetId, int offset, int limit)
        throws Exception {
        return repository.findSources(targetId, State.Normal, offset, limit);
    }

    @Override
    public int computeSourceCount(ArrayList<Object> results, long targetId)
        throws Exception {
        return repository.computeSourceCount(targetId, State.Normal);
    }

    @Override
    public int countSource(ArrayList<Object> results, long targetId) throws Exception {
        return repository.countSource(targetId, State.Normal);
    }

    @Override
    public int[] count(ArrayList<Object> results, long sourceId) throws Exception {
        return repository.count(sourceId);

    }

    @Override
    public int[] computeCount(ArrayList<Object> results, long sourceId) throws Exception {
        return repository.computeCount(sourceId);
    }

    @Override
    public boolean isFollow(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception {
        return repository.isFollow(sourceId, targetId, State.Normal);
    }

}
