/*public class Switch { 
    public static void main(String[] args) { 
    double score = 85.0; 
    switch(score) { 
    case 100: 
    System.out.println("Perfect score!"); 
    break; 
    case 85: 
    System.out.println("Great job!"); 
    break; 
    default: 
    System.out.println("Keep trying!"); 
    } 
 } 
} */

// error: incompatible types: possible lossy conversion from double to int

public class Switch { 
    public static void main(String[] args) { 
    int score = 85; 
    switch(score) { 
    case 100: 
    System.out.println("Perfect score!"); 
    break; 
    case 85: 
    System.out.println("Great job!"); 
    break; 
    default: 
    System.out.println("Keep trying!"); 
    } 
 } 
} 