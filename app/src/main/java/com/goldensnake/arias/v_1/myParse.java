package com.goldensnake.arias.v_1;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;


/**
 * Created by Arias on 10/11/2014.
 */
public class myParse extends Application {
      @Override
        public void onCreate() {
            super.onCreate();

            // initialization code
            Parse.initialize(this, "v5VnlWdGL8II4oj7u8BEcnMq4DlPH6YzqfEmz76P", "HWL8tdkZlWsDDJGheYRzLzjxE1DocpIpLvuaNFrP");

            ParseUser.enableAutomaticUser();
            ParseACL defaultACL = new ParseACL();

            defaultACL.setPublicReadAccess(true);

            ParseACL.setDefaultACL(defaultACL, true);

          ParseObject testObject = new ParseObject("TestObject");
          testObject.put("foo", "bar");
          testObject.saveInBackground();

      }

    }