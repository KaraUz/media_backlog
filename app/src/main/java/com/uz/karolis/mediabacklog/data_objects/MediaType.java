package com.uz.karolis.mediabacklog.data_objects;

/**
 * Created by Karolis on 2017-10-01.
 */

public class MediaType {
    private long id;
    private String typeName;

    public MediaType(long id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
