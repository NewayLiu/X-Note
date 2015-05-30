package com.phonegap.xnote.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.phonegap.xnote.dao.impl.UserDaoImpl;

/**
 * Created by Neway on 2015/5/30.
 */

@DatabaseTable(tableName = "user")
public class User {

    @DatabaseField(id = true)
    private int id;

    @DatabaseField
    private String username;

    @DatabaseField
    private String password;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
