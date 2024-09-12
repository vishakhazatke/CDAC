//b. Write a program to test how many bytes are used to represent a byte value using the 
//BYTES field. (Hint: Use Byte.BYTES).

class Hello1{
    public static void main(String[] args) {
        Byte b = 10;
        System.out.println(b);
        System.out.println(Byte.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE
// fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).

class Hello2{
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }
}

//d. Declare a method-local variable number of type byte with some value and convert it to a String 
//using the toString method. (Hint: Use Byte.toString(byte)).

class Hello3{
    public static void main(String[] args) {
        byte b = 20;
        String s = Byte.toString(b);
        System.out.println(s);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to a
// byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).

class Hello4{
    public static void main(String[] args) {
        String strNumber = "10";
        byte b = Byte.parseByte(strNumber);
        System.out.println(b);
    }
}

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
//attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).

class Hello5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        try{
            byte b = Byte.parseByte(strNumber);
            System.out.println(b);
        }
        catch(NumberFormatException e){
            System.out.println("It is giving number format exception so please give integer value");
        }
    }
}

//g. Declare a method-local variable number of type byte with some value and convert it to the
// corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).

class Hello6{
    public static void main(String[] args) {
        byte b = 20;
        Byte b1 = Byte.valueOf(b);
        System.out.println(b1);
    }
}

//h. Declare a method-local variable strNumber of type String with some byte value and convert it 
//to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).

class Hello7{
    public static void main(String[] args) {
        String strNumber = "50";
        Byte b = Byte.valueOf(strNumber);
        System.out.println(b);
    }
}

//i. Experiment with converting a byte value into other primitive types or vice versa and 
//observe the results.

class Hello8{
    public static void main(String[] args) {
        byte b = 10;
        double d = b;
        System.out.println(d);
    }
}

class Hello9{
    public static void main(String[] args) {
        double d = 20.5;
        byte b = (byte)d;
        System.out.println(b);
    }
}