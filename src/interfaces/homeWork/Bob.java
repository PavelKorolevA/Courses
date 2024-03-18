package interfaces.homeWork;

public class Bob implements Server{

    @Override
    public void bringTheOrder(String dish) {
        System.out.println("Я вам принес: " + dish);
    }
}
