//Prime number within a given range

import java.util.Scanner;
class Primenumberwithinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Range");
        int start = sc.nextInt();
        System.out.println("Enter End Range");
        int end = sc.nextInt();

        for(int num = start; num<= end; num++){
        int count = 0;
          for(int i = 1; i<= num; i++){
            if(num % i == 0){
                count++;
            }
          }
          if(count == 2){
            System.out.println(num + " ");
          }
  
        }
        sc.close();
    }
}
