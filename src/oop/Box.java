package oop;

public class Box {

    private double length;
    private double width;
    private double height;

    Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size,size,size);
    }

    public void showInfo() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public void setDimens (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }


    //ДЗ№7
    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    //ДЗ№8
    public Box Increas () {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public double getLength(double length) {
        this.length = length;
        return length;
    }

    public double getWidth(double width) {
        this.width = width;
        return width;
    }

    public double getHeight(double height) {
        this.height = height;
        return height;
    }
}
