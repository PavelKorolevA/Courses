package inheritans;

public class Shape {

    protected int a;
    protected int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Perimeter() {
        int P = a+b;
        System.out.println(P);
    }
}
