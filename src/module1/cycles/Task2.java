package module1.cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите точку а");
        double a = scanner.nextDouble();
        System.out.println("введите точку b");
        double b = scanner.nextDouble();
        System.out.println("введите шаг h");
        double h = scanner.nextDouble();
        for (double x = a; x <= b; x += h) {
            if (x <= 2) {
                double y = -x;
                System.out.println("х=" + x + " " + "y=" + y);
            } else {
                double y = x;
                System.out.println("x=" + x + " " + "y=" + y);
            }
        }
    }
}
