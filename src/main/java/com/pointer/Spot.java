package com.pointer;

public class Spot {
    private BusinessLogic businessLogic;
    private double currentPrice;
    private double proximityToLocation;

    public Spot(double currentPrice, double proximityToLocation) {
        this.currentPrice = currentPrice;
        this.proximityToLocation = proximityToLocation;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getProximityToLocation() {
        return proximityToLocation;
    }
}
