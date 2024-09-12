//b. Declare a method-local variable status of type boolean with the 
//value true and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).

class Demo1{
    public static void main(String []args){
        boolean b = true;
        String s = Boolean.toString(b);

        System.out.println(s);
    }
}

//c. Declare a method-local variable strStatus of type String with the value "true" and convert it to
// a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).

class Demo2{
    public static void main(String[] args) {
        String strStatus = "true";
        boolean bool = Boolean.parseBoolean(strStatus);
        System.out.println(bool);
    }
}

//d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt 
//to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").

class Demo3{
    public static void main(String[] args) {
        String strStatus = "1";
        boolean bool = strStatus.equals("1");
        System.out.println(bool);
    }
}

//e. Declare a method-local variable status of type boolean with the value true and convert it to 
//the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).

class Demo4{
    public static void main(String[] args) {
        boolean status = true;
        Boolean bool = Boolean.valueOf(status);
        System.out.println(bool);
    }
}

//f. Declare a method-local variable strStatus of type String with the value "true" and convert it to
// the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).

class Demo5{
    public static void main(String[] args) {
        String strStatus = "true";
        Boolean bool = Boolean.valueOf(strStatus);
        System.out.println(bool);
    }
}

// g. Experiment with converting a boolean value into other primitive types or vice versa
// and observe the results.

class Demo6{
    public static void main(String[] args) {
        Boolean value = true;
        int val = value ? 1 :0;
        System.out.println(val);
    }
}

class Demo7{
    public static void main(String[] args) {
        int val = 10;
        Boolean value = (val != 0) ? true : false;
        System.out.println(value);
    }
}