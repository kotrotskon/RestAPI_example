package com.example.restapi_example;

import org.json.JSONException;
import org.json.JSONObject;

public class Case {

    private String date;
    private int positive;
    private int negative;
    private int pending;
    private int death;
    private int hospitalized;

    public Case() {
    }

    public Case(JSONObject jsonObject) throws JSONException {
        this.date = jsonObject.getString("date");
        this.positive = jsonObject.getInt("positive");
        this.negative = jsonObject.getInt("negative");
        this.pending = jsonObject.getInt("pending");
        this.death = jsonObject.getInt("death");
        this.hospitalized = jsonObject.getInt("hospitalized");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(int hospitalized) {
        this.hospitalized = hospitalized;
    }

    @Override
    public String toString() {
        return "Case{" +
                "date='" + date + '\'' +
                ", positive=" + positive +
                ", negative=" + negative +
                ", pending=" + pending +
                ", death=" + death +
                ", hospitalized=" + hospitalized +
                '}';
    }
}
