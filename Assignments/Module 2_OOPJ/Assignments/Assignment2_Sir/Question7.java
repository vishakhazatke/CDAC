//b. Write a program to test how many bytes are used to represent a double value using the
// BYTES field. (Hint: Use Double.BYTES).

class Example1{
    public static void main(String[] args) {
        System.out.println(Double.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE
// fields. (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).

class Example2{
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}

//d. Declare a method-local variable number of type double with some value and convert it to a String
// using the toString method. (Hint: Use Double.toString(double)).

class Example3{
    public static void main(String[] args) {
        double number =25.5;
        String s = Double.toString(number);
        System.out.println(s);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to a
// double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).

class Example4{
    public static void main(String[] args) {
        String strNumber = "20";
        Double d = Double.parseDouble(strNumber);
        System.out.println(d);
    }
}
//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt 
//to convert it to a double value. (Hint: parseDouble method will throw a NumberFormatException).

class Example5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3" ;
        try{
            Double d = Double.parseDouble(strNumber);
            System.out.println(d);
        }
        catch(NumberFormatException e){
            System.out.println("Enter valid input");
        }
    }
}

//g. Declare a method-local variable number of type double with some value and convert it to the
// corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).

class Example6{
    public static void main(String[] args) {
        double number= 35.9;
        Double d = Double.valueOf(number);
        System.out.println(d);
    }
}
//h. Declare a method-local variable strNumber of type String with some double value and convert it
// to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).

class Example7{
    public static void main(String[] args) {
        String strNumber = "39.9";
        Double d = Double.valueOf(strNumber);
        System.out.println(d);
    }
}
//i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the
// Double class. (Hint: Use Double.sum(double, double)).

class Example8{
    public static void main(String[] args) {
        double a1 = 112.3;
        double a2 = 984.5;
        System.out.println(Double.sum(a1, a2));
    }
}
//j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values
// using the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).

class Example9{
    public static void main(String[] args) {
        double a1 = 112.2;
        double a2 = 556.6;
        System.out.println(Double.max(a1, a2));
        System.out.println(Double.min(a1, a2));
    }
}
//k. Declare a double variable with the value -25.0. Find the square root of this value. 
//(Hint: Use Math.sqrt() method).

class Example10{
    public static void main(String[] args) {
        double d = -25.0;
        System.out.println(Math.sqrt(d));
    }
}
//l. Declare two double variables with the same value, 0.0, and divide them.
// (Hint: Observe the result and any special floating-point behavior).

class Example11{
    public static void main(String[] args) {
        double d1 = 0.0;
        double d2 = 0.0;
        System.out.println(d1/d2);
    }
}
//m. Experiment with converting a double value into other primitive types or vice versa and observe 
//the results.

class Example12{
    public static void main(String[] args) {
        double d = 33.8;
        int a = (int) d;
        System.out.println(a);
    }
}

class Example13{
    public static void main(String[] args) {
        int a = 78;
        double d = a;
        System.out.println(d);
    }
}
