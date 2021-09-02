package com.kristina.structural_patterns.adapter;

public class BugattiVeyron implements Movable{
    @Override
    public double getSpeed() {
        return 268;
    }

    @Override
    public double getPrice() {
        return 100000;
    }
}
