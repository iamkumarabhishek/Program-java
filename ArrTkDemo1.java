	class ArrTkDemo1
	{
		void add(int[] temp)
		{
 			for(int x=0;x<temp.length;x++)
			{
 				System.out.println(temp[x]);
			} 
		}		
		
		public static void main(String[] args)
		{
 			ArrTkDemo1 ard = new ArrTkDemo2();
 			int arr[] = {12,45,78,56,23};
  			ard.add(arr);
		}

	} 