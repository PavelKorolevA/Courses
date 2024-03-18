package interfaces.homeWork;

public class Director implements Worker{

    @Override
    public void work() {
        System.out.println("Директор работает");
    }
}
