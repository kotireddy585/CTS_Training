import java.util.*;
public class lucky{
 public static void main(String args[]){
	 Scanner s = new Scanner(System.in);
	 int Bill_no = s.nextInt();
 	 int date = s.nextInt();

     int l = Integer.toString(date).length();
   
     int i=1,re,n=0,copy_bill;
     copy_bill = Bill_no;
     while(date>0&&date<31)
     {
       n=0;     
       while(l>0)
       {
           re = copy_bill%10;
           copy_bill = copy_bill/10;
           n = n+(re*i);
           i = i * 10;
         l--;
      }
     } 
     if(((n==date)||(Bill_no%date)==0))
     {
         System.out.println("your are a lucky customer");
     }
     else
     {
         System.out.println("your are not lucky customer");
     }
 }
}