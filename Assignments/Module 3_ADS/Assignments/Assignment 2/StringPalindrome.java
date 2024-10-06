import java.util.Scanner;
class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = "";

        for(int i = input.length()-1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("It is a Palindrome String");
        }
        else{
            System.out.println("It is not a Palindrome String");
        }
        sc.close();
    }
}
