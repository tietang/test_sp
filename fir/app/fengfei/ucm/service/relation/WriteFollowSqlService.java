package fengfei.ucm.service.relation;

import fengfei.ucm.entity.relation.State;
import fengfei.ucm.repository.RelaionRepository;
import fengfei.ucm.service.WriteFollowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class WriteFollowSqlService implements WriteFollowService {

    static Logger logger = LoggerFactory.getLogger(WriteFollowSqlService.class);
    private RelaionRepository repository;

    public WriteFollowSqlService(RelaionRepository repository) {
        super();
        this.repository = repository;

    }

    @Override
    public boolean add(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception {
        return repository.write(sourceId, targetId, State.Normal);
    }

    @Override
    public boolean remove(ArrayList<Object> results, long sourceId, long targetId)
        throws Exception {
        return repository.write(sourceId, targetId, State.Removed);
    }

}
