import java.util.*;
class For_Loop_Program5
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n =sc.nextInt();
         
         int sume =0;
         int m=n;
        while (m>0) {

            int rem =m%10;
            sume +=rem;
             m =m/10;            
        }
        System.out.println("Sume Of All Number : " + sume);
    }
        
    }
     