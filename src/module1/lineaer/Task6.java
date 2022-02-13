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
        System.out.println("точка с коррдинатами x = " + x + " и y = " + y + " - " + coordinates(x, y));
    }

    public static boolean coordinates(double x, double y) { //coordinates из sout  выше
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {  // логичекое или &&, логическое и &
            return true;
        } else if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        } else {
            return false;
        }
    }
}
