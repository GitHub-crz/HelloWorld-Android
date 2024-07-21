package com.crz.application;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private final static String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, this.getClass() + ":onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, this.getClass() + ":onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, this.getClass() + ":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, this.getClass() + ":onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, this.getClass() + ":onPause");
    }
}
