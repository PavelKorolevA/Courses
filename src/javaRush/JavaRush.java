package javaRush;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class JavaRush {

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


//        У вас есть переменные x1, x2, x3, которые содержат входные пользовательские данные.
//        Напишите код, который находит максимальное и минимальное число из x1, x2, x3 и записывает результат в переменную result.

//        int x1, x2, x3;
//        String result;
//        int min;
//        int max;
//
//        int[] inputValues = readInput();
//        x1 = inputValues[0];
//        x2 = inputValues[1];
//        x3 = inputValues[2];
//        min = x1;
//        min = Math.min(min, x2);
//        min = Math.min(min, x3);
//        max = x1;
//        max = Math.max(max, x2);
//        max = Math.max(max, x3);
//        result = "минимальное: " + min + ", максимальное: " + max;
//
//        System.out.println(result);
//    }
//
//    public static int[] readInput() {
//        int[] inputValues = new int[3];
//
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextLine()) {
//            String input = scanner.nextLine();
//            String[] values = input.split(" ");
//            for (int i = 0; i < 3; i++) {
//                inputValues[i] = Integer.parseInt(values[i]);
//            }
//        }
//        scanner.close();
//
//        return inputValues;



//        У вас есть переменная stars, которая содержит входные пользовательские данные.
//
//        Значение переменной stars от 1 до 5.
//
//        1 — ★
//        2 — ★★
//        3 — ★★★
//        4 — ★★★★
//        5 — ★★★★★
//
//        Напишите код, который проверяет значение переменной stars и записывает результат в переменную result.

//        int stars = readInput();
//        String result;
//        switch (stars) {
//            case (1):
//                result = "★";
//                System.out.println(result);
//                break;
//            case (2):
//                result = "★★";
//                System.out.println(result);
//                break;
//            case (3):
//                result = "★★★";
//                System.out.println(result);
//                break;
//            case (4):
//                result = "★★★★";
//                System.out.println(result);
//                break;
//            case (5):
//                result = "★★★★★";
//                System.out.println(result);
//                break;
//        }
//    }
//
//    public static int readInput() {
//        int stars = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextLine()) {
//            stars = Integer.parseInt(scanner.nextLine());
//        }
//        scanner.close();
//
//        return stars;



//        У вас есть переменные x, y и direction которые содержат входные пользовательские данные.
//
//                x, y содержат числа - стартовая позиция игрока.
//
//        direction содержит направление движения, одного из: up, down, left, right.
//        Напишите код, который высчитывает новую позицию игрока после перемещения в этом направлении на 1 и записывает результат в переменную result

        int x, y;
        String direction, result;
        String down, up, left, right;

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];

        result = "x: " + x + ", y: " + y + ", direction: " + direction;
        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }
}