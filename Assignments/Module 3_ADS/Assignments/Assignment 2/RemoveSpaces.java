import java.util.Scanner;
class RemoveSpaces {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         
         String result = input.replace(" ", "");
         System.out.println(result);
         sc.close();
    }
}
