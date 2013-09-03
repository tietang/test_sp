package fengfei.ucm.dao.transducer;

import java.sql.ResultSet;
import java.sql.SQLException;

import fengfei.fir.rank.RankUtils;
import fengfei.forest.database.dbutils.Transducer;
import fengfei.ucm.entity.photo.Rank;

public class UserRankTransducer implements Transducer<Rank> {

    @Override
    public Rank transform(ResultSet rs) throws SQLException {
        int idUser = rs.getInt("id_user");

        long updateAt = rs.getLong("update_at");
        int viewCount = rs.getInt("view");
        int voteCount = rs.getInt("vote");
        int favoriteCount = rs.getInt("favorite");
        int commentCount = rs.getInt("comment");
        int affectionCount = rs.getInt("affection");

        Rank rank = new Rank(
            idUser,
            viewCount,
            voteCount,
            favoriteCount,
            commentCount,
            updateAt,
            affectionCount);

        return rank;
    }

}
