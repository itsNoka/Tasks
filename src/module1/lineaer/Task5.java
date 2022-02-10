/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
package module1.lineaer;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] agrs) {
        Scanner t = new Scanner(System.in);
        System.out.println("Введите время в секундах");
        int a = t.nextInt();  // время в секундах

            int b = (a / 60); //время в минутах
            int c = a - b * 60; // остаток секунд
            int d = b/60; // время в часах
            int e = b - d *60; //остаток в минутах
            System.out.println(d+" часы" +e +" минуты" +c +" секунды");

        }
    }
