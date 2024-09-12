//b. Write a program to test how many bytes are used to represent an int value using 
//the BYTES field. (Hint: Use Integer.BYTES).

class Test1{
    public static void main(String[] args) {
        System.out.println(Integer.BYTES);
    }
}

//c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and 
//MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).

class Test2{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

//d. Declare a method-local variable number of type int with some value and convert it to a 
//String using the toString method. (Hint: Use Integer.toString(int)).

class Test3{
    public static void main(String[] args) {
        int a = 20;
        String s = Integer.toString(a);
        System.out.println(s);
    }
}

//e. Declare a method-local variable strNumber of type String with some value and convert it to an
// int value using the parseInt method. (Hint: Use Integer.parseInt(String)).

class Test4{
    public static void main(String[] args) {
        String strNumber = "10";
        int val = Integer.parseInt(strNumber);
        System.out.println(val);
    }
}

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
//attempt to convert it to an int value. (Hint: parseInt method will throw a NumberFormatException).

class Test5{
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
        try{
        int a = Integer.parseInt(strNumber);
        System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("It is giving number format exception");
        }
    }
}

//g. Declare a method-local variable number of type int with some value and convert it to the
// corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).

class Test6{
    public static void main(String[] args) {
        int number = 10;
        Integer num = Integer.valueOf(number);
        System.out.println(num);
    }
}

//h. Declare a method-local variable strNumber of type String with some integer value and convert
// it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).

class Test7{
    public static void main(String[] args){
        String strNumber = "25";
        Integer num = Integer.parseInt(strNumber);
        System.out.println(num);
    }
}

//i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer 
//class. (Hint: Use Integer.sum(int, int)).

class Test8{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(Integer.sum(num1, num2));
    }
}

//j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using
// the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).

class Test9{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(Integer.max(num1, num2));
        System.out.println(Integer.min(num1, num2));
    }
}

/*k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings
using methods from the Integer class. (Hint: Use Integer.toBinaryString(int),
 Integer.toOctalString(int), and Integer.toHexString(int)).*/

 class Test10{
    public static void main(String[] args) {
        int a = 7;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
    } 
 }

//l. Experiment with converting an int value into other primitive types or vice versa and observe 
//the results.

class Test11{
    public static void main(String[] args) {
        int c = 50;
        float f = c;
        System.out.println(f);
    }
}

class Test12{
    public static void main(String[] args) {
        float f = 45.5f;
        int a = (int) f;
        System.out.println(a);

    }
}