package com.kristina.creational_patterns.AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ABSTRACT FACTORY PATTERN//

        System.out.println("Select car type");
        Scanner scanner = new Scanner(System.in);
        String userSelection = scanner.nextLine();
        Factory factory;

        if (userSelection.toLowerCase().equals("mercedes")) {
            factory = new MercedesFactory();
        } else {
            factory = new AudiFactory();
        }
        Headlight headlight = factory.makeHeadlight();
        System.out.println(headlight.getHeadlight());
        Tire tire = factory.makeTire();
        System.out.println(tire.getTire());
    }
}
