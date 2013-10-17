package jobs;

import fengfei.fir.search.lucene.TagIndexCreator;
import fengfei.ucm.repository.PhotoRepository;
import fengfei.ucm.repository.impl.SqlPhotoRepository;
import play.jobs.Every;
import play.jobs.Job;

/**
 */
@Every("1h")
public class PhotoTagsTask extends Job<String> {
    private long lastIdPhoto = 0;
    private PhotoRepository photoRepository = new SqlPhotoRepository();
    TagIndexCreator creator = new TagIndexCreator("");

    @Override
    public void doJob() throws Exception {

    }

}