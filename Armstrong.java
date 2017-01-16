import java.util.*;
class Armstrong
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),s=0,a;
		int n2=n;
			while(n>0)
		{
			a = n%10;
			s = s+a*a*a;
			n = n/10;
		}
		if(n2==s)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("non-armstrong");
	}
}