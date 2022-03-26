import java.util.*;
class Array_Program11
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the size of array");
        int n =3;
        int arr[] = new int[n];
      


       for (int i=0;i<n ;i++ ) {
              System.out.println("Enter the value of array a elements : " +i );
          arr[i]=sc.nextInt();
          
       }
           int brr[] = new int[n];
      


       for (int i=0;i<n ;i++ ) {
              System.out.println("Enter the value of array b elements : " +i );
          brr[i]=sc.nextInt();
          
       }

           int crr[] = new int[2];
        
         crr[0]=arr[1];
         crr[1]=brr[1];

         System.out.println(crr[0]+","+crr[1]);

         
        }
        
    }
     