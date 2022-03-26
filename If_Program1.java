class If_Program1
 {
    public static void main(String[] args)
    {

      int n = Integer.parseInt(args[0]);
      if(n>0){
            System.out.println("Number "+n+" is Positive");
      } if(n<0){
         System.out.println("Number "+n+" is Negative");
      }
       if(n==0){
          System.out.println("Number "+n+" is Zero");
        }

    }
}