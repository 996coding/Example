package com.hi.example.plugin;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

import com.creek.router.CreekRouter;
import com.creek.router.annotation.CreekMethod;

public class PluginBaseActivity implements PluginProxy {
    public Activity mContext;
    public Resources mResources;
    public View mRootView;

    @Override
    @CreekMethod(path = "plugin_mail_attache")
    public void attach(Activity proxyActivity) {
        this.mContext = proxyActivity;
    }

    @Override
    @CreekMethod(path = "plugin_mail_resources")
    public void resources(Resources res) {
        this.mResources = res;
    }

    @Override
    @CreekMethod(path = "plugin_mail_setContentView_view")
    public void setContentView(View view) {
        if (mContext != null) {
            mContext.setContentView(view);
        }
    }

    @Override
    @CreekMethod(path = "plugin_mail_setContentView_id")
    public void setContentView(int layoutResID) {
        if (mContext != null) {
            XmlResourceParser parser = mResources.getLayout(layoutResID);
            mRootView = LayoutInflater.from(mContext).inflate(parser, null);
            mContext.setContentView(mRootView);
        }
    }


    @Override
    @CreekMethod(path = "plugin_mail_findViewById")
    public View findViewById(int id) {
        return mRootView.findViewById(id);
    }

    public Intent getIntent() {
        return mContext.getIntent();
    }

    @Override
    @CreekMethod(path = "plugin_mail_onCreate")
    public void onCreate(Bundle saveInstanceState) {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onStart")
    public void onStart() {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onResume")
    public void onResume() {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onPause")
    public void onPause() {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onStop")
    public void onStop() {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onDestroy")
    public void onDestroy() {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onSaveInstanceState")
    public void onSaveInstanceState(Bundle outState) {

    }

    @Override
    @CreekMethod(path = "plugin_mail_onTouchEvent")
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override
    @CreekMethod(path = "plugin_mail_onBackPressed")
    public void onBackPressed() {

    }

    public void finish() {
        mContext.finish();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return mContext.onKeyDown(keyCode, event);
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    public void onWindowFocusChanged(boolean hasFocus) {
        mContext.onWindowFocusChanged(hasFocus);
    }

    public final void startActivity(String annotateBeanPath) {
        CreekRouter.methodRun("plugin_helper_startActivity", mContext, annotateBeanPath);
    }
}
