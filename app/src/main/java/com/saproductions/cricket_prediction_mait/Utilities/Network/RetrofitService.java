package com.saproductions.cricket_prediction_mait.Utilities.Network;


import com.saproductions.cricket_prediction_mait.Models.Response;
import com.saproductions.cricket_prediction_mait.Others.Constants;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitService {

    String endpoint = Constants.endpoint;

//    ?opposition=Australia&venue=Delhi&venue_country=India&day_night=1&batting=1
    @GET(endpoint)
    Call<Response> getResponse(@Query("opposition") String Opposition, @Query("venue") String Stadium, @Query("venue_country") String country, @Query("day_night") int daynight, @Query("batting") int battingfirst);








/*

    @GET("items/stock_status/")
    Call<ArrayList<Item>> getListOfItem();

    @POST("users/updateitems")
    Call<UpdateResponse> getUpdateMessage(@Body UpdateRequest request);

    //ADD
    @POST("users/additems")
    Call<AddResponse> addItem(@Body AddRequest request);

    //view Allocated
    @GET("users/users/items/{email}")
    Call<ArrayList<ItemAllocated_Response> > getAllocatedItem(@Path("email") String emailId);

    //DELETE ITEM
    @HTTP(method = "DELETE",path = "users/deleteitems",hasBody = true)
    Call<DeleteResponse> deleteItem(@Body DeleteRequest request);

    //itemRequest
    @POST("users/requestitems")
    Call<UpdateResponse> requestItem(@Body UpdateRequest request);


*/

}
