package fengfei.ucm.dao.transducer;

import java.sql.ResultSet;
import java.sql.SQLException;

import fengfei.forest.database.dbutils.Transducer;
import fengfei.ucm.entity.photo.Choice;
import fengfei.ucm.entity.photo.Refresh;

public class ChoiceTransducer implements Transducer<Choice> {

    @Override
    public Choice transform(ResultSet rs) throws SQLException {
        int idUser = rs.getInt("id_user");
        long idPhoto = rs.getLong("id_Photo");
        int updateAt = rs.getInt("at");
        String title = rs.getString("title");
        String niceName = rs.getString("nice_name");
        byte category = rs.getByte("category");
        Choice choice = new Choice(idPhoto, title, idUser, niceName, updateAt);
        choice.category = category;
        return choice;
    }

}
