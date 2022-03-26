import java.util.*;
class Array_Program10
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

        int flage =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1 || arr[i]==4){
                continue;
            }else{
             flage =1; break;}
        }

        if (flage==0) {
            System.out.println("true");

        }else{
           System.out.println("false");            
        }

        }
        
    }
     