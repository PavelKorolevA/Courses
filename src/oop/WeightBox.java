package oop;

public class WeightBox extends Box{

    private double weight;

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double length, double width, double height) {
        super(length, width, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }
}
