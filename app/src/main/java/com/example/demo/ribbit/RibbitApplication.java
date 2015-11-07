package com.example.demo.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by alex on 11/6/15.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "z7XTlV8dDfBC8xu9osVO108xrZqNYPQAvQbGGDoT",
                "rn8LcXnZlTSsaYdsfnJRHX1hwffQKrQNrqy2Eahi");



    }
}
