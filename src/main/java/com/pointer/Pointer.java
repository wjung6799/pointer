package com.pointer;

import java.util.List;

public class Pointer {

    private String address;
    private Preference preference;
    private String time;
    private List<Spot> spots;

    public Pointer(String address, Preference preference, String time) {
        this.address = address;
        this.preference = preference;
        this.time = time;
    }

    public List<Spot> search() {

        return spots;
    }

    public void select(Spot choice) {
        //GeoApiContext context = new GeoApiContext.Builder();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
