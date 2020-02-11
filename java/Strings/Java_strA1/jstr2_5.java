import java.util.*;
public class jstr2_5{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      String arr[] = str.split("/");
      int d,m,y,yl,l;
      l = arr.length;
      if(l==3)
      {
         yl = arr[2].length();  
         d = Integer.parseInt(arr[0]);
         m = Integer.parseInt(arr[1]);
         y = Integer.parseInt(arr[2]);
         
        if(d<=31&&m<=12&&yl==4&&(y>999&&y<=9999))
           System.out.println("true");
        else
          System.out.println("false");
         
      }
    
    }
}