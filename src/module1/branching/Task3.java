package module1.branching;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("координаты точек A(x,y) B(x,y) C(x,y)");
        int Ax = scanner.nextInt();
        int Ay = scanner.nextInt();
        int Bx = scanner.nextInt();
        int By = scanner.nextInt();
        int Cx = scanner.nextInt();
        int Cy = scanner.nextInt();
        System.out.println("Координаты А " + Ax + " " + Ay + " Координаты B " + Bx + " " + By + " Координаты C " + Cx + " " + Cy);
        int linear = (Cx - Ax) / (Bx - Ax) - (Cy - Ay) / (By - Ay);
        if (linear == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки лежат на разынх прямых");
        }
    }
}
