import java.util.*;
public class jstr2_26{
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     String str = s.nextLine();
     String arr[] = str.split(" ");
     String word ="";
     String h_word="";
     int i,j,l,h=0;
     for(i=0;i<arr.length;i++)
     {
         word = arr[i];
         l = word.length();
         if(l>h)
         {
             h_word = word;
             h=l;
         }
         if(l==h)
         {
             if(word.charAt(0)<h_word.charAt(0))
             h_word = word;
         }
     }
     System.out.println(h_word);
    }
}