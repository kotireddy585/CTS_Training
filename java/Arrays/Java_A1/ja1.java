import java.util.*;
public class ja1{
    public static void main(String args[]){
        int i,j,c=0,p=0;
        Scanner s = new Scanner(System.in);
        for(i=2;i<60;i++)
        {   c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {   
                p++;
                if(p%2!=0)
                {
                  System.out.println(i);
                }
            }
            
        }
        
    }
}