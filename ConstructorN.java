import java.io.*;

class ConstructorN
{
	
	ConstructorN()
	{
		int a = 10;
		int b = 15;
	}
	void cons()
	{
		int a = a;
		int b = b;
		System.out.println("ehllo");
		
	}
	
	
	public static void main(String[] ar)
	{
		ConstructorN con = new ConstructorN();
		con.cons();
		//System.out.println("a = "+a+"\nb = "+b);
		
	}
}