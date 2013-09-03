package fengfei.ucm.repository.impl;

import java.util.List;
import java.util.Set;

import fengfei.fir.rank.LastRank;
import fengfei.fir.rank.PopularRank;
import fengfei.fir.rank.UpcomingRank;
import fengfei.forest.database.DataAccessException;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.photo.Refresh;
import fengfei.ucm.repository.PhotoShowRepository;

public class RedisPhotoShowRepository implements PhotoShowRepository {

    PopularRank pop = new PopularRank();
    LastRank last = new LastRank();
    UpcomingRank upcoming = new UpcomingRank();

    @Override
    public List<Refresh> refreshed(Byte category, int offset, int limit)
        throws DataAccessException {
        Set<String> ids = last.find(offset, limit);
        return null;
    }

    @Override
    public List<Choice> choiced(Byte category, int offset, int limit) throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Rank> upcomed(Byte category, int offset, int limit) throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Rank> popular(Byte category, int offset, int limit) throws DataAccessException {
        // TODO Auto-generated method stub
        return null;
    }

}
