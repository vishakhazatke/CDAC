import java.util.Scanner;
class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check factorial");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i<= num; i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of "+  num +" is " +fact);
        sc.close();
    }
}
