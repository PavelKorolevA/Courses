package oop;

import com.sun.beans.editors.StringEditor;
import test.MyArrayList;

import java.util.ArrayList;

public class MyMain {

    public static void main(String[] args) {
        ArrayList<String> employees = getEmployees();                 //получаем все элементы коллекции
        employees.add("James");                                 // добавляем сотрудника
        employees.remove("Olivia");                         // Удаляем сотруника
        employees.remove(0);
        for (String employee : employees) {                    // пока I меньше size
            System.out.println(employee);                      // мы выводим в консоль экземпляр нашей коллекции
        }
    }

    private static ArrayList<String> getEmployees() {                //возвращает экземпляр нашего класса
        ArrayList<String> employees = new ArrayList<>();             // создаем экземпляр коллекции
        employees.add("John");                                 // вызываем метод add
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}
