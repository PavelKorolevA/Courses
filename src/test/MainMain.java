package test;

import Inheritans.*;

public class MainMain {

//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();
//    }

//    public static void main(String[] args) {
//        Box box = new Box(10,10,10);
//        WeightBox weightBox = new WeightBox(10,20);
//        box.showInfo();
//        weightBox.showInfo();
//    }

    public static void main(String[] args) {
        Shape shape = new Shape(5,5);
        Rectangle rectangle = new Rectangle(5,5);
        Triangle triangle = new Triangle(5,5,5);
        shape.Perimeter();
        rectangle.Perimeter();
        triangle.Perimeter();
    }
}
