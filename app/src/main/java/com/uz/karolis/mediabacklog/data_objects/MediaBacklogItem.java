package com.uz.karolis.mediabacklog.data_objects;

/**
 * Created by Karolis on 2017-10-01.
 */

public class MediaBacklogItem {
    private long id;
    private int priority;
    private String dateAdded;
    private String dateCompleted;

    public MediaBacklogItem(long id, int priority, String dateAdded, String dateCompleted) {
        this.id = id;
        this.priority = priority;
        this.dateAdded = dateAdded;
        this.dateCompleted = dateCompleted;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
