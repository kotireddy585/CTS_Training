import java.util.*;
public class jstr1_22{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c1 = str.charAt(0);
        char c2 = str.charAt(str.length()-1);
        char a[] = str.toCharArray();
         a[0] = c2;
         a[a.length-1]=c1;
         System.out.println(a);
        
    }
}