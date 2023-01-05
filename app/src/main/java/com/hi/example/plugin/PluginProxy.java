package com.hi.example.plugin;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public interface PluginProxy {
    void attach(Activity proxyActivity);
    void resources(Resources res);
    void setContentView(View view);
    void setContentView(int layoutResID);
    View findViewById(int id);


    /**
     * 生命周期
     */
    void onCreate(Bundle saveInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void onSaveInstanceState(Bundle outState);

    boolean onTouchEvent(MotionEvent event);

    void onBackPressed();
}
