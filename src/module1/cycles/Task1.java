package module1.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println("сумма чисел от 1 до " + x + " " + " равна " + sum);
    }
}
