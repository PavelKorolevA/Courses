package syntax;

public class Variable {
    public static void main(Strings[] args) {
        int days = 10000;
        int year = days / 365;
        int mounth = (days%365) / 30;
        int day = (days%365)%30;
        System.out.println(year);
        System.out.println(mounth);
        System.out.println(day);
    }
}
