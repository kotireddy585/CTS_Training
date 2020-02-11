import java.util.*;
public class jstr2_11{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      String arr[] = str.split("\\.");
      if(arr.length==4)
      {
          int a1 = Integer.parseInt(arr[0]);
          int a2 = Integer.parseInt(arr[1]);
          int a3 = Integer.parseInt(arr[2]);
          int a4 = Integer.parseInt(arr[3]);
          if((a1>=0&&a1<=255)&&(a2>=0&&a2<=255)&&(a3>=0&&a3<=255)&&(a4>=0&&a4<=255))
            System.out.println("1");
          else
            System.out.println("2");

      }
      
    }
}