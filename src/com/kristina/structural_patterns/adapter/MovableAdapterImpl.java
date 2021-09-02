package com.kristina.structural_patterns.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    @Override
    public double getPrice() {
        return convertDollarsToEu(luxuryCars.getPrice());
    }
    private double convertDollarsToEu(double dollars) {
        return dollars * 0.85;
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
