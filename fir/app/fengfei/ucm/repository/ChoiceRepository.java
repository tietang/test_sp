package fengfei.ucm.repository;


import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.UnitNames;
import fengfei.ucm.entity.photo.Choice;

public interface ChoiceRepository extends UnitNames {
    int addChoice(final Choice choice) throws DataAccessException;

    int deleteChoice(final long idPhoto) throws DataAccessException;

    int deleteChoiceByAt(final int at) throws DataAccessException;
}
