import java.io.*;
import java.util.*;

class Add2
{
	public static void main(String[] ar)
	{
		Add3 add = new Add3();
		double res = add.display();
		System.out.println("Sum of "+a+" and "+b+" is : "+res);
		
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