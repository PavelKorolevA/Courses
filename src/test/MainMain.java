package test;

import inheritans.*;
import oop.homeWork.Human;

import java.util.Random;

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

//    public static void main(String[] args) {
//        Shape shape = new Shape(5,5);
//        Rectangle rectangle = new Rectangle(5,5);
//        Triangle triangle = new Triangle(5,5,5);
//        shape.Perimeter();
//        rectangle.Perimeter();
//        triangle.Perimeter();
//    }

//    public static void main(String[] args) {
//        Human human = new Human("John", 20);
//        System.out.println(human);
//    }

    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            int a = random.nextInt(6) + 5;
//            System.out.print(a + " ");
//        }

        //ДЗ Имитация броска кубика от 1 до 6
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
           int number = random.nextInt(6) + 1;
           String result = String.format("Выше число %s", number);
            System.out.println(result);
        }
    }
}
