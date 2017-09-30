package com.uz.karolis.mediabacklog.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.uz.karolis.mediabacklog.data_objects.MediaItem;

/**
 * Created by Karolis on 2017-09-30.
 */

public class MediaBacklogDatabaseDataWorker {
    private SQLiteDatabase mDb;

    public MediaBacklogDatabaseDataWorker(SQLiteDatabase db) {
        mDb = db;
    }

    public void insertTypes() {
        insertType("game");
        insertType("movie");
        insertType("book");
    }

    public void insertSampleMediaItems() {

    }

    private long insertType(String name) {
        ContentValues values = new ContentValues();
        values.put(MediaBacklogDatabaseContract.MediaTypeEntry.COLUMN_MEDIA_TYPE_NAME, name);

        return mDb.insert(MediaBacklogDatabaseContract.MediaTypeEntry.TABLE_NAME,
                null, values);
    }

    private long insertMediaItem(String name, int mediaTypeId, String description, String imageURL) {
        ContentValues values = new ContentValues();
        values.put(MediaBacklogDatabaseContract.MediaItemEntry.COLUMN_NAME, name);
        values.put(MediaBacklogDatabaseContract.MediaItemEntry.COLUMN_DESCRIPTION, description);
        values.put(MediaBacklogDatabaseContract.MediaItemEntry.COLUMN_IMAGE, imageURL);
        values.put(MediaBacklogDatabaseContract.MediaItemEntry.COLUMN_MEDIA_TYPE_ID, mediaTypeId);

        return mDb.insert(MediaBacklogDatabaseContract.MediaTypeEntry.TABLE_NAME,
                null, values);

    }

    private long insertMediaBacklog(
            int mediaItemId, int priority, String dateAdded, String dateCompleted) {

        ContentValues values = new ContentValues();
        values.put(MediaBacklogDatabaseContract.MediaBacklogEntry.COLUMN_MEDIA_ITEM_ID, mediaItemId);
        values.put(MediaBacklogDatabaseContract.MediaBacklogEntry.COLUMN_PRIORITY, priority);
        values.put(MediaBacklogDatabaseContract.MediaBacklogEntry.COLUMN_DATE_ADDED, dateAdded);
        values.put(MediaBacklogDatabaseContract.MediaBacklogEntry.COLUMN_DATE_COMPLETED, dateCompleted);

        return mDb.insert(MediaBacklogDatabaseContract.MediaBacklogEntry.TABLE_NAME,
                null, values);
    }

    private long insertMediaRating(
            long mediaItemId, int personalRating, int criticRating, int communityRating) {

        ContentValues values = new ContentValues();
        values.put(MediaBacklogDatabaseContract.MediaRatingEntry.COLUMN_MEDIA_ITEM_ID, mediaItemId);
        values.put(MediaBacklogDatabaseContract.MediaRatingEntry.COLUMN_PERSONAL_RATING, personalRating);
        values.put(MediaBacklogDatabaseContract.MediaRatingEntry.COLUMN_CRITIC_RATING, criticRating);
        values.put(MediaBacklogDatabaseContract.MediaRatingEntry.COLUMN_COMMUNITY_RATING, communityRating);

        return mDb.insert(MediaBacklogDatabaseContract.MediaRatingEntry.TABLE_NAME,
                null, values);
    }
}
