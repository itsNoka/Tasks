/*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
*/

package module1.lineaer;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("введите х");
        double x = t.nextDouble();
        System.out.println("введите у");
        double y = t.nextDouble();

        System.out.println(isPointBelongsToArea(x, y));
    }

    public static boolean isPointBelongsToArea(double x, double y) {
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            return true;
        } else return x >= -2 && x <= 2 && y >= 0 && y <= 4;
    }
}
