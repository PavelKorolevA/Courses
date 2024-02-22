package Inheritans;

public class Rectangle extends Shape{

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public void Perimeter() {
        int P = (a+b)*2;
        System.out.println(P);
    }
}
