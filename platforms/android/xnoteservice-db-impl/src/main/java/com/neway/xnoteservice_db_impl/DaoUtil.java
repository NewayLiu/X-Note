package com.neway.xnoteservice_db_impl;

import android.content.Context;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.neway.xnotedata.entity.User;

import java.sql.SQLException;

/**
 * Created by Neway on 2015/5/31.
 */
public class DaoUtil {
    public static Dao getUserDao(Context context){
        Dao<User, String> userDao = null;
        try {
            userDao = DaoManager.createDao(XNoteDatabaseHelper.getInstance(context).getConnectionSource(), User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDao;
    }
}
