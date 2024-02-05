package syntax;

public class ForEach {

    public static void main(String[] args) {
//        String[] names = {
//                "Jonh",
//                "Nick",
//                "Steve",
//                "Palmer",
//                "Frosya"
//        };
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        for (String name : names) {
//            System.out.println(name);
//        }

//        ДЗ: Создать массив целых чисел размером 100 элементов и проинициализировать его
//        (т.е.присвоить значения его элементам) от 100 до 200, т.е. значения элемента с индексом 0 будет 100 и т.д.
//        После этого при помощи цикла for each вывести все значения в консоль.

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
            }
        for (int number : numbers) {
            System.out.println(number);
        }
        }
    }

