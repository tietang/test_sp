package fengfei.ucm.entity.photo;

import java.sql.Timestamp;

import fengfei.ucm.entity.profile.User;

public class Comment {

    public final static int Disabled = 1;
    public final static int Approved = 0;
    public long idComment;
    public long idPhoto;
    public int idUser;
    public String niceName;
    public String content;
    public String ip;
    public int createAt;
    public Timestamp createAtGmt;
    public int disabled = 0;
    public int idUserReply;
    public long idParent;
    //
    public User user;
    public String lostTime;

    public Comment() {
    }

    public Comment(
        long idPhoto,
        int idUser,
        String niceName,
        String content,
        String ip,
        int createAt,
        Timestamp createAtGmt,
        int idUserReply,
        long idParent) {
        super();
        this.idPhoto = idPhoto;
        this.idUser = idUser;
        this.niceName = niceName;
        this.content = content;
        this.ip = ip;
        this.createAt = createAt;
        this.createAtGmt = createAtGmt;
        this.idUserReply = idUserReply;
        this.idParent = idParent;
    }

    public Comment(
        long idComment,
        long idPhoto,
        int idUser,
        String niceName,
        String content,
        String ip,
        int createAt,
        Timestamp createAtGmt,
        int idUserReply,
        long idParent) {
        super();
        this.idComment = idComment;
        this.idPhoto = idPhoto;
        this.idUser = idUser;
        this.niceName = niceName;
        this.content = content;
        this.ip = ip;
        this.createAt = createAt;
        this.createAtGmt = createAtGmt;
        this.idUserReply = idUserReply;
        this.idParent = idParent;
    }

    public long getIdComment() {
        return idComment;
    }

    public void setIdComment(long idComment) {
        this.idComment = idComment;
    }

    public long getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getCreateAt() {
        return createAt;
    }

    public void setCreateAt(int createAt) {
        this.createAt = createAt;
    }

    public Timestamp getCreateAtGmt() {
        return createAtGmt;
    }

    public void setCreateAtGmt(Timestamp createAtGmt) {
        this.createAtGmt = createAtGmt;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public int getIdUserReply() {
        return idUserReply;
    }

    public void setIdUserReply(int idUserReply) {
        this.idUserReply = idUserReply;
    }

    public long getIdParent() {
        return idParent;
    }

    public void setIdParent(long idParent) {
        this.idParent = idParent;
    }

}
