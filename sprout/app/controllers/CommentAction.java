package controllers;

import java.sql.Timestamp;
import java.util.Map;

import fengfei.fir.model.Done;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import play.Logger;
import play.mvc.With;
import fengfei.ucm.entity.photo.Comment;
import fengfei.ucm.repository.CommentRepository;
import fengfei.ucm.repository.impl.SqlCommentRespository;

@With(SecureForJson.class)
public class CommentAction extends Admin {


    static CommentRepository repository = new SqlCommentRespository();

    public static void commentDone() {
        int idUser = currentUserId();
        String niceName = currentNiceName();
        Map<String, String> map = escapeAllSimple();
        long idPhoto = MapUtils.getLongValue(map, "id_photo");
        long idParent = MapUtils.getLongValue(map, "id_parent");
        String content = params.get("comment");
        String ip = request.remoteAddress;
        long current = System.currentTimeMillis();
        int createAt = (int) (current / 1000);
        Timestamp createAtGmt = new Timestamp(current);
        int idUserReply = MapUtils.getIntValue(map, "idUserReply");

        try {
            validation.maxSize(content, 128);
            renderHasErrors();
            content = StringEscapeUtils.escapeHtml4(content);

            Comment comment = new Comment(
                    idPhoto,
                    idUser,
                    niceName,
                    content,
                    ip,
                    createAt,
                    createAtGmt,
                    idUserReply,
                    idParent);

            boolean updated = repository.addOne(comment);
            renderDone(updated);
        } catch (Exception e) {
            Logger.error(e, "add comment error.");
            renderError();
        }
    }

}
