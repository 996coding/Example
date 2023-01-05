package com.hi.example;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Field;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Field f = ShareReflectUtil.findField(this,"mResources");
            Log.e("lv123","-->>  "+f.getName()+"    ");

        } catch (Exception e) {
            Log.e("lv123","-->>  "+e.getMessage());

        }

    }
}