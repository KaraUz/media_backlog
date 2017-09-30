package com.uz.karolis.mediabacklog.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Karolis on 2017-09-30.
 */

public class MediaBacklogOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MediaBacklog.db";
    public static final int DATABASE_VERSION = 1;

    public MediaBacklogOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(MediaBacklogDatabaseContract.MediaItemEntry.SQL_CREATE_TABLE);
        sqLiteDatabase.execSQL(MediaBacklogDatabaseContract.MediaBacklogEntry.SQL_CREATE_TABLE);
        sqLiteDatabase.execSQL(MediaBacklogDatabaseContract.MediaRatingEntry.SQL_CREATE_TABLE);
        sqLiteDatabase.execSQL(MediaBacklogDatabaseContract.MediaTypeEntry.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
