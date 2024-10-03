import java.util.Scanner;
class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        if(num < 0){
            System.out.println("False");
            return ;
        }

        while(num != 0){
           int digit = num%10;
           rev = rev*10 + digit;
           num = num/10;
        }
        if(temp == rev ){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}
