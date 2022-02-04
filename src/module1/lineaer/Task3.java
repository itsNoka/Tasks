/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 ((sin(x)+cos(y))/(cos(x-sin(y))*tan(x*y)
 */

package module1.lineaer;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x");
        float x = scanner.nextFloat();
        System.out.println("введите y");
        float y = scanner.nextFloat();

        System.out.println(method( float x, float y));

    }

    public static float method(float x, float y) {
        return ((sin(x) + cos(y)) / (cos(x - sin(y)) * tan(x * y);
    }

}
