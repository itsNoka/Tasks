package module1.cycles;

public class Task4 {
    public static void main(String[] args) {
        double comp = 1;
        for (int i = 1; i <= 200; i++) {
            comp *= Math.pow(i, 2);
            System.out.println(comp);
        }
        System.out.println("произведение квадратов первых 200 чисел=" + comp);
    }
}
