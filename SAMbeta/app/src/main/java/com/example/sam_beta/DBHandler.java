package com.example.sam_beta;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "SAM_CardDB.db";

    public static final String TABLE = "deck";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ECO = "ev";
    public static final String COLUMN_SOC= "sv";
    public static final String COLUMN_AMB= "av";
    public static final String COLUMN_IMG = "image";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DB_NAME, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String CREATE_TABLE = "CREATE TABLE " +
                TABLE + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_ECO + " INTEGER, " +
                COLUMN_SOC + " INTEGER, " +
                COLUMN_AMB + " TEXT, " +
                COLUMN_IMG + " TEXT)";
        db.execSQL(CREATE_TABLE);

        String INIT_DB = "INSERT INTO " + TABLE +
                "(id, ev, sv, av, image) VALUES " +
        "(1, 8, -5, 1, " + "\"" + "cardlabel1" + "\"" + "), " +
                "(2, 1, -5, 4, " + "\"" + "cardlabel2" + "\"" + "), " +
                "(3, -10, 1, 5, " + "\"" + "cardlabel3" + "\"" + "), " +
                "(4, 3, -5, 3, " + "\"" + "cardlabel4" + "\"" + "), " +
                "(5, -5, -5, 4, " + "\"" + "cardlabel5" + "\"" + "), " +
                "(6, -5, -8, 10, " + "\"" + "cardlabel6" + "\"" + "), " +
                "(7, 1, -5, 4, " + "\"" + "cardlabel7" + "\"" + "), " +
                "(8, 1, -8, 9, " + "\"" + "cardlabel8" + "\"" + "), " +
                "(9, -5, -5, 4, " + "\"" + "cardlabel9" + "\"" + "), " +
                "(10, -9, 3, 4, " + "\"" + "cardlabel10" + "\"" + "), " +
                "(11, -7, -5, 5, " + "\"" + "cardlabel11" + "\"" + "), " +
                "(12, -10, 3, 4, " + "\"" + "cardlabel12" + "\"" + "), " +
                "(13, 1, -6, 7, " + "\"" + "cardlabel13" + "\"" + "), " +
                "(14, 5, -10, -10, " + "\"" + "cardlabel14" + "\"" + "), " +
                "(15, 1, -10, -7, " + "\"" + "cardlabel15" + "\"" + "), " +
                "(16, 2, 2, 4, " + "\"" + "cardlabel16" + "\"" + "), " +
                "(17, 4, 4, 4, " + "\"" + "cardlabel17" + "\"" + "), " +
                "(18, 4, 4, 4, " + "\"" + "cardlabel18" + "\"" + "), " +
                "(19, -5, 4, 1, "  + "\"" + "cardlabel19" + "\"" + "), " +
                "(20, -10, 5, 1,  " + "\"" + "cardlabel20" + "\"" + "), " +
                "(21, 4, -5, 2,  " + "\"" + "cardlabel21" + "\"" + "), " +
                "(22, -10, 5, -10,  " + "\"" + "cardlabel22" + "\"" + "), " +
                "(23, -5, -5, 4, " + "\"" + "cardlabel23" + "\"" + "), " +
                "(24, -8, -5, 7, " + "\"" + "cardlabel24" + "\"" + "), " +
                "(25, -6, 7, 1, " + "\"" + "cardlabel25" + "\"" + "), " +
                "(26, 1, -10, 4, " + "\"" + "cardlabel26" + "\"" + "), " +
                "(27, 1, -8, 5, " + "\"" + "cardlabel27" + "\"" + "), " +
                "(28, 8, -2, 1, " + "\"" + "cardlabel28" + "\"" + "), " +
                "(29, -7, -7, 4, " + "\"" + "cardlabel29" + "\"" + "), " +
                "(30, -10, -5, 5, " + "\"" + "cardlabel30" + "\"" + "), " +
                "(31, 2, 1, -10, " + "\"" + "cardlabel31" + "\"" + "), " +
                "(32, -10, -7, 3, " + "\"" + "cardlabel32" + "\"" + "), " +
                "(33, 3, 3, 3, " + "\"" + "cardlabel33" + "\"" + "), " +
                "(34, 2, 2, 2, " + "\"" + "cardlabel34" + "\"" + "), " +
                "(35, -9, 3, 3, " + "\"" + "cardlabel35" + "\"" + "), " +
                "(36, -10, 5, -5, " + "\"" + "cardlabel36" + "\"" + "), " +
                "(37, -1, 5 , -8, " + "\"" + "cardlabel37" + "\"" + "), " +
                "(38, -9, 8, -9, " + "\"" + "cardlabel38" + "\"" + "), " +
                "(39, 10, 7, 2, " + "\"" + "cardlabel39" + "\"" + "), " +
                "(40, -9, -5, 2, " + "\"" + "cardlabel40" + "\"" + "), " +
                "(41, 5, -7, 5, " + "\"" + "cardlabel41" + "\"" + "), " +
                "(42, 8, -5, -6, " + "\"" + "cardlabel42" + "\"" + "), " +
                "(43, 6, 5, -10, " + "\"" + "cardlabel43" + "\"" + "), " +
                "(44, -3, -3, 1, " + "\"" + "cardlabel44" + "\"" + "), " +
                "(45, 3, -3, -3, " + "\"" + "cardlabel45" + "\"" + "), " +
                "(46, -2, -5, 4, " + "\"" + "cardlabel46" + "\"" + "), " +
                "(47, 2, -5, -4, " + "\"" + "cardlabel47" + "\"" + "), " +
                "(48, 2, -3, -3, " + "\"" + "cardlabel48" + "\"" + "), " +
                "(49, -2, -2, 2, " + "\"" + "cardlabel49" + "\"" + "), " +
                "(50, 5, 5, 5, " + "\"" + "cardlabel50" + "\"" + "), " +
                "(51, 4, 4, 4, " + "\"" + "cardlabel51" + "\"" + ")";
        db.execSQL(INIT_DB);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public Card getNewCard(int newCid){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE + " WHERE " + COLUMN_ID + "= " + newCid;
        Cursor cursor = db.rawQuery(query, null);
        Card nCard = null;
        if(cursor.moveToFirst()){
            nCard = new Card(cursor.getInt(0), cursor.getInt(1),cursor.getInt(2) , cursor.getInt(3), cursor.getString(4));
        }
        cursor.close();
        db.close();
        return nCard;
    }


}
