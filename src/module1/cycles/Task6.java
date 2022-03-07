/* Вывести на экран соответствий между
символами и их численными обозначениями в памяти компьютера.
*/
package module1.cycles;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println(i + " символ " + (char) i);
        }
    }
}
