package com.uz.karolis.mediabacklog.data_objects;

/**
 * Created by Karolis on 2017-09-11.
 * Will store media information
 */

public class MediaItem {
    private long id;
    private String name;
    private String description;
    private MediaType type;
    private String imageURL;
    private MediaBacklogItem backlogItem;
    private MediaRatingItem ratingItem;

    public MediaItem(long id, String name, String description, MediaType type, String imageURL,
                     MediaBacklogItem backlogItem, MediaRatingItem ratingItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.imageURL = imageURL;
        this.backlogItem = backlogItem;
        this.ratingItem = ratingItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public MediaBacklogItem getBacklogItem() {
        return backlogItem;
    }

    public void setBacklogItem(MediaBacklogItem backlogItem) {
        this.backlogItem = backlogItem;
    }

    public MediaRatingItem getRatingItem() {
        return ratingItem;
    }

    public void setRatingItem(MediaRatingItem ratingItem) {
        this.ratingItem = ratingItem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
