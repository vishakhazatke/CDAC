import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scanner.nextInt();

        int result = 0;
        for (int i = 1; i * i <= x; i++) {
            result = i;
        }
        System.out.println("Square root " + result);
        scanner.close();
    }
}

