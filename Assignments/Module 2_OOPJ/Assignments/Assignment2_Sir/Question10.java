//Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command
// line. Perform the specified arithmetic operation based on the operator provided. 
//(Hint: Use switch-case for operations).

import java.util.Scanner;

class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Select any one");
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");

        System.out.println("Select Choice");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println(num1 + num2);
            break;

            case 2:
            System.out.println(num1 - num2);
            break;

            case 3:
            System.out.println(num1 * num2);
            break;

            case 4:
            System.out.println(num1 / num2);
            break;
        }
    }
}
