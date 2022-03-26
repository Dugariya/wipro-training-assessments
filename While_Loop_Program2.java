import java.util.*;
class While_Loop_Program2
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n =sc.nextInt();
         int reversNumber=0;
         int m=n;

         while(m>0){
            int rem =m%10;
            reversNumber = reversNumber*10 + rem ;
            /* while(j>=1){
            System.out.print("*"+" ");
            j--;

        }*/
        
        m =m/10;
         }
         if (n==reversNumber) {
            System.out.println( n + "  is a Palindrome ");
            
         }else {
            
         
         System.out.println( n+ "  is  not Palindrome");
    }
       }
        
    }
     