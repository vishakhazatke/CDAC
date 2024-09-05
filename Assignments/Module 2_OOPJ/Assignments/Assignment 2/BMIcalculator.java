import java.util.*;
class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("Your BMI is"+ BMI);

        if(BMI < 18.5 ){
            System.out.println("You are Underweight");
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("You have normal weight");
        }
        else{
            System.out.println("You are overweight");
        }
        sc.close();
      }    
}
