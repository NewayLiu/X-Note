package com.phonegap.xnote.dao.impl;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.phonegap.xnote.dao.UserDao;
import com.phonegap.xnote.model.User;

import java.sql.SQLException;

/**
 * Created by Neway on 2015/5/30.
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    protected UserDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, User.class);
    }


}
