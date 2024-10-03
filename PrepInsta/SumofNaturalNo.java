// Q3) Sum of N Natural numbers

import java.util.Scanner;
class SumofNaturalNo {
    public static void main(String[] args) {

        int Sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many natural number you want to sum :");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++ ){
            Sum = Sum + i;
        }
        System.out.println("Sum of "+ N + " Natural Number is "+ Sum);

        sc.close();
    } 
}
