/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/
package module1.lineaer;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in); //подтягиваем сканер
        System.out.println("Введите число в формате ццц,ддд"); // просто вывод текста
        double a = scanner.nextDouble(); // ввод числа с клавиатуры
        System.out.println(method(a));  // передаем число методу?

    }

    public static double method(double a) { // объявлениие метода
        if (a < 1000) {
            double b = (a * 1000) % 1000 + (int) a / 1000.0;

            return b;
        } else {
            System.out.println("Введите число меньше 1000");
        }
        return a;
    }
}
