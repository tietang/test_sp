package fengfei.ucm.repository.impl;

import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Refresh;
import org.apache.sanselan.formats.jpeg.segments.APPNSegment;

import fengfei.fir.rank.LastRank;
import fengfei.fir.rank.PopularRank;
import fengfei.fir.rank.UpcomingRank;
import fengfei.forest.database.DataAccessException;
import fengfei.sprucy.AppConstants;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.repository.PhotoExtRepository;

public class RedisPhotoExtRepository implements PhotoExtRepository {

    PopularRank pop = new PopularRank();
    LastRank last = new LastRank();
    UpcomingRank upcoming = new UpcomingRank();

    @Override
    public long updateUpcoming(Rank rank) throws DataAccessException {
        if (rank.score >= AppConstants.UpcomingMinScore
                && rank.score < AppConstants.UpcomingMaxScore) {
            return upcoming.add(rank.idPhoto, rank.score);
        }
        return 0;
    }

    @Override
    public long deletePopular(Rank rank) throws DataAccessException {
        if (rank.score < rank.maxScore && rank.score < AppConstants.PopularMinScore) {
            return pop.removeSinking();
        }
        return 0;
    }

    @Override
    public long updatePopular(Rank rank) throws DataAccessException {
        if (rank.score >= AppConstants.PopularMinScore) {
            return pop.add(rank.idPhoto, rank.score);
        }
        return 0;
    }

    @Override
    public int addRefresh(Refresh refresh) throws DataAccessException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int deleteRefresh(long idPhoto) throws DataAccessException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int deleteRefreshByAt(long at) throws DataAccessException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }


}
