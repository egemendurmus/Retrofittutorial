package com.example.egemendurmus.retrofittutorial.Model;

/**
 * Created by egemendurmus on 28.11.2017.
 */

public class MovieItems {

    private String small;
    private String medium;
    private String large;
    private String name;
    private String timestamp;
    private AppModel.Url url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppModel.Url getUrl() {
        return url;
    }

    public void setUrl(AppModel.Url url) {
        this.url = url;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}
