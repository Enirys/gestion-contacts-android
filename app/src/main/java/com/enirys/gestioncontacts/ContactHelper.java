package com.enirys.gestioncontacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ContactHelper extends SQLiteOpenHelper {

    public static final String table_contact = "Contacts";
    public static final String col_id = "ID";
    public static final String col_nom = "Nom";
    public static final String col_prenom = "Prenom";
    public static final String col_numero = "Numero";

    String requete = "CREATE TABLE " + table_contact + " (" + col_id + " Integer Primary Key Autoincrement," + " " + col_nom + " Text not null," + col_prenom + " Text not null," + col_numero + " Integer)";

    public ContactHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(requete);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table " + table_contact);
        onCreate(sqLiteDatabase);
    }
}
