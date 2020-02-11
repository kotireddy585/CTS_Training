import java.util.*;
public class jstr2_4 {
    public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str1 = s.nextLine();
       String str2 = s.nextLine();
       String strsub;
       int l1 = str1.length();
       int l2 = str2.length();
         System.out.println(l1);
         System.out.println(l2);
         if(l1==l2)
         {
              str1 = str1.concat(str2);
              System.out.println(str1);
         }
         else if(l1>l2)
         {
             strsub = str1.substring(l1-l2);
             System.out.println(strsub);
         }
         else
         {
             strsub = str2.substring(l2-l1);
             System.out.println(strsub);
         }
    }
}