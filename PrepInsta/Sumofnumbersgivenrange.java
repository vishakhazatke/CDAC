// Q5) Sum of numbers in a given range

import java.util.Scanner;
class Sumofnumbersgivenrange {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2 :");
        int num2 = sc.nextInt();

        for(int i = num1; i <= num2; i++ ){
            Sum = Sum + i;
        }
        System.out.println("The Sum of Numbers is "+ Sum);
        sc.close();
    }
}
