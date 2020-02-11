import java.util.*;
public class ja3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0,re=0;
        int l = Integer.toString(n).length();
        while(l>0)
        {    
             re = n%10;
             n = n/10;
             sum = sum + re; 
             l--;
        }
        if(sum>0&&sum<18)
        {
            System.out.println("Take path " + sum);
        }
        else
        {
            System.out.println("No path ");
        }
    }
}