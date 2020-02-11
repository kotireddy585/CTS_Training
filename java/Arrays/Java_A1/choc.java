import java.util.*;
public class choc{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        for(int i =1; i<=n;i++)
        {
            if(m>=i)
            {
                m -= i;
            }
            else 
            {
                n = i-1;
                break;  
            }
            
        }
        System.out.println("remaining choclates =" + m); 
        System.out.println("Last child =" + n);
    }
}