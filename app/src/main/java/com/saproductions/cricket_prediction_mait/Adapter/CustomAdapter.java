package com.saproductions.cricket_prediction_mait.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.saproductions.cricket_prediction_mait.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam on 6/4/18.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    ArrayList<String> mData;


    public CustomAdapter(Context context, ArrayList<String> mData) {
        super(context, 0);
        this.context = context;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView;
        View v = convertView;

        if(v == null)
               v = LayoutInflater.from(parent.getContext()).inflate(R.layout.childlistview, parent, false);

        textView = (TextView)v.findViewById(R.id.TextView_child);
        textView.setText(mData.get(position));

        return v;

    }
}
