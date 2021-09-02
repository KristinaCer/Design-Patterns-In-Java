package com.kristina.creational_patterns.Builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 10;
    }
}
