package com.saproductions.cricket_prediction_mait.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Adapter.CustomAdapter;
import com.saproductions.cricket_prediction_mait.R;

import java.util.ArrayList;

public class Opposition extends AppCompatActivity {

    ListView listView;
    ArrayList<String> data = new ArrayList<>();
    CustomAdapter customAdapter ;
    CardView child;
    String opposition ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oposition);

        listView = (ListView)findViewById(R.id.listview);
        fillData(data);

        customAdapter = new CustomAdapter(Opposition.this, data);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                child = (CardView)view.findViewById(R.id.cardview_child);
                child.setBackgroundColor(getResources().getColor(R.color.blue));
                opposition = data.get(position);
                //TODO add shared pref
                Toast.makeText(getApplicationContext(), opposition + " Selected" , Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void fillData(ArrayList<String> data){

        for(int i = 0 ; i<10 ; i++){
            data.add("Hello World");
        }
    }
}
