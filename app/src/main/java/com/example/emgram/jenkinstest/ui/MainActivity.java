package com.example.emgram.jenkinstest.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emgram.jenkinstest.R;

public class MainActivity extends AppCompatActivity {

    public static void show(Context context) {
        Intent intentAct = new Intent(context, MainActivity.class);
        intentAct.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentAct);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
