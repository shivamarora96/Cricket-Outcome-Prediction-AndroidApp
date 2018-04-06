package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.R;

public class MainActivity extends AppCompatActivity {

    ImageButton mplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mplay = (ImageButton)findViewById(R.id.imagebutton_play);


        mplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!isOnline()){
                    Toast.makeText(getApplicationContext(), "KINDLY CHECK YOUR CONNECTIVITY !!", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Kindly Fillup  the Data", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this, Opposition.class));
                    MainActivity.this.finish();
                }


            }
        });

    }


    protected boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }





}
