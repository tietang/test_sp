package fengfei.ucm.repository.impl;

import fengfei.fir.search.lucene.Searcher;
import fengfei.fir.utils.Hash;
import fengfei.forest.database.dbutils.ForestGrower;
import fengfei.forest.slice.SliceResource.Function;
import fengfei.forest.slice.database.utils.Transactions;
import fengfei.forest.slice.database.utils.Transactions.TaCallback;
import fengfei.ucm.dao.PhotoTagDao;
import fengfei.ucm.dao.RankDao;
import fengfei.ucm.dao.UserDao;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.profile.User;
import fengfei.ucm.repository.SearchRespository;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

import java.sql.SQLException;
import java.util.List;

public class LuceneSearchRespository {
    public Searcher userSearcher = Searcher.userSearcher;
    public Searcher photoSearcher = Searcher.photoSearcher;
    public SqlShowRepository showRepository = new SqlShowRepository();

    private String[] keywords(String qstr) {
        String[] keywords = qstr.split(" |,|，");
        return keywords;
    }


    public List<Rank> selectPhotosByTag(
            final ScoreDoc after,
            final String qstr,
            final Byte category,
            final int offset,
            final int limit) throws Exception {
        String[] keywords = keywords(qstr);


        List<Long> idPhotos = null;
        TopDocs tds = photoSearcher.search(after, 100, 1, keywords);
        List<Rank> ranks = showRepository.selectRanks(idPhotos);
        return ranks;
    }


    public List<User> selectUsers(final String qstr, final int offset, final int limit)
            throws Exception {

        List<User> users = null;

        return users;
    }

}
