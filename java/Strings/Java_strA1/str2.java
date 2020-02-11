import java.lang.*;
public class str2{
    public static void main(String args[]){
       StringBuffer s = new StringBuffer("This is StringBuffer");
       System.out.println(s);
       s.append(" - This is a sample program");
       System.out.println(s);
       s.insert(21,"Object");
       System.out.println(s);
       System.out.println(s.reverse());
      s =  s.reverse();
       System.out.println(s.replace(14,21,"Builder "));
        
    }
}