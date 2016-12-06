import java.util.*;

class clock
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		//int hh = sc.nextInt();
		//float mm = sc.nextFloat();
		float hh,mm;
		
		for(hh=0;hh<12;hh++)
		{
			for(mm=1;mm<61;mm++)
			{
				float m2 = (mm*6)/12; 
		
				if(hh == 12||hh == 0)
					hh = 0;
		
				float res = (mm*6)-((hh*30)+m2);
				if(res == 7.5)
				{
					System.out.println("anti-clockwise angle = "+Math.abs(res));
					System.out.println("HH:MM "+hh+":"+mm);
				}
					
				if(res == 0)
					res = 360;
		
				float res2 = 360-Math.abs(res);
				if(res2 == 7.5)
				{
					System.out.println("     clockwise angle = "+Math.abs(res2));
					System.out.println("HH:MM "+hh+":"+mm);
				}
			}
		}
		
		/*float m2 = (mm*6)/12; 
		
		if(hh == 12)
			hh = 0;
		
		float res = (mm*6)-((hh*30)+m2);
		System.out.println("anti-clockwise angle = "+Math.abs(res));
		if(res == 0)
			res = 360;
		
		float res2 = 360-Math.abs(res);
		System.out.println("     clockwise angle = "+Math.abs(res2));*/
		
	}
}
