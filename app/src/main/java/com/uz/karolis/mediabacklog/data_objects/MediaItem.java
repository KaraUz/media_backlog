package com.uz.karolis.mediabacklog.data_objects;

/**
 * Created by Karolis on 2017-09-11.
 * Will store media information
 */

public class MediaItem {
    private String title;
    private String description;
    private int userRating;
    private int backlogPriority;

    public MediaItem(String title, String description, int userRating, int backlogPriority) {
        this.title = title;
        this.description = description;
        this.userRating = userRating;
        this.backlogPriority = backlogPriority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public int getBacklogPriority() {
        return backlogPriority;
    }

    public void setBacklogPriority(int backlogPriority) {
        this.backlogPriority = backlogPriority;
    }
}
