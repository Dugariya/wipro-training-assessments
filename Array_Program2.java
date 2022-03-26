import java.util.*;
class Array_Program2
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

       int max =arr[0],min=arr[0];

       for(int i=0;i<arr.length;i++){
          if(max<arr[i]){
             max =arr[i];
          }
          if (min>arr[i]) {
            min=arr[i];
             
          }
       }

        System.out.println("Max of all array elements is : " +max + " and min is :" +min);

       }
        
    }
     