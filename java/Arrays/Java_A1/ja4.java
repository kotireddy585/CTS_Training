import java.util.*;
public class ja4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=0;
		if(n%4==0)
			p=(n/2)*(n/2);
		else
		{
			n=n-(n%4);
			p=(n/2)*(n/2);
		}
		System.out.println(p);
	}
}