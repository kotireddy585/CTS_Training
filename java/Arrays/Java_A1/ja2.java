import java.util.*;
public class ja2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,c=0,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
            {    
                c++;
                sum = sum+arr[i];
            }
        }
        System.out.println("total positive "+c);
        System.out.println("Sum of all positive "+sum);
    }
}