import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        System.out.print("Please insert your hour = ");
        int hour = sc.nextInt();
        System.out.print("Please insert your minute = ");
        int minute = sc.nextInt();

        if (minute >= 30) {
            hour++ ;
        }

        if (hour == 1) {
            result = 20;
        } else if (hour == 2) {
            result = 50;
        } else if (hour == 3) {
            result = 90;
        } else if (hour > 4) {
            result = (hour-3) * 50 + 90;
        }

        System.out.println("ค่าจอดรถราคา = " + result);
    }
}
