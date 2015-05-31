package com.example.neway.xnoteservice;

import com.neway.xnotedata.entity.User;
import com.neway.xnotedata.exception.XNoteDbException;

/**
 * Created by Neway on 2015/5/31.
 */
public interface UserService {

    boolean register(User user) throws XNoteDbException;

    boolean login(String username,String password) throws XNoteDbException;
}
