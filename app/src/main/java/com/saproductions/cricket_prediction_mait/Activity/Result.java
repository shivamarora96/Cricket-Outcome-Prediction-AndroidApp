package com.saproductions.cricket_prediction_mait.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Models.Request;
import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;


public class Result extends AppCompatActivity {

    SharedPreferenceManager sharedPreferenceManager;
    Request mRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mRequest = new Request();


        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());
        mRequest.setParams(sharedPreferenceManager.getInt(Constants.KEY_BATFIRST, 1), sharedPreferenceManager.getInt(Constants.KEY_MATCHTYPE, 1));

        Toast.makeText(Result.this,mRequest.getmBatFirst() + "-" + mRequest.getmMatchType() , Toast.LENGTH_LONG ).show();

        //TODO make network requesr and show result in response accordingly


    }
}
