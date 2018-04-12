package com.saproductions.cricket_prediction_mait.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.saproductions.cricket_prediction_mait.Models.Request;
import com.saproductions.cricket_prediction_mait.Models.Response;
import com.saproductions.cricket_prediction_mait.Others.Constants;
import com.saproductions.cricket_prediction_mait.R;
import com.saproductions.cricket_prediction_mait.Utilities.AlertHelper;
import com.saproductions.cricket_prediction_mait.Utilities.Network.RetrofitClient;
import com.saproductions.cricket_prediction_mait.Utilities.Network.RetrofitService;
import com.saproductions.cricket_prediction_mait.Utilities.SharedPreferenceManager;

import cn.pedant.SweetAlert.SweetAlertDialog;
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import retrofit2.Call;
import retrofit2.Callback;


public class Result extends AppCompatActivity {

    SharedPreferenceManager sp;
    Request mRequest;
    TextView textView;
    ImageView logo;
    Button check;
    KonfettiView konfettiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        final AlertHelper alertHelper = new AlertHelper();
//        alertHelper.createProgressAlert(Result.this, "Building Models");
//        alertHelper.showDemoAlert(1000);

        logo = (ImageView)findViewById(R.id.logo);
        konfettiView = (KonfettiView)findViewById(R.id.konfView);
        sp = new SharedPreferenceManager(getApplicationContext());
        check = (Button)findViewById(R.id.resumlt_againbutton);
        textView = (TextView)findViewById(R.id.result_TV);


//        buildAndShowAnimation();



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result.this, MainActivity.class));
                finish();
            }
        });
        mRequest = serializeData();


        RetrofitService retrofitService = RetrofitClient.getClient().create(RetrofitService.class);
        Call<Response> responseCall = retrofitService.getResponse(mRequest.getmOppositionTeam(), mRequest.getmStadiumVenue(), mRequest.getmCountryVenue(),mRequest.getmMatchType(), mRequest.getmBatFirst());
        responseCall.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

//                alertHelper.hideAlert();
                buildAndShowAnimation();

                int result = response.body().getResult();

                        if(result == 1){
                            textView.setText("INDIA");
                            logo.setImageResource(Constants.LOGOINDIA);
                        }

                        else{
                            textView.setText(mRequest.getmOppositionTeam());
                            logo.setImageResource(mRequest.getmLogo());
                        }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

//                alertHelper.hideAlert();

                AlertHelper alertHelper1 = new AlertHelper();
                alertHelper1.createErrorAlert(Result.this, "Something Went Wrong", new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog.dismiss();
                        sweetAlertDialog.hide();
                    }
                });

                alertHelper1.showAlert();

            }
        });



//        textView.setText(mRequest);

    }

    Request serializeData(){

        Request mRequest = new Request();
        mRequest.setmLogo(sp.getInt(Constants.KEY_LOGO, R.drawable.wall));
        mRequest.setParams(sp.getInt(Constants.KEY_BATFIRST, 1), sp.getInt(Constants.KEY_MATCHTYPE, 1));
        mRequest.setmCountryVenue(sp.getString(Constants.KEY_COUNTRYVENUE, " "));
        mRequest.setmOppositionTeam(sp.getString(Constants.KEY_OPPOSITIONTEAM, " "));
        mRequest.setmStadiumVenue(sp.getString(Constants.KEY_STADIUMVENUE, " "));

        return mRequest;
    }


    void buildAndShowAnimation(){
        konfettiView.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN)
                .setDirection(0.0, 100.0)
                .setSpeed(1f, 15f)
                .setFadeOutEnabled(true)
                .setTimeToLive(7000L)
                .addShapes(Shape.RECT, Shape.CIRCLE)
                .setPosition(-50f, konfettiView.getWidth() + 150f, -150f, -50f)
                .stream(120, 7000L);

    }

}
