import java.io.*;
import java.util.*;

class Add3
{
	public static void main(String[] ar)
	{
		Add3 add = new Add3();
		double res = add.display();
		System.out.println("Sum of  and  is : "+res);
		
	}
	
	double display()
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double z = a+b;
		return z;
	}
	
}