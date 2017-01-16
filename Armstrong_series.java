import java.util.*;
class Armstrong_series
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		long s=0,a,n2,count=0;
		for(long i=1;i>0;i++)
		{
			n2 = i;s=0;
			while(n2>0)
			{
				a = n2%10;
				s = s+a*a*a;
				n2 = n2/10;
			}
			
			if(i==s)
			{
				System.out.println("armstrong ----------------  n2 = " + i);
				count++;
				//if(count == 10)
					//break;
			}
		}
	}
}