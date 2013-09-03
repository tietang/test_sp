package fengfei.ucm.repository;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.photo.Refresh;

public interface PhotoExtRepository extends UnitNames {

    long updateUpcoming(final Rank rank) throws DataAccessException;

    long deletePopular(final Rank rank) throws DataAccessException;

    long updatePopular(final Rank rank) throws DataAccessException;

    int addRefresh(final Refresh refresh) throws DataAccessException;

    int deleteRefresh(final long idPhoto) throws DataAccessException;

    int deleteRefreshByAt(final long at) throws DataAccessException;



}
