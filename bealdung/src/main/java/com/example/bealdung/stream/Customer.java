package com.example.bealdung.stream;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Customer {

    private String name;
    private int points;
    private String profilePhotoUrl;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public Customer(String name, int points, String profilePhotoUrl) {
        this.name = name;
        this.points = points;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public boolean hasValidProfilePhoto() throws IOException {
        URL url = new URL(this.profilePhotoUrl);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
    }
}
