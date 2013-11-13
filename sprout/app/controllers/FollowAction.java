package controllers;

import fengfei.spruce.utils.FollowServiceUtils;
import fengfei.sprucy.AppConstants;
import fengfei.ucm.service.ReadFollowService;
import fengfei.ucm.service.WriteFollowService;
import play.Logger;
import play.mvc.With;

@With(SecureForJson.class)
public class FollowAction extends Admin {


    public static WriteFollowService writeFollowService = FollowServiceUtils.writeFollowService;
    public static ReadFollowService readFollowService = FollowServiceUtils.readFollowService;

    public static void follow(String toid) {
        long sourceId = currentUserId();
        try {
            boolean followed = writeFollowService.add(null, sourceId, Long.parseLong(toid), AppConstants.DefaultFollowType);
            renderDone(followed);
        } catch (Exception e) {
            Logger.error(e, "follow error.");
            renderError();
        }

    }

    public static void unfollow(String toid) {
        long sourceId = currentUserId();
        try {
            boolean followed = writeFollowService.remove(null, sourceId, Long.parseLong(toid),AppConstants.DefaultFollowType);
            renderDone(followed);
        } catch (Exception e) {
            Logger.error(e, "unfollow error.");
            renderError();
        }

    }

    public static void countFollows() {
        long sourceId = currentUserId();
        try {
            int follow[] = readFollowService.count(null, sourceId,AppConstants.DefaultFollowType);
            renderJSON("{following:" + follow[0] + ",followed:" + follow[1] + "}");
        } catch (Exception e) {
            Logger.error(e, "count follow error.");
            renderError();
        }
    }

}
