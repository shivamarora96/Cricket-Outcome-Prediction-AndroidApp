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

public class Country extends AppCompatActivity {

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
        setContentView(R.layout.activity_country);

        listView = (ListView)findViewById(R.id.listview);
        sp = new SharedPreferenceManager(getApplicationContext());
        fab = (FloatingActionButton)findViewById(R.id.fab);

        fillData(data);

        customAdapter = new CustomAdapter(Country.this, data);
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
                    Toast.makeText(getApplicationContext(), "Kindly Select data", Toast.LENGTH_SHORT).show();
                }

                else{
                    //Added to shared Pref
                    sp.setString(Constants.KEY_COUNTRYVENUE, currentData);

                    startActivity(new Intent(Country.this, Stadium.class));
                    Country.this.finish();
                }

            }
        });
    }





    //TODO fill data
    public void fillData(ArrayList<String> data){

        for(int i = 0 ; i<10 ; i++){
            data.add("Country " + i+1);
        }
    }
}
