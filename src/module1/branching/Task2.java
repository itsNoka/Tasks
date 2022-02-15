package module1.branching;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("введите a,b,c,d");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(max(min(a, b), min(c, d)));
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    private static int max(int c, int d) {
        if (c > d) {
            return c;
        } else {
            return d;
        }
    }
}
