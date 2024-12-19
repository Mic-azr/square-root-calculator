import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        double num1 = 49;
        double num2 = 50;
        double num3 = 48;

        System.out.println(Math.sqrt(num1));

        if (Math.sqrt(num1) % 1 == 0) {
            System.out.println("Your number is a perfect square!");
        }

        System.out.println(Math.sqrt(num2));

        if (Math.sqrt(num2) % 1 == 0) {
            System.out.println("Your number is a perfect square!");
        }

        System.out.println(Math.sqrt(num3));

        if (Math.sqrt(num3) % 1 == 0) {
            System.out.println("Your number is a perfect square!");
        }
    }
}
