package javaRush;

import java.awt.*;
import java.util.Scanner;

public class JavaRush {
    public static int [] strings = new int[] {1, 2, 3, 4, 5};
    public static void main(String[] args) {

//        В этой задаче нужно:
//
//        Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//        Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
//                Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.

//        Scanner scanner = new Scanner(System.in);
//        String stroka = scanner.nextLine();
//        int number = scanner.nextInt();
//        do {
//            System.out.println(stroka);
//            number--;
//        } while (number > 0 && number < 4);


//        Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
//        Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
//                Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
//        Для округления необходимо использовать метод Math.round().
//
//        Scanner scanner = new Scanner(System.in);
//        long x = scanner.nextInt();
//        long summa = Math.round(x * 3.6);
//        System.out.println(summa);

//        В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
//        Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
//            Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
//            В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
//            если пессимист (false) и до целого числа вверх (1), если оптимист (true).
//                Результат вывести на экран.

//        double glass = 0.5;
//        Scanner scanner = new Scanner(System.in);
//        boolean x = scanner.nextBoolean();
//        int result;
//        if (x == true) {
//            result = (int) Math.ceil(glass);
//        } else {
//            result = (int) Math.floor(glass);
//        }
//        System.out.println(result);


//        for (int i = 0; i < strings.length; i++) {
//            if ((strings[i] % 2) == 0 ) {
//                strings[i] *= -1;
//            }
//            System.out.println(strings[i]);
//        }

        int x = 100;
        int y = 1000;
        for (int i = 0; i < x| i > y; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}