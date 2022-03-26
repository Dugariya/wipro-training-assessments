

//
import java.util.*;
class If_Else_Program6
 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Character Variable");
      char c1 = sc.next().charAt(0); 
        

        if(c1>='a' && c1<='z'){
      	    System.out.println("Alphabhet");
      } else if (c1>='0' && c1 <='9') {
          System.out.print("Digit");
        
      }   
       else {
              System.out.println("Special character");  
          }

    }
 }