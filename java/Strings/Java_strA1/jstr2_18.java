import java.util.*;
public class jstr1_18{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String sub1[] = s1.split(" ");
        String sub2[] = s2.split(" ");
        String search = sub2[1];
        int count=0;
        for(int i=0;i<sub1.length;i++)
        {
            if(sub1[i].equals(search))
            {
                count++;
            }
        }
       System.out.println(count);
        
        
    }
}