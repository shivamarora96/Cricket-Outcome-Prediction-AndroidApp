package com.saproductions.cricket_prediction_mait.Models;

/**
 * Created by shivam on 6/4/18.
 */

public class Request {

    int mBatFirst;
    int mLogo;
    int mMatchType;
    String mStadiumVenue;
    String mCountryVenue;
    String mOppositionTeam;

    public int getmLogo() {
        return mLogo;
    }

    public void setmLogo(int mLogo) {
        this.mLogo = mLogo;
    }

    public Request(int mBatFirst, int mMatchType, String mStadiumVenue, String mCountryVenue, String mOppositionTeam) {
        this.mBatFirst = mBatFirst;
        this.mMatchType = mMatchType;
        this.mStadiumVenue = mStadiumVenue;
        this.mCountryVenue = mCountryVenue;
        this.mOppositionTeam = mOppositionTeam;
    }

    public  Request(){
        //Empty Constructor
    }
    public void setParams(int mBatFirst,int MatchType){
        setmBatFirst(mBatFirst);
        setmMatchType(MatchType);
    }

    public int getmBatFirst() {
        return mBatFirst;
    }

    public void setmBatFirst(int mBatFirst) {
        this.mBatFirst = mBatFirst;
    }

    public int getmMatchType() {
        return mMatchType;
    }

    public void setmMatchType(int mMatchType) {
        this.mMatchType = mMatchType;
    }

    public String getmStadiumVenue() {
        return mStadiumVenue;
    }

    public void setmStadiumVenue(String mStadiumVenue) {
        this.mStadiumVenue = mStadiumVenue;
    }

    public String getmCountryVenue() {
        return mCountryVenue;
    }

    public void setmCountryVenue(String mCountryVenue) {
        this.mCountryVenue = mCountryVenue;
    }

    public String getmOppositionTeam() {
        return mOppositionTeam;
    }

    public void setmOppositionTeam(String mOppositionTeam) {
        this.mOppositionTeam = mOppositionTeam;
    }
}
