import java.util.*;
public class jstr2_10{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = "";
        char ch;
        for(int i=0;i<str1.length();i++)
        {
            ch = str1.charAt(i);
            if(str2.indexOf(ch)<0)
            {
                str2 = str2+ch;
            }
        }
        System.out.println(str2);
    }
}