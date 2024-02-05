package oop.homeWork;

public class Monster {

    int eyes;
    int hands;
    int legs;


    Monster(int quantity) {
        this(quantity, quantity, quantity);
    }

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    Monster() {
        this(2);
    }

    void showInfo() {
        System.out.println("Я монстр и уменя есть " + eyes + " глаза, " + hands + " руки и " + legs + " ноги.");
    }


    void voice () {
        voice(1);
    }

    void voice (int count) {
        voice(count, "Grrrrrrrrrr...");
        }

    void voice (int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
