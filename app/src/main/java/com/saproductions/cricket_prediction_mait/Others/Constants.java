package com.saproductions.cricket_prediction_mait.Others;

import com.saproductions.cricket_prediction_mait.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Constants {

    public static final String BASE_URL = "http://sudhanshu12.pythonanywhere.com";
    public static final String endpoint = "/";

    public static final int DAY = 1;
    public static final int NIGHT = 0;
    public static final int INDIA_BAT = 1;
    public static final int INDIA_NOT_BAT = 0;
    public final static String PREF_NAME = "DataStorage";

    //Keys


    public  static final int KEY_ADD_CUSTOM_IMAGE = -1;
    public static final int KEY_ADD_LOGO = 0;
    public  static final int KEY_ADD_DEFAULT_IMAGE = 1;

    public static final String KEY_MATCHTYPE = "MT";
    public static final String KEY_BATFIRST = "BF";
    public static final String KEY_COUNTRYVENUE = "CV";
    public static final String KEY_STADIUMVENUE = "SV";
    public static final String KEY_OPPOSITIONTEAM = "OPT";
    public  static final String KEY_LOGO = "TEAMlogo";


    public static final String [] OPPOSITIONS = {
            "Australia",
            "Bangladesh",
            "England",
            "SriLanka",
            "Pakistan",
            "SouthAfrica",
            "Zimbabwe",
            "NewZealand",
            "WestIndies",
            "Kenya"
    };

    public static final int LOGOINDIA = R.drawable.logoindia;

    public static final int [] LOGO = {
       R.drawable.logoaustralia,
       R.drawable.logobangla,
            R.drawable.logoengland,
            R.drawable.logosrilanka,
            R.drawable.logopakistan,
            R.drawable.logosouthafrica,
            R.drawable.logozimbabawe,
            R.drawable.logonewzealand,
            R.drawable.logowi,
            R.drawable.logokenya

    } ;



    public static HashMap<String,String[]> VENUE = new HashMap<String,String[]>();




    public static void fillData(HashMap<String, String []> VENUE){

        String [] Canada = {"Toronto"};
        VENUE.put("Canada", Canada);

        String [] Pakistan = {
                "Gujwranwala",
                "Rawalpindi",
                "Karachi",
                "Lahore",
                "Quetta",
                "Peshawar",
                "Sahiwal",
                "Multan",
                "Sialkot",

        };
        VENUE.put("Pakistan", Pakistan);

        String [] Australia = {
                "Brisbane" ,
                        "Sydney" ,
                        "Perth" ,
                        "Adelaide" ,
                        "Launceston" ,
                        "Hobart" ,
                        "Canberra" ,
                        "Melbourne"
        };
        VENUE.put("Australia", Australia);


        String [] England = {
            "Manchester" ,
                    "Nottingham" ,
                    "London" ,
                    "Leeds" ,
                    "Southampton" ,
                    "St." ,
                    "Hove" ,
                    "Tunbridge" ,
                    "Taunton" ,
                    "Birmingham" ,
                    "Chelmsford" ,
                    "Bristol" ,
                    "Leicester"

        };
        VENUE.put("England", England);



        String [] Bangladesh = {
                "Chittagong" ,
                        "Dhaka"
        };
        VENUE.put("Bangladesh", Bangladesh);


        String [] Singapore = {"Singapore"};
        VENUE.put("Singapore", Singapore);


        String [] SriLanka = {

                "Kandy" ,
                        "Moratuwa" ,
                        "Hambantota" ,
                        "Dambulla" ,
                        "Galle" ,
                        "Colombo"
        };
        VENUE.put("SriLanka", SriLanka);


        String [] India = {

                "Jalandhar" ,
                        "Chennai" ,
                        "Delhi" ,
                        "Kochi" ,
                        "Srinagar" ,
                        "Ahmedabad" ,
                        "Pune" ,
                        "Nagpur" ,
                        "Gwalior" ,
                        "Kanpur" ,
                        "Visakhapatnam" ,
                        "Ranchi" ,
                        "Amritsar" ,
                        "Kolkata" ,
                        "Rajkot" ,
                        "Bangalore" ,
                        "Cuttack" ,
                        "Hyderabad" ,
                        "Dharamsala" ,
                        "Margao" ,
                        "Vadodara" ,
                        "Indore" ,
                        "Mumbai" ,
                        "Vijayawada" ,
                        "Guwahati" ,
                        "Jodhpur" ,
                        "Jaipur" ,
                        "Chandigarh" ,
                        "Faridabad" ,
                        "Thiruvananthapuram" ,
                        "Jamshedpur"

        };
        VENUE.put("India", India);

        String [] NewZealand = {
                
                "Hamilton" ,
                        "Christchurch" ,
                        "Dunedin" ,
                        "Auckland" ,
                        "Queenstown" ,
                        "Napier" ,
                        "Wellington" ,
                        "Taupo"
        };
        VENUE.put("NewZealand", NewZealand);


        String [] SouthAfrica = {

                "Johannesburg" ,
                        "Centurion" ,
                        "Bloemfontein" ,
                        "Benoni" ,
                        "East" ,
                        "Cape" ,
                        "Durban" ,
                        "Paarl"

        };
        VENUE.put("SouthAfrica", SouthAfrica);


        String [] Zimbabwe = {
                "Harare" ,
                        "Bulawayo"
        };
        VENUE.put("Zimbabwe", Zimbabwe);

        String [] Cardiff = {"Cardiff"};
        VENUE.put("Cardiff", Cardiff);


        String [] Kenya = {"Kenya"};
        VENUE.put("Kenya", Kenya);


        String [] WestIndies = {"Jamaica" ,
                "Trinidad" ,
                "Grenada" ,
                "Barbados" ,
                "Guyana" ,
                "WestIndies"};
        VENUE.put("WestIndies", WestIndies);


    }



}
