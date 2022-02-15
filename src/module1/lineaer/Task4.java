/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/
package module1.lineaer;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в формате ццц,ддд");
        double a = scanner.nextDouble();

        System.out.println(revertNumber(a));
    }

    public static double revertNumber(double a) {
        if (a < 1000) {
            return (a * 1000) % 1000 + (int) a / 1000.0;
        } else {
            System.out.println("Введите число меньше 1000");
        }
        return a;
    }
}
