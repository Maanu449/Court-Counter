package com.example.android.counterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class screen_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent obj = new Intent(screen_splash.this, MainActivity.class);
        startActivity(obj);
        finish();
          }

}
