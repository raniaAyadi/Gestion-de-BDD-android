package com.example.rayadi001.tp06;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

/**
 * Created by rayadi001 on 06/11/18.
 */

public class BDLivres {
    private final static int VERSION_BDD=1;
    private SQLiteDatabase bdd;
    private MaBaseSQLite maBaseSQLite;

    public BDLivres(Context context) {
        maBaseSQLite = new MaBaseSQLite(context,"Livres",null, VERSION_BDD);
    }

    public void open(){
        bdd= maBaseSQLite.getWritableDatabase();
    }
    public void close(){
        bdd.close();
    }

    public SQLiteDatabase getBdd() {
        return bdd;
    }

    public long insertLivre(Livre livre){
        ContentValues values = new ContentValues();
        values.put("isbn",livre.getIsbn());
        values.put("titre",livre.getTitre());
        return bdd.insert("livres",null,values);
    }

    public Livre getLivreByIsbn(String isbn){
        Cursor cursor = bdd.query("livres",new String[]{"id","isbn","titre"},"isbn like \""+isbn+"\"",null,null,null,null,null);
        if (cursor.getCount()==0)
            return null;
        cursor.moveToFirst();
        Livre livre = new Livre();
        livre.setId(cursor.getInt(0));
        livre.setIsbn(cursor.getString(1));
        livre.setTitre(cursor.getString(2));
        cursor.close();
        return livre;
    }

}
