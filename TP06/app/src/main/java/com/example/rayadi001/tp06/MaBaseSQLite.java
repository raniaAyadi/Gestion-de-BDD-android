package com.example.rayadi001.tp06;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rayadi001 on 06/11/18.
 */

public class MaBaseSQLite extends SQLiteOpenHelper {


        private final String CREATE_TABLE = "create table livres (" +
                "id integer primary key autoincrement, " +
                "isbn char(5)," +
                "titre varchar(50));";


        public MaBaseSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table livres");
            db.execSQL(CREATE_TABLE);
        }
    }
