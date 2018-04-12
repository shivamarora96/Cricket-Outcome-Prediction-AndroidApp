package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Adapter.CustomAdapter;
import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;

import java.util.ArrayList;

public class Opposition extends AppCompatActivity {

    ListView listView;
    ArrayList<String> data = new ArrayList<>();
    CustomAdapter customAdapter ;
    String opposition = " " ;
    FloatingActionButton fab;
    int logo = R.drawable.logo1;
    SharedPreferenceManager sp;
    ImageView headerImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oposition);

        headerImageView = (ImageView)findViewById(R.id.headerImageView);
        listView = (ListView)findViewById(R.id.listview);
        fillData(data);
        sp = new SharedPreferenceManager(getApplicationContext());

        fab = (FloatingActionButton)findViewById(R.id.fab);
        headerImageView.setImageResource(logo);

        customAdapter = new CustomAdapter(Opposition.this, data, Constants.KEY_ADD_LOGO);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                opposition = data.get(position);
                logo = Constants.LOGO[position];
                headerImageView.setImageResource(logo);
                headerImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(getApplicationContext(), opposition + " Selected !! " , Toast.LENGTH_SHORT).show();
            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(opposition.equals(" ")){

                    Toast.makeText(getApplicationContext(), "Kindly select data" , Toast.LENGTH_SHORT).show();
                }
                else {

                    //Added to shared Pref
                    sp.setString(Constants.KEY_OPPOSITIONTEAM, opposition);
                    sp.setInt(Constants.KEY_LOGO, logo);

                    startActivity(new Intent(Opposition.this, Country.class));
                    Opposition.this.finish();

                }
            }
        });
    }





    //TODO fill data
    public void fillData(ArrayList<String> data){
        for(int i = 0 ; i<Constants.OPPOSITIONS.length ; i++){
            data.add(Constants.OPPOSITIONS[i]);
        }

    }
}
