import java.util.Scanner;

class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed = reversed + words[i] + " ";
        }
        System.out.println("Reversed sentence: " + reversed.trim());

        sc.close();
    }
}

