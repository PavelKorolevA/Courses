package syntax;

public class SwitchCase {

    public static void main(String[] args) {
//        int mounth = 5;
//        switch (mounth) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Unknown");
//        }
//        ДЗ: Напишите программу, которая на вход принимает название месяца и выводит в консоль к какому сезону
//                относится этот месяц. Например: если ввести июль, то выводит лето; если сентябрь, то осень и т.д.

        String mounth1 = "May";
            switch (mounth1) {
                case "December":
                case "January":
                case "February":
                    System.out.println("Winter");
                    break;
                case "March":
                case "April":
                case "May":
                    System.out.println("Spring");
                    break;
                case "June":
                case "July":
                case "August":
                    System.out.println("Summer");
                    break;
                case "September":
                case "October":
                case "November":
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Unknown");
            }
    }
}
