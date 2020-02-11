import java.util.*;
public class jstr2_27{
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      if(str.contains("a")&&str.contains("e")&&str.contains("i")&&str.contains("o")&&str.contains("u"))
        System.out.println("1");
     else
       System.out.println("2");
    }
}