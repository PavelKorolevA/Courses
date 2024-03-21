package inheritans;

public class Triangle extends Shape {

    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void Perimeter() {
        int P = a+b+c;
        System.out.println(P);
    }
}
