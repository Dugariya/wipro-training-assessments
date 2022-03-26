class If_Program4
 {
    public static void main(String[] args)
    {

      int n1 = args.length;
        if(n1<= 0){
      	System.out.println("No values");
      }else   
          {
              for(int i =0;i<n1;i++)  
          
               System.out.println(args[i]+",");  
          }

    }
}