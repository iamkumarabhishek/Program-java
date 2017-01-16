	class ArrTkDemo1
	{
		void add(int[] temp)
		{
 			for(int x:temp)
			{
 				System.out.println(x);
			} 
		}		
		
		public static void main(String[] args)
		{
 			ArrTkDemo ard = new ArrTkDemo();
 			int arr[] = {12,45,78,56,23};
  			ard.add(arr);
		}

	} 