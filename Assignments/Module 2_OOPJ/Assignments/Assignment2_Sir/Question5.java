//b. Write a program to test how many bytes are used to represent a long value using the BYTES field.
// (Hint: Use Long.BYTES).

class Program1{
    public static void main(String[] args) {
        System.out.println(Long.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and
// MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).

class Program2{
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

//d. Declare a method-local variable number of type long with some value and convert it to a String
// using the toString method. (Hint: Use Long.toString(long)).

class Program3{
    public static void main(String[] args) {
        long a = 100001l;
        String str = Long.toString(a);
        System.out.println(str);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to a
// long value using the parseLong method. (Hint: Use Long.parseLong(String)).

class Program4{
    public static void main(String[] args) {
        String strNumber = "100";
        Long l = Long.parseLong(strNumber);
        System.out.println(l);
    }
}

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt
// to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).

class Program5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        try{
        Long l = Long.parseLong(strNumber);
        System.out.println(l);
        }
        catch(NumberFormatException e){
            System.out.println("Give valid input");
        }
    }
}

//g. Declare a method-local variable number of type long with some value and convert it to the 
//corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).

class Program6{
    public static void main(String[] args) {
        long l = 200001l;
        Long l1 = Long.valueOf(l);
        System.out.println(l1);
    }
}

//h. Declare a method-local variable strNumber of type String with some long value and convert it to
// the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).

class Program7{
    public static void main(String[] args) {
        String strNumber = "100000000000";
        Long l = Long.valueOf(strNumber);
        System.out.println(l);
    }
}

//i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long 
//class. (Hint: Use Long.sum(long, long)).

class Program8{
    public static void main(String[] args) {
        long l1 = 1123l;
        long l2 = 9845l;
        System.out.println(Long.sum(l1 , l2));
    }
}

//j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values
// using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).

class Program9{
    public static void main(String[] args) {
        long l1 = 1122l;
        long l2 = 5566l;
        System.out.println(Long.max(l1, l2));
        System.out.println(Long.min(l1 , l2));
    }
}

//k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings 
//using methods from the Long class. (Hint: Use Long.toBinaryString(long), Long.toOctalString(long),
// and Long.toHexString(long)).

class Program10{
    public static void main(String[] args) {
        Long l = 7l;
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toOctalString(l));
        System.out.println(Long.toHexString(l));
    }
}
//l. Experiment with converting a long value into other primitive types or vice versa and observe 
//the results.

class Program11{
    public static void main(String[] args) {
        long l = 1000000002l;
        float a = (float) l;
        System.out.println(a);
    }
}

class Program12{
    public static void main(String[] args) {
        float f = 1000.2f;
        long a =  (long)f;
        System.out.println(a);
    }
}
