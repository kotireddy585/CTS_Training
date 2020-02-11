import java.lang.*;
public class str1{
    public static void main(String args[]){
        String s = "Welcome to Java World";
        System.out.println(s);
        System.out.println(s.charAt(5));
        System.out.println(s.equalsIgnoreCase("welcome"));
        s = s.concat(" - Let us learn");
        // System.out.println();
        System.out.println(s);
        System.out.println(s.indexOf('a'));
        System.out.println(s.substring(4,10));
        System.out.println(s.toLowerCase());

        
    }
}