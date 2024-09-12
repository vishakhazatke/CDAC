//Declare variables of each primitive type as fields of a class and check their default values. 
//(Note: Default values depend on whether the variables are instance variables or static variables).

class Example22{
    static int a;
    static float f;
    static byte b;
    static boolean bool;
    static short s;
    static double d;
    static long l;

    int a1;
    float f1;
    byte b1;
    boolean bool1;
    short s1;
    double d1;
    long l1;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(bool);
        System.out.println(s);
        System.out.println(d);
        System.out.println(l);

        System.out.println("----------");

        Example22 obj = new Example22();
        System.out.println(obj.a1);
        System.out.println(obj.f1);
        System.out.println(obj.b1);
        System.out.println(obj.bool1);
        System.out.println(obj.s1);
        System.out.println(obj.d1);
        System.out.println(obj.l1);

    }
}