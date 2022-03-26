import java.util.*;
class For_Loop_Program3
 {
    public static void main(String[] args)
    {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Number");
      int n =sc.nextInt();
      int flage =0;
       int m =n/2;

          if (n==0 || n==1) {
              System.out.println("Not Prime Number" );
              }else {
                  
              

       for (int i=2;i<=m;i++ ) {
         if (n%i==0) {
            System.out.println("Not Prime Number" );
            flage=1;
            break;
                   }
}

if (flage ==0) {
    System.out.println("IsPrime");
    
}
 }          
       }
       
     }