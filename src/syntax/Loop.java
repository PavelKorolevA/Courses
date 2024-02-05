package syntax;

public class Loop {

    public static void main(String[] args) {
//        int i = 1;
//        while (i<=1000) {
//            if (i % 2 == 0) {                       Проверкак чтоделится на 2 без остатка
//                System.out.println(i);
//            }
//            i++;
//        }
//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//            if (i == 5) {
//                break;                              Выход из цикла
//            }
//        }
//         for (int i = 1; i <= 1000; i++) {
//             System.out.println(i);
//         }

//        ДЗ: При помощи цикла for вывести все числа от 1000 до 0 и выводить те числа,
//        которые без остатка деляться на 3
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
