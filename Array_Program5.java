import java.util.*;
class Array_Program5
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
       int arr[] = new int[n];
      


       for (int i=0;i<n ;i++ ) {
              System.out.println("Enter the value of array elements : " +i );
          arr[i]=sc.nextInt();
          
       }

         Arrays.sort(arr);

        System.out.println("Two Smallest N : "+ arr[0] +","+ arr[1]+"And 2 Largest N :"+arr[n-1]+","+ arr[n-2]);
         //}
       }
        
    }
     