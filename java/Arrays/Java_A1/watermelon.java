import java.util.*;
public class watermelon{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        if(w%2==1)
        {
            System.out.println("Can't Divide");
        }
        else
        {
            for(int i=1;i<w;i++)
            {
               System.out.println("possible divisions  "+i+" " +(w-i));
                
            }
        }
    }
}