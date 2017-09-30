package com.uz.karolis.mediabacklog.data_objects;

/**
 * Created by Karolis on 2017-10-01.
 */

public class MediaRatingItem {
    private long id;
    private int personalRating;
    private int criticRating;
    private int communityRating;

    public MediaRatingItem(long id, int personalRating, int criticRating, int communityRating) {
        this.id = id;
        this.personalRating = personalRating;
        this.criticRating = criticRating;
        this.communityRating = communityRating;
    }

    public int getPersonalRating() {
        return personalRating;
    }

    public void setPersonalRating(int personalRating) {
        this.personalRating = personalRating;
    }

    public int getCriticRating() {
        return criticRating;
    }

    public void setCriticRating(int criticRating) {
        this.criticRating = criticRating;
    }

    public int getCommunityRating() {
        return communityRating;
    }

    public void setCommunityRating(int communityRating) {
        this.communityRating = communityRating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
