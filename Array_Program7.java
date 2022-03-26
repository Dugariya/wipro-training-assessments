import java.util.*;
class Array_Program7
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

     int sum = 0;
        boolean add = true;
        
        for (int i=0; i<arr.length; i++) {

            if (arr[i] != 6 && add == true)

                sum = sum + arr[i];
            
            else if (arr[i] == 6)
                add = false;

            else if (arr[i] == 7)
                add = true;

        }
        System.out.println(sum);
        }
        
    }
     