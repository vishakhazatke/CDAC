/*public class Main10 { 
    public void display() { 
    System.out.println("No parameters"); 
    } 
    public void display(int num) { 
    System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
    display(); 
    display(5); 
    } 
   } */
   
// cannot make a static reference to the non-static method display()
//cannot make a static reference to the non-static method display(int)

public class Main10 { 
    public void display() { 
    System.out.println("No parameters"); 
    } 
    public void display(int num) { 
    System.out.println("With parameter: " + num);
    } 
    public static void main(String[] args) { 
       Main10 obj = new Main10();
       obj.display(); 
       obj.display(5); 
    } 
   } 