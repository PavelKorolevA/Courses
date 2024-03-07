package test;

// Проверка на простое число

public class Qwest {

    public static void main(String[] args) {

        int i;
        int max = 100;
        boolean isSimple;
        String simpleNumbersFound = "";
        for (i = 2; i <= max; i++) {
            isSimple = CheckSimple(i);
            if (isSimple) {
                simpleNumbersFound = simpleNumbersFound + i + " ";
            }
        }

        System.out.println("Простые числа от 1 до " + max);
        System.out.print(simpleNumbersFound);
        }
        public static boolean CheckSimple (int numberToCheck) {
        int remainer;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainer = numberToCheck % i;
            if (remainer == 0) {
                return false;
            }
        }
        return true;
        }
    }
