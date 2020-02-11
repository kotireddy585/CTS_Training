import java.util.*;
public class jstr2_25{
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     String pan = s.nextLine();
     int i=0,f1=0,f2=0,f3=0;
     char ch,l_ch;
     if(pan.length()==8)
     {    
         
         while(i<3)
         {
             ch = pan.charAt(i);
             if(ch>='A'&&ch<='Z')
             {
                 f1=1;
             }
             else
             {
                 System.out.println("First three character must be capitals");
                 break;
             }
            i++;
         }
         while(i<7)
         {
             ch = pan.charAt(i);
             if(ch>=48&&ch<=57)
             {
                 f2=1;
             }
             else
             {
                 System.out.println("4-7 must be digits");
             }
           i++;     
         }
         l_ch = pan.charAt(pan.length()-1);
         if(l_ch>='A'&&l_ch<='Z')
         {
             f3=1;
                // System.out.println("valid pan");
         }
         else
         {
                 System.out.println("Last character must be capital");
         }
        if((f1+f2+f3)==3)
        {
            System.out.println("Valid pan");
        }
		else
		{
			System.out.println("Invalid pan")
		}
		
     }
     else
     {
         System.out.println("Invalid Pan Number : must be 8 characters");
     }
    }
}