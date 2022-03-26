/* Q. 
      Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
*/

class If_Program2
 {
    public static void main(String[] args)
    {

      int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
      if(n1%10 == n2%10){
      	System.out.println("True");
      }else System.out.println("false");

    }
}