package module1.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите параметры отверстия");
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.println("Введите параметры кирпича");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();


        System.out.println(isParametr(A, B, x, y, z));
    }
    private static boolean isParametr (double A, double B, double x, double y, double z){
        if ((A>x && B>y) || (A>z && B>y) || (A>y && B>x) || (A>y && B>z) || (A>z && B>x)
            || (A>x && B>z)) { return true;
        }
        return false;
    }
}
