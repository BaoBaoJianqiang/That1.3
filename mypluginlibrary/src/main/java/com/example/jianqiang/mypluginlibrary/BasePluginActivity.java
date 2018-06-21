package com.example.jianqiang.mypluginlibrary;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BasePluginActivity extends Activity {

    private static final String TAG = "Client-BaseActivity";

    /**
     * 等同于mProxyActivity，可以当作Context来使用，会根据需要来决定是否指向this<br/>
     * 可以当作this来使用
     */
    protected Activity that;
    protected String dexPath;

    public void setProxy(Activity proxyActivity, String dexPath) {
        that = proxyActivity;
        this.dexPath = dexPath;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onRestart() {
    }

    @Override
    protected void onResume() {
    }

    @Override
    protected void onPause() {
    }

    @Override
    protected void onStop() {
    }

    @Override
    protected void onDestroy() {
    }

    @Override
    public void setContentView(int layoutResID) {
        that.setContentView(layoutResID);
    }

    @Override
    public View findViewById(int id) {
        return that.findViewById(id);
    }

    @Override
    public void startActivity(Intent intent) {
        that.startActivity(intent);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        that.startActivityForResult(intent, requestCode);
    }

    @Override
    public void finish() {
        that.finish();
    }

    public Resources getResources() {
        return that.getResources();
    }
}
