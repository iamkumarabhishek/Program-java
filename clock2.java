import java.util.*;

class clock2
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		float mm = sc.nextFloat();
		
		
		
		float m2 = (mm*6)/12; 
		
		if(hh == 12)
			hh = 0;
		
		float res = (mm*6)-((hh*30)+m2);
		System.out.println("anti-clockwise angle = "+Math.abs(res));
		if(res == 0)
			res = 360;
		
		float res2 = 360-Math.abs(res);
		System.out.println("     clockwise angle = "+Math.abs(res2));
		
	}
}
