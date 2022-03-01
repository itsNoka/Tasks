package module1.branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите х");
        double x = scanner.nextInt();
        System.out.println("x = " +x);
        double f;
        if (x <= 3) {
            f = (x * x - 3 * x + 9);
        } else {
            f = 1 / (x * x * x + 6);
        }
        System.out.println("ответ " +f);
    }
}
