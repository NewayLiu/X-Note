package com.neway.xnoteservice_db_impl;

import android.content.Context;

import com.example.neway.xnoteservice.UserService;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.neway.xnotedata.entity.User;
import com.neway.xnotedata.exception.XNoteDbException;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Neway on 2015/5/31.
 */

public class UserServiceDbImpl implements UserService {

    private Dao<User, String> userDao;

    public UserServiceDbImpl(Context context) {
        try {
            userDao = DaoManager.createDao(XNoteDatabaseHelper.getInstance(context).getConnectionSource(), User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean register(User user) throws XNoteDbException {
        int rowsUpdated = 0;
        try {
            rowsUpdated = userDao.create(user);
        } catch (SQLException e) {
            throw new XNoteDbException(e.getMessage());
        }
        return rowsUpdated == 1 ? true : false;
    }

    @Override
    public boolean login(String username, String password) throws XNoteDbException {
        Map<String, Object> values = new HashMap<String, Object>();
        values.put("username", username);
        values.put("password", password);
        int size = 0;
        try {
            size = userDao.queryForFieldValues(values).size();
        } catch (SQLException e) {
            throw new XNoteDbException(e.getMessage());
        }
        return size > 0 ? true:false;
    }
}
