package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Adapter.CustomAdapter;
import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;

import java.util.ArrayList;

public class Stadium extends AppCompatActivity {


    ListView listView;
    ArrayList<String> data = new ArrayList<>();
    CustomAdapter customAdapter ;
    CardView child;
    String currentData = " ";
    FloatingActionButton fab;
    SharedPreferenceManager sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);

        listView = (ListView)findViewById(R.id.listview);
        sp = new SharedPreferenceManager(getApplicationContext());
        fab = (FloatingActionButton)findViewById(R.id.fab);

        fillData(data);

        customAdapter = new CustomAdapter(Stadium.this, data, Constants.KEY_ADD_DEFAULT_IMAGE);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                child = (CardView)view.findViewById(R.id.cardview_child);
                //TODO
                child.setBackgroundColor(getResources().getColor(R.color.blue));
                currentData = data.get(position);

                Toast.makeText(getApplicationContext(), currentData + " Selected" , Toast.LENGTH_SHORT).show();
            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(currentData.equals(" ")){

                    Toast.makeText(getApplicationContext(), "Kindly select data" , Toast.LENGTH_SHORT).show();
                }
                else{
                    sp.setString(Constants.KEY_STADIUMVENUE, currentData);

                    startActivity(new Intent(Stadium.this, Params.class));
                    Stadium.this.finish();
                }
                //Added to shared Pref

            }
        });
    }





    //TODO fill data
    public void fillData(ArrayList<String> data){

        String country = sp.getString(Constants.KEY_COUNTRYVENUE, "India");
        String[] venues  =  Constants.VENUE.get(country);

        for(int i = 0 ; i<venues.length ; i++)
            data.add(venues[i]);

    }
}

