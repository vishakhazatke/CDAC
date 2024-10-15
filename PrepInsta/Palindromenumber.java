import java.util.Scanner;
class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while(num != 0){
             int digit = num%10;
             rev = rev * 10 + digit;
             num = num/10;
        }
        if(temp == rev){
            System.out.println("It is a Palindrome Number");
        }
        else{
            System.out.println("It is not a Palindrome Number");
        }
        sc.close();
    }
}
