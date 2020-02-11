import java.util.*;
public class jstr1_17{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();
        int m = Integer.parseInt(s3);
        if(s1.length()==s2.length())
        {
          int lm_read = Integer.parseInt(s1.substring(5));
          int tm_read = Integer.parseInt(s2.substring(5));
          System.out.println((tm_read-lm_read)*4);
            
        }
        else
        {
            System.out.println("input invalid: Strings should be of same length");
        }
        
    }
}