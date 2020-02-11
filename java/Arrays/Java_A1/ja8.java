import java.util.*;
public class ja8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,sum=0;
		while(sum<n)
		{
			int s=sc.nextInt();
			sum=sum+s;
			c++;
		}
		System.out.println("the number of turns is "+c);
	}
}