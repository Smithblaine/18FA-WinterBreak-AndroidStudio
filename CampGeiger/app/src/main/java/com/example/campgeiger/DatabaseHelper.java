package com.example.campgeiger;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME =  "CampGeiger2019.db";
    public static final String TABLE_NAME = "Geiger2019";

    public static final String COL_1 = "ActivityName";
    public static final String COL_2 = "Location";
    public static final String COL_3 = "ActivityTime";
    public static final String COL_4 = "ActivityLength";
    public static final String COL_5 = "RecommendedFor";
    public static final String COL_6 = "Materials";
    public static final String COL_7 = "Costs";
    public static final String COL_8 = "PreReq";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ActivityName TEXT, " +
                "Location TEXT, " +
                "ActivityTime TEXT, " +
                "ActivityLength TEXT, " +
                "RecommendedFor TEXT, " +
                "Materials TEXT, " +
                "Costs TEXT, " +
                "PreReq TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
