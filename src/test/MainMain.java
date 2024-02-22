package test;

import Inheritans.Cat;
import Inheritans.Lion;
import oop.Box;
import oop.WeightBox;

public class MainMain {

//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();
//    }

    public static void main(String[] args) {
        Box box = new Box(10,10,10);
        WeightBox weightBox = new WeightBox(10,20);
        box.showInfo();
        weightBox.showInfo();
    }
}
