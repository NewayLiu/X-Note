package com.phonegap.xnote.activity;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Neway on 2015/6/3.
 */
public class BaseActivity extends Activity {

    public boolean onTouchEvent(MotionEvent event) {
        /**
         * hide the input keypad when the user touch out of the edit text
         */
        if(null != this.getCurrentFocus()){
            InputMethodManager mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            return mInputMethodManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
        }
        return super .onTouchEvent(event);
    }
}
