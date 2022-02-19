/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/

package module1.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол а");
        int a = scanner.nextInt();
        System.out.println("Введите угол в");
        int b = scanner.nextInt();
        int c = 180 - a - b;
        String s = "hello";
        if (c == 90) {
            System.out.println("треугольник прямоугольный");
        } else if (a == 90) {
            System.out.println("треугольник прямоугольный");
        } else if (b == 90) {
            System.out.println("треугольник прямоугольный");
        } else if (c <= 0) {
            System.out.println("не существует");
        } else {
            System.out.println("существует");
        }
    }
}
