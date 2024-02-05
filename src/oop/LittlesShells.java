package oop;

import oop.homeWork.Human;

public class LittlesShells {

    public static void main(String[] args) {
//        int a = 5;
//        Integer a1 = 5;
//
//        byte b;
//        Byte b1;
//
//        short c;
//        Short c1;
//
//        long d;
//        Long d1;
//
//        char e;
//        Character e1;
//
//        float g;
//        Float g1;
//
//        double h;
//        Double h1;
//
//        boolean i;
//        Boolean i1;


        String  s = "This is John. He is 27 years old";
        String name = s.substring(8,12);
        String ages = s.substring(20,22);
        int age = Integer.parseInt(ages);

        Human human = new Human(name,age);
        System.out.println("Name: " + human.getName() + " Age: " + human.getAge());
    }
}
