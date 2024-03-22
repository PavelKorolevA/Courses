package multithreading.HomeWork;

import java.util.Random;

public class Main {

    static boolean winner = false;

    public static void main(String[] args) {
//        В методе main  сгенерировать случайное число от 0 до миллиарда. Создать поток, который будет угадывать
//            это число, причем не перебирая все числа подрят от 0 до миллиарда, я также используя случайные числа. Он будет
//                генерировать случайное число и проверять угадал он или нет, если нет, то генерировать следующее
//        число. Второй поток будет выводить в консоль секунды до тех пор пока первый поток не угадает число.

        int bound = 1_000_000_000;
        Random random = new Random();
        int number = random.nextInt(bound);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = random.nextInt(bound);
                }while (option != number);
                winner = true;
                System.out.println("Winner: " + option);
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (winner) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread2.start();
    }
}
