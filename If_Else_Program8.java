// import java.util.*;
class If_Else_Program8
 {
    public static void main(String[] args)
    {
      
       String s=args[0];
       char c =s.charAt(0);

       if (c >='a'&& c<='z') {
        System.out.println(Character.toUpperCase(c));
         
       }else{
        System.out.println(Character.toLowerCase(c));
       
       }

    }
 }