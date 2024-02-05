package test;

public class MyArrayList {

    private String[] array = new String[10];      //массив на 10 элементов типа String
    private int size = 0;                         // size хранит количество элементов в массиве array


    public String get(int index) {                // геттер возврата элемента типа Int по индексу
        return array[index];
    }

    public void add(String element) {                 //метод, который добавляет новый элемент в массив. Он в наш массив
        array[size] = element;                        //по индексу size кладет новый элемент
        size++;                                       // Увеличивает значение size На 1
        if (size == array.length) {                   // Если size равен array.length(длина массива) (если массив заполнен)
            String[] newArray = new String[array.length * 2];   //то создать новый массив и его размер должен быть в 2 больше
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];                         // положим в новый массив элементы из первого массива
            }
            array = newArray;                                   // ложим старую переменную array  в новый массив
        }
    }

    public void remove(int index) {                    // Метод, который принимает номер позиции элемента
        for (int i = index; i < size - 1; i++) {       // Цикл от значения позиции и в условии ставим size - 1(чтобы не доходить до последнего элемента), т.к. оно хранит реальное количество элементов в массиве
            array[i] = array[i + 1];                   //элементу массива с индексов i присваиваем значение array от i + 1
        }
        array[size] = null;                            //ложим последнему элменту значение null
        size--;                                        // уменьшаем значение size На 1
    }

    public void remove(String element) {               // Метод, который принимает строку
        for (int i = 0; i < size; i++) {               // Цикл для прохождения по всем элементам в массиве
            if (element.equals(array[i])) {            // Если элемент, который мы хотим удалить совпадает с жлементом массива,то удалить его
                remove(i);                             // Удалить элемент
                return;                                // выход из метода
            }
        }
    }

    public int getSize() {                              // геттер поля size
        return size;
    }
}
