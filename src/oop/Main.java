package oop;

public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box(20,20,20);
//       //box1.setDimens(10, 10,10);
//        Box box2 = new Box(10,10,10);
//       // box2.setDimens(20,20,20);
//        box1.showVolume();
//        box2.showVolume();


//        ДЗ№1: создать класс Человек, у которого есть поля: имя, возраст и вес. После этого в классе main внутри метода main
//                создать три экземпляра класса человек присвоить значение всем полям и после этого вывести в консоль средний возраст
//                всех людей.

//        ДЗ№2 создать класс Собака с полями: имя, порода и вес. Создать метод, который возвращает всю информацию
//                об этой собаке в виде строки. После этого в классе мейн создать экземпляр класса собака и вызвать метод,
//                который возвращает информацию о собаке.

//          ДЗ№3 В класс Dog добавить поле типа int скорость и метод ран бежать. Внутри этого метода нужно вывести в
//                консоль слово бегу столько раз сколько указано в поле скорость

//        Test test = new Test();
//        System.out.println(test.square(10));

//            ДЗ№4 Создать класс прямоугольник, в классе будет 2 параметра: длина и ширина. Создать в этом классе 2 метода
//            1 метод параметризированный, который устанавливает значения длины и ширины в прямоугольник, 2 метод без
//                параметров, он возвращает площадь прямоугольника.

//              ДЗ№5 Создайте класс Работник, у класса будут поля: имя, должность и зарплата. Создать конструктор,
//                в котором все эти поля будут проинициализированы и добавить метод showInfo, который выводит всю информацию
//                об этом сотруднике в консоль2

//        System.out.println(MayMath.multiple(10, 12));
//        System.out.println(Math.sqrt(36));
//        Box box = new Box(30);
//        box.showVolume();

//                ДЗ№6 Создайте класс Monster, у которого есть 3 поля: кол-ва глаз, кол-во рук и кол-во ног
//                Создать 3 конструктора: 1) без параметров, он устанавливает значения всем полям 2. 2) будет принимать
//                только 1 параметр - кол-во и он установит это кол-во всем полям 3) будет принимать 3 параметра кол-во глаз
//                кол-во рук и кол-во ног и установит это значение переменным экземпляра. Также добавить метод voice, он
//                должен быть перегруженным: 1) без параметров, 2) с одним параметром, 3) с двумя параметрами.


//                  ДЗ№7 Создать метод Copy, который возвращает новый объект Box. Этот метод возвращает точную копию
//                коробки, у которой вызывается данный метод. Например: у нас будет коробка, котороый все размеры будут
//                даны 10, тогда мы можем создать вторую коробку вызвав текущий метод Copy и все ее размеры будут совпадать
//                с коробкой current.

//        Box current = new Box(10);
//        Box another = current.copy();
//        current.showVolume();
//        another.showVolume();

//                    ДЗ№8 Создать метод Increas, этот метод возвращает коробку, у которой все размеры в 2 раза больше той,
//                  у которой был вызван данный метод. Например: если у нас есть коробка, у которой все размеры равны 10,
//        то мы можем создать новую коробку. У первой вызвать метод Increas, в этом случа у нас будет создана коробка,
//        у которой все размеру будут равны уже 20.

//        Box current = new Box(10);
//        Box another = current.Increas();
//        current.showVolume();
//        another.showVolume();

//        System.out.println(MayMath.length(10));

        System.out.println(MayMath.sum(2, 2, 0, 8));
    }
}
