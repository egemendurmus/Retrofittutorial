package com.example.egemendurmus.retrofittutorial.RestClient;

import com.example.egemendurmus.retrofittutorial.Model.AppModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by egemendurmus on 28.11.2017.
 */

public interface RetroInterface {
    @GET("/json/glide.json")
    Call<AppModel[]> getJsonValues();
}