package com.saproductions.cricket_prediction_mait.Others;

import java.util.ArrayList;
import java.util.Map;



public class Constants {

    public static final int DAY = 1;
    public static final int NIGHT = 0;
    public static final int INDIA_BAT = 1;
    public static final int INDIA_NOT_BAT = 0;
    public final static String BASE_URL = " ";
    public final static String PREF_NAME = "DataStorage";

    //Keys

    public static final String KEY_MATCHTYPE = "MT";
    public static final String KEY_BATFIRST = "BF";
    public static final String KEY_COUNTRYVENUE = "CV";
    public static final String KEY_STADIUMVENUE = "SV";
    public static final String KEY_OPPOSITIONTEAM = "OPT";


    public static final String [] OPPOSITIONS = {
            "Australia",
            "Bangladesh",
            "England",
            "Srilanka",
            "Pakistan",
            "South Africa",
            "Zimbabwe",
            "New Zealand",
            "West Indies",
            "Others"
    };
    public static  Map<String, String []> VENUE ;



}
