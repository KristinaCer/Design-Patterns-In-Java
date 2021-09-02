package com.kristina.creational_patterns.Singleton;

public class DBConnection {

    //holds one instance of the DBConnection class
    private static DBConnection instance;

    //A class that can’t be instantiated because it
    //has a private constructor
    private DBConnection() {
    }

    /* --The getInstance ( ) method gives us a way to instantiate
    the class and also return an instance of it.

    --If we never need the unique instance, it never gets created -> LAZY INSTANTIATION.

   -- The getInstance() method is static, which means it is a
   class method, so you can conveniently access this method anywhere in your
   code using Singleton.getInstance().
   That’s just as easy as accessing a global variable,
   but we get benefits like lazy instantiation from the Singleton. */

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
