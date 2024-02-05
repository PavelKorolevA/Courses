package oop.homeWork;

public class Dog {

    String name;
    String breed;
    int weight;
    int speed;

    String getInformation() {

        return "Имя: " + name + " Порода: " + breed + " Вес: " + weight;
    }

    void getRun() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }
}
