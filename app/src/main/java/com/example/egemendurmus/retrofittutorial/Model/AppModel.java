package com.example.egemendurmus.retrofittutorial.Model;

/**
 * Created by egemendurmus on 28.11.2017.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AppModel {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("url")
    @Expose
    private Url url;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;

    public class Url {

        @SerializedName("small")
        @Expose
        private String small;
        @SerializedName("medium")
        @Expose
        private String medium;
        @SerializedName("large")
        @Expose
        private String large;
    }




}