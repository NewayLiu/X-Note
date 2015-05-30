package com.phonegap.xnote.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.phonegap.xnote.model.User;

import java.sql.SQLException;

/**
 * Created by Neway on 2015/5/30.
 */
public class XNoteDatabaseHelper extends OrmLiteSqliteOpenHelper {

    public final static String X_NOTE_DATABASE_NAME="x_note.database";

    private static XNoteDatabaseHelper xNoteDatabaseHelper;

    public static synchronized XNoteDatabaseHelper getInstance(Context context){
        if(xNoteDatabaseHelper == null){
            xNoteDatabaseHelper = new XNoteDatabaseHelper(context);
        }
        return xNoteDatabaseHelper;
    }

    private XNoteDatabaseHelper(Context context){
        super(context,X_NOTE_DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource,User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
