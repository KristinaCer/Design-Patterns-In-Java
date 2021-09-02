package com.kristina.creational_patterns.AbstractFactory;

public class MercedesFactory implements Factory {

    @Override
    public Tire makeTire() {
        return new MercedesTire();
    }

    @Override
    public Headlight makeHeadlight() {
        return new MercedesHeadlight();
    }
}
