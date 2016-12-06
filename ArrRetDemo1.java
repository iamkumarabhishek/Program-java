	class ArrRetDemo1
	{
		public static void main(String[] args)
		{
			ArrRetDemo1 ard = new ArrRetDemo1();
			int res[] = ard.display();
			for(int i=0; i< res.length; i++)
			{
				System.out.println(res[i]);
			}
		}

		int[] display()
		{
			int[] iarr= {21,32,45,65,78,98};
			return iarr;
		}
	}
 