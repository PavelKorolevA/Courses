package javaRush;

import java.util.*;

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

//        int x, y;
//        String direction, result;
//        String down, up, left, right;
//
//        String[] inputValues = readInput();
//        x = Integer.parseInt(inputValues[0]);
//        y = Integer.parseInt(inputValues[1]);
//        direction = inputValues[2];
//
//        result = "x: " + x + ", y: " + y + ", direction: " + direction;
//        System.out.println(result);
//    }
//
//    public static String[] readInput() {
//        String[] inputValues = new String[3];
//
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextLine()) {
//            String input = scanner.nextLine();
//            String[] values = input.split(" ");
//            for (int i = 0; i < 3; i++) {
//                inputValues[i] = values[i];
//            }
//        }
//        scanner.close();
//
//        return inputValues;


//        На вход подаются целых три числа - день, месяц и год (по григорианскому календарю). Выведите true, если эти
//        числа составляют валидную дату, и false - в противном случае.

//        Примечание. Не все года одинаковые.

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        int month = sc.nextInt();
//        int year = sc.nextInt();
//
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        boolean isValid = true;
//
//        if (month < 1 || month > 12) {
//            isValid = false;
//        } else if (day < 1 || day > 31 || year < 0) {
//            isValid = false;
//        } else if (month == 2) {
//            if (isLeapYear) {
//                if (day > 29) {
//                    isValid = false;
//                }
//            } else {
//                if (day > 28) {
//                    isValid = false;
//                }
//            }
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            if (day > 30) {
//                isValid = false;
//            }
//        }
//
//        System.out.println(isValid);


//        На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке.
//                Гарантируется, что слова начинаются с разных букв.

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int c = sc.nextInt();
//        int a = 0;
//        if (x >= y) {
//            if (x >= c) {
//                if (c > y) {
//                    x = c;
//                } else {
//                    x = y;
//                }
//            } else {
//                if (c > y) {
//                    x = y;
//                }
//            }
//        } else {
//            if (x >= c) {
//                if (c > y) {
//                    x = c;
//                } else {
//                    x = a;
//                }
//            } else {
//                if (c > y) {
//                    x = y;
//                } else {
//                    x = c;
//                }
//            }
//        }
//        System.out.println(x);

//        ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются.
//        Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит
//        определённый уровень. Определите, грозит ли ООО "Круче Гугла" забастовка.
//
//                Формат ввода:
//
//        В первой строке - зарплаты разработчиков через пробел, три целых числа.
//
//        Во второй строке - разница, при превышении которой будет объявлена забастовка.
//
//                Формат вывода:
//
//        "Ура, бастуем!" - если критический уровень превышен;
//
//        "За работу, Солнце ещё высоко" - если критический уровень не превышен.

//        Scanner sc = new Scanner(System.in);
////        int salary1 = sc.nextInt();
////        int salary2 = sc.nextInt();
////        int salary3 = sc.nextInt();
////        int difference = sc.nextInt();
////        int min;
////        int max;
////        int result;
////        min = salary1;
////        min = Math.min(min, salary2);
////        min = Math.min(min, salary3);
////        max = salary1;
////        max = Math.max(max, salary2);
////        max = Math.max(max, salary3);
////        result = max - min;
////        if (result > difference) {
////            System.out.println("Ура, бастуем!");
////        } else {
////            System.out.println("За работу, Солнце ещё высоко");
////        }


//        Задача повышенной сложности
//
//        На числовой прямой даны два отрезка, заданных парами целых чисел:[a1,b1] и [a2, b2]. Напишите программу,
//        которая находит их пересечение.
//    Если пересечение - отрезок, необходимо вывести два числа (границы отрезка),
//    если единственная точка - единственное число (точку), если пересечения нет - вывести фразу "Пересечения нет" (без кавычек).


//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        int a2 = sc.nextInt();
//        int b2 = sc.nextInt();
//        sc.close();
//        if ((a2>b1&&b2>b1)||(a2<a1&&b2<a1)) {System.out.println("Пересечения нет");} else
//        if (a2==b1) {System.out.println(a2);} else
//        if (b2==a1) {System.out.println(b2);} else
//        if (a1>=a2&&b1<=b2) {System.out.println (a1 + " " + b1);} else
//        if (a1<=a2&&b1<=b2) {System.out.println (a2 + " " + b1);} else
//        if (a1>=a2&&b1>=b2) {System.out.println (a1 + " " + b2);} else
//        if (a1<=a2&&b1>=b2) {System.out.println (a2 + " " + b2);}


//        На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = Math.max(Math.max(a, b), c);
//        int mid = (a + b + c) / 3;
//        if (max % 2 == 0) {
//            System.out.println(max);
//        } else if (mid % 2 == 0) {
//            System.out.println(mid);
//        } else {
//            System.out.println("Чётных чисел нет");
//        }


//        Реализуйте простой справочник по командам Java. На вход подаётся команда, по которой необходима справка
//                (ограничимся тремя командами). В соответствии с этим выведите текст:
//
//        Ввод: System.out.println()
//
//        Вывод: Это команда вывода на печать
//
//        Ввод: if
//
//        Вывод: Это условный оператор
//
//        Ввод: else
//
//        Вывод: Это альтернативная конструкция условного оператора
//
//        Если введено что-либо другое, выведите фразу "Раздел в разработке" (без кавычек).

//        Scanner sc = new Scanner(System.in);
//        String command = sc.nextLine();
//        switch (command) {
//            case ("System.out.println()"):
//                System.out.println("Это команда вывода на печать");
//                break;
//            case ("if"):
//                System.out.println("Это условный оператор");
//                break;
//            case ("else"):
//                System.out.println("Это альтернативная конструкция условного оператора");
//                break;
//            default:
//                System.out.println("Раздел в разработке");
//        }


//        На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.

//        Scanner sc = new Scanner(System.in);
//        int three = sc.nextInt();
//        int number = sc.nextInt();
//        three = Math.abs(three);
//        number = Math.abs(number);
//        String userInputThree = Integer.toString(three);
//        String userInputNumber = Integer.toString(number);
//        char charThree = userInputThree.charAt(1);
//        char charNumber = userInputNumber.charAt(0);
//        if (three >= 100 && three < 1000) {
//            if (charThree == charNumber) {
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
//        } else {
//            System.out.println("error");
//        }


//        На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.

//        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        String.format(String.valueOf(sc), a);
//        String.format(String.valueOf(sc), b);
//            if (a < b) {
//                System.out.println("<");
//            } else if (a > b) {
//                System.out.println(">");
//            } else if (a == b) {
//                System.out.println("=");
//            }


//        Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        String season;
//        switch (number) {
//            case (1):
//            case (2):
//            case (12): {
//                season = "Зима";
//                System.out.println(season);
//                break;
//            }
//            case (3):
//            case (4):
//            case (5): {
//                season = "Весна";
//                System.out.println(season);
//                break;
//            }
//            case (6):
//            case (7):
//            case (8): {
//                season = "Лето";
//                System.out.println(season);
//                break;
//            }
//            case (9):
//            case (10):
//            case (11): {
//                season = "Осень";
//                System.out.println(season);
//                break;
//            }
//            default: {
//                season = "error";
//                System.out.println(season);
//            }
//        }


//        На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.
//        y = 2 -x(2)  y = x.

//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        if (x >= 0 && y <= 2-x*x && y >=0 || x < 0 && y >= x && y <=2-x*x) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }



//        Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶.
//                В кабинет совещаний могут войти только те, кто указан в специальном списке: Джефф Безос, Илон Маск,
//                Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказать фразу-приветствие.
//                Если фраза-приветствие содержит имя из списка, проход разрешается. Если же нет - проход блокируется.
//
//                На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!",
//                если имя есть в списке, и "Здесь никого нет, Вы ошиблись дверью" - если нет.
//
//                Примечание. Буква "ё".


//        Scanner sc = new Scanner(System.in);
//        String phrase = sc.nextLine();
//        String geff = "Джефф Безос";
//        String ilon = "Илон Маск";
//        String mark = "Марк Цукерберг";
//        String bill = "Билл Гейтс";
//        if (phrase.contains(geff) || phrase.contains(ilon) || phrase.contains(mark) || phrase.contains(bill)) {
//            System.out.println("Добро пожаловать!");
//        }  else {
//            System.out.println("Здесь никого нет, Вы ошиблись дверью");
//        }


//        На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".

//        Scanner sc = new Scanner(System.in);
//        String stroka = sc.nextLine();
//        int lettersCount = 0;
//        for (int i = 0; i < stroka.length(); i++) {
//            if (Character.isAlphabetic(stroka.charAt(i))) {
//                lettersCount++;
//            }
//        }
//        switch (lettersCount) {
//            case (1): {
//                System.out.println("Одна буква");
//                break;
//            }
//            case (2): {
//                System.out.println("Две буквы");
//                break;
//            }
//            case (3): {
//                System.out.println("Три буквы");
//                break;
//            }
//            case (4): {
//                System.out.println("Четыре буквы");
//                break;
//            }
//            case (5): {
//                System.out.println("Пять букв");
//                break;
//            }
//            default: {
//                System.out.println("Длинное слово");
//            }
//        }


//        На вход подаётся натуральное число n. Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 1;
        while (n >= y) {
            System.out.println(y++);
        }
    }
}