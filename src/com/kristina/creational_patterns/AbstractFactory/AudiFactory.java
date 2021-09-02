package com.kristina.creational_patterns.AbstractFactory;

public class AudiFactory implements Factory {

    @Override
    public Tire makeTire() {
        return new AudiTire();
    }

    @Override
    public Headlight makeHeadlight() {
        return new AudiHeadlight();
    }
}
