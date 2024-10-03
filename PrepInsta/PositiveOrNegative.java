// Q1) Positive or Negative number

import java.util.Scanner;
class PosOrNegNumber{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println(num + " is a Negative number");
        }
        else{
            System.out.println(num + " is a Positive number");
        }
        sc.close();
     }
}