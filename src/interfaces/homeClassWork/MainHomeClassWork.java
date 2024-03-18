package interfaces.homeClassWork;


public class MainHomeClassWork {
    public static void main(String[] args) {

        Director director = new Director();
        director.force(new Worker() {                     //в метод форс мы передали экземпляр анонимного класса воркер

            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });
    }
}
