import java.util.*;
public class ja10{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        int a = 0,b=1,c=0;
        for(int i=2;i<month;i++)
        {
            c = a + b;
          
            a = b;
            b = c;
        }
       System.out.print(c);
        
    }
}