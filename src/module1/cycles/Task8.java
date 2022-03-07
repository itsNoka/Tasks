package module1.cycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        char[] aMass = Integer.toString(a).toCharArray();
        int[] arrayA = new int[aMass.length];
        char[] bMass = Integer.toString(b).toCharArray();
        int[] arrayB = new int[bMass.length];
        System.out.println(a + " ");
        for (int i = 0; i < aMass.length; i++) {
            arrayA[i] = Character.getNumericValue(aMass[i]);
            System.out.print(arrayA[i] + " ");
        }
        System.out.println(b + " ");
        for (int i = 0; i < bMass.length; i++) {
            arrayB[i] = Character.getNumericValue(bMass[i]);
            System.out.print(arrayB[i] + " ");
        }
    }
}
