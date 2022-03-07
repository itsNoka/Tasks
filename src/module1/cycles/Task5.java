/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: 1/(2^n)+1/(3^n)*/
package module1.cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите е");
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double sum = 0;
        double a;
        int n = 50;
        for (int i = 0; i <= n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (e <= Math.abs(a)) {
                sum += a;
            } else {
               break;
            }
        }
        System.out.println(sum);
    }
}
