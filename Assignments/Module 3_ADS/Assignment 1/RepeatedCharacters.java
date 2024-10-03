import java.util.Scanner;
class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int charCount[] = new int[256];

        for(int i = 0; i< input.length(); i++){
            charCount[input.charAt(i)]++ ; 
        }
        System.out.println("Repeated Characters");

        for(int i = 0; i< input.length(); i++){
            if(charCount[input.charAt(i)] > 1 ){
                System.out.print(input.charAt(i) + " ");
                charCount[input.charAt(i)] = 0; 
            }
        }
        sc.close();
    }
}