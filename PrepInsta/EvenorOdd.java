// Q2) Even or Odd number

import java.util.Scanner;
class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println(num +" is a Even number");
        }
        else{
            System.out.println(num +" is a Odd number");
        }
        sc.close();
    }
}
