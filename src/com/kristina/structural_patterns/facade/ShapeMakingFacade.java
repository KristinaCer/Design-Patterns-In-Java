package com.kristina.structural_patterns.facade;

/*Facade is a structural design pattern that provides a simplified interface to a library,
 a framework, or any other complex set of classes. It includes only those features that clients really care about.*/

public class ShapeMakingFacade {
    private Rectangle rectangle = new Rectangle();
    private Square square = new Square();

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
