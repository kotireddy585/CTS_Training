import java.util.*;
public class jstr2_7{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder str2 =str1.reverse();
        String st = new String(str2);
        // System.out.println(st);
        char ch;
        int count1=0,count2=0,count3=0,count4=0,count5=0;
        if(str.equals(st))
        {
            if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u"))
            {
                for(int i = 0;i<str.length();i++)
                {
                    ch = str.charAt(i);
                    switch(ch)
                    {
                        case 'a': count1++;
                        // System.out.println(count1);
                                     break; 
                        case 'e': count2++;
                                   break;
                        case 'i': count3++;
                                  break;
                        case 'o': count4++;
                                   break;
                        case 'u': count5++;
                                  break;
                    }
                   
                }
                if((count1+count2+count3+count4+count5)>=3)
                {
                    System.out.println("true");   
                }
                else
                {
                    System.out.println("false");
                }
            }
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    
    }
}