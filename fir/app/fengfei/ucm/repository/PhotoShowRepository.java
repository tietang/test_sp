package fengfei.ucm.repository;

import java.util.List;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.Photo;
import fengfei.ucm.entity.photo.PhotoAccess;
import fengfei.ucm.entity.photo.Popular;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.photo.Refresh;
import fengfei.ucm.entity.photo.Upcoming;

public interface PhotoShowRepository extends UnitNames {

    public final static long RefreshKey = 1l;

    List<Refresh> refreshed(final Byte category, int offset, int limit) throws DataAccessException;

    List<Choice> choiced(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Rank> upcomed(final Byte category, final int offset, final int limit)
        throws DataAccessException;

    List<Rank> popular(final Byte category, final int offset, final int limit)
        throws DataAccessException;

}
