import java.util.*;
class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i <=n; i++){
            if(i == 1){
                System.out.println(a);
            }
            else if (i == 2) {
                System.out.println(b);
            }
            else{
                int next = a + b;
                System.out.println(next);
                a = b;
                b = next;
            }
        }
        sc.close();
    }
}
