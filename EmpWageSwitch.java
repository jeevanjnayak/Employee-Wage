import java.util.Random;



public class EmpWageSwitch {
    public static final int Is_Full = 1;
    public static final int Is_half = 2;

    public static void main(String[] args) {
        int hours = 0;
        int wage;
        int EmpStatus = (int) Math.floor(Math.random() * 10) % 3;
        switch (EmpStatus) {
            case Is_Full:
                hours = 8;
                break;
            case Is_half:
                hours = 4;
                break;
            default:
                hours = 0;
        }
        wage = hours * 20;
        System.out.println("your daily wage is: "+wage);

    }
}