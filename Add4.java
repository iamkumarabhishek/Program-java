import java.io.*;
import java.util.*;

class Add4
{
	public static void main(String[] ar)
	{
		Add4 add = new Add4();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = add.display(a,b);
		System.out.println("Sum of "+a+" and "+b+" is : "+res);
	}
	
	int display(int x, int y)
	{
		int z = x+y;
		return z;
	}
}