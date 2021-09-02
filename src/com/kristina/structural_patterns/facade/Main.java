package com.kristina.structural_patterns.facade;

public class Main {
    public static void main(String[] args) {

        //FACADE PATTERN//
        ShapeMakingFacade facade = new ShapeMakingFacade();
        facade.drawRectangle();
    }
}
