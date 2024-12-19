import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double userNum = scanner.nextDouble();
        scanner.close();

        double result = Math.sqrt(userNum);

        System.out.println(result);

        if (result % 1 == 0) {
            System.out.println("Your number is a perfect square!");
        }

        //Test comment 2, second restart

    }
}
