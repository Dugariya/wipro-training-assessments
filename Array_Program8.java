import java.util.*;
class Array_Program8
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
       int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
  
        temp[j++] = arr[n - 1];
          for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
  
        
        for ( int i=0;i<j;i++) {
            System.out.println(arr[i]);
        }
        
        }
        
    }
     