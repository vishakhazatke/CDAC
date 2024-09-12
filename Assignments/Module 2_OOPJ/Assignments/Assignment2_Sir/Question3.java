//b. Write a program to test how many bytes are used to represent a short value using the
// BYTES field. (Hint: Use Short.BYTES).

class main1{
    public static void main(String[] args) {
        short sh = 100;
        System.out.println(sh);
        System.out.println(Short.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and
// MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).

class main2{
    public static void main(String[] args) {
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}

//d. Declare a method-local variable number of type short with some value and convert it to a 
//String using the toString method. (Hint: Use Short.toString(short)).

class main3{
    public static void main(String[] args) {
        short number = 10;
        String s = Short.toString(number);
        System.out.println(s);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to a
// short value using the parseShort method. (Hint: Use Short.parseShort(String)).

class main4{
    public static void main(String[] args) {
        String strNumber = "100";
        Short s = Short.parseShort(strNumber);
        System.out.println(s); 
    }
}

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt
// to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException).

class main5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        try{
            Short s = Short.parseShort(strNumber);
            System.out.println(s); 
        }
        catch(NumberFormatException e){
            System.out.println("It is giving number format exception");
        } 
    }
}

//g. Declare a method-local variable number of type short with some value and convert it to the 
//corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).

class main6{
    public static void main(String[] args) {
        short sh = 10;
        Short sh1 = Short.valueOf(sh);
        System.out.println(sh1);
    }
}

//h. Declare a method-local variable strNumber of type String with some short value and convert it
// to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).

class main7{
    public static void main(String[] args) {
        String strNumber = "15";
        Short sh = Short.valueOf(strNumber);
        System.out.println(sh);
    }
}

//i. Experiment with converting a short value into other primitive types or vice versa and 
//observe the results.

class main8{
    public static void main(String[] args) {
        short sh = 25;
        double a = sh;
        System.out.println(a);
    }
}

class main9{
    public static void main(String[] args) {
        double d = 30.5;
        short sh = (short) d;
        System.out.println(sh);
    }
}
