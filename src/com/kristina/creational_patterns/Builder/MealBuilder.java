package com.kristina.creational_patterns.Builder;

public class MealBuilder {
    /*
    Use the Builder pattern to get rid of a “telescopic constructor”.

    Say you have a constructor with ten optional parameters. Calling such a beast is very inconvenient;
    therefore, you overload the constructor and create several shorter versions with fewer parameters.
    These constructors still refer to the main one, passing some default values into any omitted parameters.

     Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).

     The Builder pattern can be applied when construction of various representations of the product involves similar steps that differ only in the details.
     The base builder interface defines all possible construction steps, and concrete builders implement these steps to construct particular representations
      of the product. Meanwhile, the director class guides the order of construction.

       Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).

       The Builder pattern can be applied when construction of various representations of the product involves similar steps that differ only in the details.
       The base builder interface defines all possible construction steps, and concrete builders implement these steps to construct particular representations of
       the product. Meanwhile, the director class guides the order of construction.
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
