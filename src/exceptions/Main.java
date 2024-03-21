package exceptions;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        try {
//            int b = 7 / a;
//            int c = Integer.parseInt("no string");
//        } catch (ArithmeticException e1) {
//            System.out.println("Строку делить на ноль нельзя");
//        } catch (Exception e){
//            System.out.println("Exception " + e.getClass());
//        }
//        System.out.println("Hello");

//        ДЗ№1
//        Создайте программу, которая бросит исключение, которая пишется так ArrayIndexOutOfBoundsException.
//        И обработать это исключение в блоке try catch.

        int [] numbers = {1, 2, 3, 4, 5};
        try {
            for (int i = numbers.length; true; i--) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вышли за предел массива");
        }

    }
}
