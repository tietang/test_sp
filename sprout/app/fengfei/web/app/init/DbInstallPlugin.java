package fengfei.web.app.init;

import fengfei.forest.database.DataAccessException;
import fengfei.ucm.dao.Sequence;
import play.PlayPlugin;

public class DbInstallPlugin extends PlayPlugin {

    final static String[] Tables = { "user", "photos" };

    @Override
    public void onApplicationStart() {
        try {
            Sequence.install(1, Tables);
            Sequence.install(2, Tables);
        } catch (DataAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
