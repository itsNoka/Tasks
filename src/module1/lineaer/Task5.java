/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
package module1.lineaer;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] agrs) {
        Scanner t = new Scanner(System.in);
        System.out.println("Введите время в секундах");
        int a = t.nextInt();

        int b = (a / 60);
        int seconds = a - b * 60;
        int hours = (b / 60) % 24;
        int minutes = a / 60 % 60;
        System.out.printf("%dч %dмин %dc%n", hours, minutes, seconds);
    }
}
