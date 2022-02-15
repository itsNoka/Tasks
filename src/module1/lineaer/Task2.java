/*
Найдите значение функции: (b + sqrt((b ^ 2 ) + 4 * a * c)/ 2 * a) - (a ^ 3) * c +( b ^ - 2).
 */

package module1.lineaer;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите а");
        double a = scanner.nextDouble();
        System.out.println("введите b");
        double b = scanner.nextDouble();
        System.out.println("введите c");
        double c = scanner.nextDouble();

        System.out.println(calculedFunction(a, b, c));
    }

    public static double calculedFunction(double a, double b, double c) {
        return (b + sqrt((b * b) + 4 * a * c) / 2 * a) - (a * a * a) * c + ((1 / b) * (1 / b));
    }
}
