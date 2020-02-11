import java.util.*;
public class offers{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int items = s.nextInt();
        int arr[] = new int[items];
        for(int i=0;i<items;i++)
        {
            arr[i]=s.nextInt();
        }
        int min = arr[0];
        int total=0;
        int i=0;
        while(i<items)
        {
            total = total + arr[i];
            if(arr[i]<min)
            {
                min = arr[i];
            }
            items -= 1;
        }
        double dis = total * 0.2;
        if(dis>min)
        {
                System.out.println("Take offer One");
        }
        else
        {
            System.out.println("Take offer Two");
        }
    }
}