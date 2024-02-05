package syntax;

public class Boolean {

    public static void main(Strings[] args) {
        boolean isGoodReather = true;
        boolean isNight = false;
        if (isNight) {
            System.out.println("Спать");
        }
        if (!isNight && isGoodReather) {
            System.out.println("Гулять");
        }
        if (!isNight && !isGoodReather) {
            System.out.println("Читать книгу");
        }
    }
}
