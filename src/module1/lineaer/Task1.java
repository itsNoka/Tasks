/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

package module1.lineaer;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(calculateFunction(a, b, c));
    }

    public static double calculateFunction(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }
}
