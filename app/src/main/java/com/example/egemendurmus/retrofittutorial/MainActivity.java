package com.example.egemendurmus.retrofittutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.egemendurmus.retrofittutorial.Model.AppModel;
import com.example.egemendurmus.retrofittutorial.Model.MovieItems;
import com.example.egemendurmus.retrofittutorial.RestClient.RetroClient;
import com.example.egemendurmus.retrofittutorial.RestClient.RetroInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<AppModel> moviesData = new ArrayList<>();
    AppModel appModel =new AppModel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetroInterface retroInterface = RetroClient.getClient().create(RetroInterface.class);

        Call<AppModel[]> call = retroInterface.getJsonValues();

        call.enqueue(new Callback<AppModel[]>() {
            @Override
            public void onResponse(Call<AppModel[]> call, Response<AppModel[]> response) {

               moviesData = Arrays.asList(response.body());

                for (AppModel modelValues : moviesData) {

                    MovieItems items = new MovieItems();
                    items.setName(modelValues.name);
                    items.setTimestamp(modelValues.timestamp);
                    System.out.println(items.getName());
                    System.out.println(items.getTimestamp());


                }


            }



            @Override
            public void onFailure(Call<AppModel[]> call, Throwable t) {

            }
        });


    }
}
