package oop.homeWork;

public class Worker {
    String name;
    String jobTitle;
    int salary;

    Worker(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Имя: " + name + " Должность: " + jobTitle + " Зарплата: " + salary);
    }
}
