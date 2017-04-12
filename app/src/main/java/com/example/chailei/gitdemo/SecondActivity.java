package com.example.chailei.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity","second");
        Log.d("Test Merge","test");
        Log.d("Test Merger again","test");
        Log.d("Test conflict","test");
    }
}
