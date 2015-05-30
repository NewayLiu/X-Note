/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.phonegap.xnote;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.j256.ormlite.dao.Dao;
import com.networkbench.agent.impl.NBSAppAgent;
import com.phonegap.xnote.dao.DaoUtil;
import com.phonegap.xnote.dao.UserDao;
import com.phonegap.xnote.model.User;

import org.apache.cordova.*;

import java.sql.SQLException;

import butterknife.InjectView;

public class MainActivity extends CordovaActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        NBSAppAgent.setLicenseKey("9a48278e5f4342b48f9ff4223e9bf2b1").withLocationServiceEnabled(true).start(this);
    }

    public void sendReport(View view){
        String str = null;
        str.toCharArray();
    }

}
