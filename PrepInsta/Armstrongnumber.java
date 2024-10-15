import java.util.Scanner;
class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp1 = num;
        int temp2 = num;
        int sum = 0;

        while(temp1 != 0){
            count++;
            temp1 = temp1/10;
        }
        
        while(num != 0){
            int rem = num %10;
            int mul = 1;
            
            for(int i = 1; i <= count; i++){
                mul = mul * rem;
            }
            sum = sum + mul;
            num = num/10;
        }
        if(temp2 == sum){
            System.out.println("It is Armstrong number");
        }
        else{
            System.out.println("It is Not an armstrong number");
        }
        sc.close();
    }
}
