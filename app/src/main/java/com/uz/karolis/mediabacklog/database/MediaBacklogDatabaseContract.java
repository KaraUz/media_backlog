package com.uz.karolis.mediabacklog.database;

import android.provider.BaseColumns;

/**
 * Created by Karolis on 2017-09-30.
 */

public final class MediaBacklogDatabaseContract {
    private MediaBacklogDatabaseContract() {} // private constructor to make it inaccessible.

    public final static class MediaTypeEntry implements BaseColumns {
        public final static String TABLE_NAME = "media_types";
        public final static String COLUMN_MEDIA_TYPE_NAME = "media_type_name";

        public final static String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_MEDIA_TYPE_NAME + " TEXT NOT NULL UNIQUE)";
    }

    public final static class MediaItemEntry implements BaseColumns {
        public final static String TABLE_NAME = "media_items";
        public final static String COLUMN_MEDIA_TYPE_ID = "media_type_id";
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_DESCRIPTION = "description";
        public final static String COLUMN_IMAGE = "image";

        public final static String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_MEDIA_TYPE_ID + " INTEGER," +
                        COLUMN_NAME + " TEXT NOT NULL UNIQUE," +
                        COLUMN_DESCRIPTION + " TEXT," +
                        COLUMN_IMAGE + " TEXT, " +
                        "FOREIGN KEY (" + COLUMN_MEDIA_TYPE_ID + ") " +
                            "REFERENCES " + MediaTypeEntry.TABLE_NAME + " (" + _ID + "))";
    }

    public final static class MediaBacklogEntry implements BaseColumns {
        public final static String TABLE_NAME = "media_backlog_items";
        public final static String COLUMN_MEDIA_ITEM_ID = "media_item_id";
        public final static String COLUMN_PRIORITY = "priority";
        public final static String COLUMN_DATE_ADDED = "date_added";
        public final static String COLUMN_DATE_COMPLETED = "date_completed";

        public final static String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_MEDIA_ITEM_ID + " INTEGER UNIQUE," +
                        COLUMN_PRIORITY + " INTEGER NOT NULL," +
                        COLUMN_DATE_ADDED + " TEXT NOT NULL," +
                        COLUMN_DATE_COMPLETED + " TEXT, " +
                        "FOREIGN KEY (" + COLUMN_MEDIA_ITEM_ID + ") " +
                            "REFERENCES " + MediaItemEntry.TABLE_NAME + " (" + _ID + "))";
    }

    public final static class MediaRatingEntry implements BaseColumns{
        public final static String TABLE_NAME = "media_rating_items";
        public final static String COLUMN_MEDIA_ITEM_ID = "media_item_id";
        public final static String COLUMN_PERSONAL_RATING = "personal_rating";
        public final static String COLUMN_CRITIC_RATING = "critic_rating";
        public final static String COLUMN_COMMUNITY_RATING = "community_rating";

        public final static String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_MEDIA_ITEM_ID + " INTEGER UNIQUE," +
                        COLUMN_PERSONAL_RATING + " INTEGER," +
                        COLUMN_CRITIC_RATING + " INTEGER," +
                        COLUMN_COMMUNITY_RATING + " INTEGER, " +
                        "FOREIGN KEY (" + COLUMN_MEDIA_ITEM_ID + ") " +
                            "REFERENCES " + MediaItemEntry.TABLE_NAME + " (" + _ID + "))";
    }
}
