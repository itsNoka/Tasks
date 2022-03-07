package module1.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m");
        int m = scanner.nextInt();
        System.out.println("Введите n");
        int n = scanner.nextInt();
        int div;
        for (int i = m; i <= n; i++) {
            System.out.print("Для числа " + i + " будут следующие делители - ");
            div = 0;
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    System.out.print(j + " ");
                    div++;
                }
            if (div == 0) if (i == 1) System.out.println("делители отсутствуют (кроме 1)");
            else System.out.println("делители отсутствуют (кроме 1 и " + i + ")");
            else System.out.println();
        }
    }
}
