import java.util.*;
public class jstr1_24{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String empty = "";
        String sub;
        if(str.length()>=3)
        {
             sub = str.substring(0,3);
            empty =empty+sub+sub;
            System.out.println(empty);
        }
        if(str.length()<=2)
        {
            sub =str;
            empty = sub+sub+sub;
            System.out.println(empty);
        }
    }
}