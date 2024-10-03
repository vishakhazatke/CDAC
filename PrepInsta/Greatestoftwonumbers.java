// Q6) Greatest of two numbers

import java.util.Scanner;
class Greatestoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 +" is Greatest");
        }
        else{
            System.out.println(num2 +" is Greatest");
        }
        sc.close();
    }
}
