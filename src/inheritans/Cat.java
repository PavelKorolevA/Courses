package inheritans;

public class Cat extends CatFamily {

    public Cat() {
        super(4,2,false);
    }

    @Override                      //анотация, которая указывает, что метод переопределен
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
