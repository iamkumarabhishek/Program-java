import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BestDevisor 
{

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		
		int i=1;
		while(n>=i)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
    }
}
