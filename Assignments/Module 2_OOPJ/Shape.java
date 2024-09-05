import java.util.*;
class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 : Circle");
        System.out.println("2 : Square");
        System.out.println("3 : Rectangle");
        System.out.println("4 : Triangle");

        int shapechoice = sc.nextInt();

        switch(shapechoice){
            case 1:
            System.out.println("Enter radius");
            double radius = sc.nextDouble();
            double result = 3.14 * (radius * radius);
            System.out.println("The area of Circle is :"+ result);
            break;

            case 2:
            System.out.println("Enter side");
            double side = sc.nextDouble();
            double result1 = (side * side);
            System.out.println("The area of square is :" + result1);
            break;

            case 3:
            System.out.println("Enter length");
            System.out.println("Enter width");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double result2 = (length * width);
            System.out.println("The area of rectangle is :"+ result2);
            break;

            case 4:
            System.out.println("Enter Base");
            System.out.println("Enter Height");
            double Height = sc.nextDouble();
            double Base = sc.nextDouble();
            double result3 = (1/2 *Base * Height);
            System.out.println("The area of Triangle is :"+ result3);
            break;

            default :
            System.out.println("Enter Valid Input");
        }
        sc.close();
    } 
}
