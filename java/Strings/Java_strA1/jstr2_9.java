import java.util.*;
import java.lang.*;
public class jstr2_9{
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       char ch = str.charAt(0);
       if(ch == '-')
       {
           System.out.println(str.substring(1));
       }
       else
       {
            System.out.println("-1");
       }
    }
}