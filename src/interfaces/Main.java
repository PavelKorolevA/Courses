package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        UPCAST
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        for (Animal animal: animals) {
//            animal.eat();
//        }
//        DAWNCAST
//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();

//        Пример с созданием интерфейса
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (AbleToRun animal: animals) {
            animal.run();
        }
//        AbleToFly ableToFly = new Bird();
//        ableToFly.fly();

//        AbleToRun ableToRun = new Dog();
//        Dog dog = (Dog) ableToRun;



    }
}
