package syntax;

public class Array {

    public static void main(String[] args) {
//        String[] namesOfMonths = new String[12];
//        namesOfMonths[0] = "Январь";
//        namesOfMonths[1] = "Февраль";
//        namesOfMonths[2] = "Март";
//        namesOfMonths[3] = "Апрель";
//        namesOfMonths[4] = "Май";
//        namesOfMonths[5] = "Июнь";
//        namesOfMonths[6] = "Июль";
//        namesOfMonths[7] = "Август";
//        namesOfMonths[8] = "Сентябрь";
//        namesOfMonths[9] = "Октябрь";
//        namesOfMonths[10] = "Ноябрь";
//        namesOfMonths[11] = "Декабрь";
//        for (int i = 0; i < namesOfMonths.length; i++) {
//            if (i < namesOfMonths.length - 1) {
//                System.out.print(namesOfMonths[i] + "," + " ");
//            }
//            else {
//                System.out.print(namesOfMonths[i] + ".");
//            }
//        }
//        int[] numbers = {4, 1, 34, 45, 13, 13};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int[] numbers = {4, 1, 34, 45, 13, 13};
        for (int i = numbers.length - 1; i >=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
