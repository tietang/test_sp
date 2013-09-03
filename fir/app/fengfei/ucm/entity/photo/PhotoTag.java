package fengfei.ucm.entity.photo;

import java.util.HashMap;
import java.util.Map;

public class PhotoTag {

    public long idTag;
    public long id;
    public String name;
    public byte category;

    public PhotoTag(long id, byte category, String name) {
        super();

        this.id = id;
        this.category = category;
        this.name = name;
    }

    public PhotoTag() {
    }

    public long getIdTag() {
        return idTag;
    }

    public void setIdTag(long idTag) {
        this.idTag = idTag;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
