import java.util.*;
class Array_Program9
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

       int[] copy = new int[arr.length];
        int j = 0;
        
        for (int i=0; i<arr.length; i++)

            if (arr[i] != 10) {

                copy[j] = arr[i];
                j++;

            }

          for ( int i=0;i<n;i++) {
            System.out.println(copy[i]);
        }
        
        }
        
    }
     