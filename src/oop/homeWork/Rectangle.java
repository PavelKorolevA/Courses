package oop.homeWork;

public class Rectangle {
    double lenght;
    double width;

    void setValue (int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    void getSquare () {
        double square = lenght * width;
        System.out.println(square);
    }
}
