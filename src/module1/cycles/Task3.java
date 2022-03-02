/*Найти сумму квадратов первых ста чисел.
 */
package module1.cycles;

public class Task3 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
            System.out.println(sum);
        }
        System.out.println("Сумма квадратов первых ста чисел =" + sum);
    }
}
