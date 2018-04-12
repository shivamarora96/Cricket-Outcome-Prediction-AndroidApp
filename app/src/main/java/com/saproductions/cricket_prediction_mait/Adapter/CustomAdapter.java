package com.saproductions.cricket_prediction_mait.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam on 6/4/18.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    ArrayList<String> mData;
    int addCustomImage;




    public CustomAdapter(Context context, ArrayList<String> mData, int addImage) {
        super(context, 0);
        addCustomImage = addImage;
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
        ImageView imageView;


        if(v == null)
               v = LayoutInflater.from(parent.getContext()).inflate(R.layout.childlistview, parent, false);



        imageView  = (ImageView)v.findViewById(R.id.child_imageView);
        textView = (TextView)v.findViewById(R.id.TextView_child);

        textView.setText(mData.get(position));

        if(addCustomImage == Constants.KEY_ADD_CUSTOM_IMAGE){
//            int temp = (position%5) + 1 ;
            int drawable = R.drawable.locatioin;

            /*
            if(temp == 1)
                drawable = R.drawable.logo1;
            else if(temp == 2)
                drawable = R.drawable.logo2;
            else if(temp == 3)
                drawable = R.drawable.logo3;
            else if(temp == 4)
                drawable = R.drawable.logo4;
            else
                drawable = R.drawable.icon;

            */
            imageView.setImageResource(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        else if(addCustomImage == Constants.KEY_ADD_LOGO){

            int drawable = R.drawable.icon;
            drawable = Constants.LOGO[position];
            imageView.setImageResource(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        }


        return v;

    }
}
