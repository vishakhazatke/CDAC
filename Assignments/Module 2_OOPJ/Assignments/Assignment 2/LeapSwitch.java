import java.util.*;
class LeapSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int casetype = 0;

        if(year % 4==0 && year% 100 != 0){
            casetype = 1;
        }
        else{
            casetype = 2;
        }

        switch(casetype){
            case 1:
            System.out.println("The year is a leap year");
            break;

            case 2:
            System.out.println("The year is not a leap year");
            break;

            default :
            System.out.println("Enter vaild year");
            break;
        }
        sc.close();
    }
}
