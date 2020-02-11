import java.util.Scanner;
public class ja7
{
    public static void main(String args[]){
		int n,c=0;
        Scanner S=new Scanner(System.in);
		while(c<3){
			double score=0;
        n=S.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
            if(a[i]>0)
            {
                if((a[i]%2)==0)
                {
                   score-=0.5;
                }
                else  
                {
                  score+=1;  
                }
                
               
            }
            else 
                 score-=1;
                 
               
        }
        System.out.println(score);
		c++;
		}
        
    }
}

