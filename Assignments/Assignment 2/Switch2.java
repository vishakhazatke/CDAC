public class Switch2 { 
    public static void main(String[] args) { 
    int number = 5; 
    switch(number) { 
    case 5: 
    System.out.println("Number is 5"); 
    break; 
    case '5': 
    System.out.println("This is another case 5"); 
    break; 
    default: 
    System.out.println("This is the default case"); 
    } 
  } 
} 

// when there is duplicate we need to take one case as case '5'
