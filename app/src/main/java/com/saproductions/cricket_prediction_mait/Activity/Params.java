package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;

public class Params extends AppCompatActivity {

    RadioGroup mRadioGroup_MatchType, mRadioroup_batfirst;
    RadioGroup mRadioGroup_Toss;
    RadioGroup mRadioGroup_Pitch;
    FloatingActionButton mFab;
    SharedPreferenceManager sharedPreferenceManager;
    RadioButton mDay, mNight, mTossWin, mTossLoss, mbat,mbowl;
    int mID_matchtype, mID_toss, mId_batfirst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_params);

       mRadioGroup_MatchType = (RadioGroup)findViewById(R.id.radiogroup_daynight);
       mRadioroup_batfirst = (RadioGroup)findViewById(R.id.radiogroup_batfirst);
       mRadioGroup_Toss = (RadioGroup)findViewById(R.id.radiogroup_toss);
       mFab = (FloatingActionButton)findViewById(R.id.fab);
       mDay = (RadioButton)findViewById(R.id.radio_day);
       mbat  = (RadioButton)findViewById(R.id.radio_batfirst);
       mbowl = (RadioButton)findViewById(R.id.radio_bowlfirst);
       mNight = (RadioButton)findViewById(R.id.radio_night);
       mTossWin = (RadioButton)findViewById(R.id.radio_tosswin);
       mTossLoss = (RadioButton)findViewById(R.id.radio_tossloss);

        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());


        mFab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               mID_matchtype = mRadioGroup_MatchType.getCheckedRadioButtonId();
               mId_batfirst = mRadioroup_batfirst.getCheckedRadioButtonId();
               mID_toss = mRadioGroup_Toss.getCheckedRadioButtonId();

               RadioButton current = (RadioButton)findViewById(mID_matchtype);
               int currentData;
               if(current == mDay){
                   currentData = Constants.DAY;
               }
               else {
                   currentData = Constants.NIGHT;
               }

               //TODO setShared pref for matchtype here
               sharedPreferenceManager.setInt(Constants.KEY_MATCHTYPE, currentData);



               current = (RadioButton)findViewById(mId_batfirst);

               if(current == mbat){
                   currentData = Constants.INDIA_BAT;
               }
               else {
                   currentData = Constants.INDIA_NOT_BAT;

               }

               //TODO set shared Pref for India bat or bowl
               sharedPreferenceManager.setInt(Constants.KEY_BATFIRST, currentData);


               startActivity(new Intent(Params.this, Result.class));
               Params.this.finish();


           }
       });



    }
}
