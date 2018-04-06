package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;

public class SplashActivity extends AppCompatActivity implements Runnable {

    private static final int TIME_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        SharedPreferenceManager sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());
        sharedPreferenceManager.clearValues();

        //TODO dowload data about venue and stadiums



        new Handler().postDelayed(SplashActivity.this ,TIME_DELAY);

    }

    @Override
    public void run() {
        Intent tomain = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(tomain);
        SplashActivity.this.finish();
    }


}
