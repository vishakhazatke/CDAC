//b. Write a program to test how many bytes are used to represent a float value using the BYTES field.
// (Hint: Use Float.BYTES).

class Calculation1{
    public static void main(String[] args) {
        System.out.println(Float.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE 
//fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).

class Calculation2{
    public static void main(String[] args) {
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
//d. Declare a method-local variable number of type float with some value and convert it to a String 
//using the toString method. (Hint: Use Float.toString(float)).

class Calculation3{
    public static void main(String[] args) {
        float number =10.5f;
        String s = Float.toString(number);
        System.out.println(s);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to a 
//float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).

class Calculation4{
    public static void main(String[] args) {
        String strNumber = "20";
        float f = Float.parseFloat(strNumber);
        System.out.println(f);
    }
}

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to 
//convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).

class Calculation5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3" ;
        try{
        float f = Float.parseFloat(strNumber);
        System.out.println(f);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Input");
        }
    }
}

//g. Declare a method-local variable number of type float with some value and convert it to the 
//corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)).

class Calculation6{
    public static void main(String[] args) {
        float number = 29.5f;
        Float f = Float.valueOf(number);
        System.out.println(f);
    }
}

//h. Declare a method-local variable strNumber of type String with some float value and convert it
// to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).

class Calculation7{
    public static void main(String[] args) {
        String strNumber = "39.5";
        Float f = Float.parseFloat(strNumber);
        System.out.println(f);
    }
}

//i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the 
//Float class. (Hint: Use Float.sum(float, float)).

class Calculation8{
    public static void main(String[] args) {
        float var1 = 112.3f;
        float var2 = 984.5f;
        System.out.println(Float.sum(var1, var2));
    }
}

//j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values
// using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).

class Calculation9{
    public static void main(String[] args) {
        float var1 = 112.2f;
        float var2 = 556.6f;
        System.out.println(Float.max(var1,var2));
        System.out.println(Float.min(var1,var2));
    }
}

//k. Declare a float variable with the value -25.0f. Find the square root of this value.
// (Hint: Use Math.sqrt() method).

class Calculation10{
    public static void main(String[] args) {
        float var = -25.0f;
        System.out.println(Math.sqrt(var));
    }
}

//l. Declare two float variables with the same value, 0.0f, and divide them.
// (Hint: Observe the result and any special floating-point behavior).

class Calculation11{
    public static void main(String[] args) {
        float var1 = 0.0f;
        float var2 = 0.0f;
        System.out.println(var1 / var2);
    }
}
//m. Experiment with converting a float value into other primitive types or vice versa and observe 
//the results.

class Calculation12{
    public static void main(String[] args) {
        float f = 109.9f;
        int a = (int)f;
        System.out.println(a);
    }
}

class Calculation13{
    public static void main(String[] args) {
        int a = 89;
        float f = a;
        System.out.println(f);
    }
}