package fengfei.web.app.init;

import fengfei.ucm.dao.Sequence;
import fengfei.ucm.repository.impl.SqlCommentRepository;
import fengfei.ucm.repository.impl.SqlPhotoRepository;
import fengfei.ucm.repository.impl.SqlUserRepository;
import play.PlayPlugin;

public class DbInstallPlugin extends PlayPlugin {

    final static String[] Tables = {
            SqlUserRepository.UserTableName,
            SqlPhotoRepository.PhotosTableName,
            SqlCommentRepository.CommentsTableName,
            SqlCommentRepository.CommentsPhotoTableName
    };

    @Override
    public void onApplicationStart() {
        try {
            Sequence.install(1, Tables);
            Sequence.install(501, Tables);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
