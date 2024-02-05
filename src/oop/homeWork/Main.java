package oop.homeWork;

public class Main {

    public static void main(String[] args) {
//        ДЗ№1
//        Human human1 = new Human();
//        human1.name = "Jhon";
//        human1.age = 27;
//        human1.weight = 80;
//
//        Human human2 = new Human();
//        human2.name = "Nick";
//        human2.age = 23;
//        human2.weight = 75;
//
//        Human human3 = new Human();
//        human3.name = "Polina";
//        human3.age = 21;
//        human3.weight = 48;
//
//        int averageAge = (human1.age + human2.age + human3.age) / 3;
//        System.out.println(averageAge);
//
//        ДЗ№2
//        Dog Rax = new Dog();
//        Rax.name = "Rax";
//        Rax.breed = "Shepherd";
//        Rax.weight = 30;
//
//        ДЗ№3
//        String informationDog = Rax.getInformation();
//        System.out.println(informationDog);
//        Dog dog = new Dog();
//        dog.speed = 55;
//        dog.getRun();

//        ДЗ№4
//        Rectangle rectangle = new Rectangle();
//        rectangle.setValue(11,23);
//        rectangle.getSquare();

//        ДЗ№5
//          Worker worker = new Worker("Jhon","QA", 200_000);
//          worker.showInfo();

//          ДЗ№6
//            Monster monster = new Monster(5);
//            monster.showInfo();
//            monster.voice(5, "Aaaaaaaaaaaaagrrrrrrrr");


//          ДЗ№8 метод будет лежать в классе Box и выполнено в основном Main.


        Human human = new Human("John", 25);
        human.setAge(10);
        System.out.println("Name: " + human.getName() + " Age: " + human.getAge());

    }
}
