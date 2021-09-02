package com.kristina.structural_patterns.adapter;

import static org.junit.Assert.*;

public class MovableAdapterImlTest {

    Movable bugattiVeyron = new BugattiVeyron();
    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

    @org.junit.Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted(){
        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }

    @org.junit.Test
    public void whenConvertingDollarsToEU_thenSuccessfullyConverted(){
        assertEquals(bugattiVeyronAdapter.getPrice(), 85000, 0.1);
    }
}