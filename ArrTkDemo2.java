	class ArrTkDemo2
	{	
 		public static void main(String[] args)
		{
 			ArrTkDemo2 atd = new ArrTkDemo2();
			int arr[] = {15,48,59,26,91,43};
			String[] sarr = {"java","sruaj","AdvJava","spring","hibernate","javaScript"};
			atd.display(arr,sarr);
		}

		void display(int[] itemp, String[] stemp)
		{
			for (int i =0;i<itemp.length;i++)
			{
				System.out.println(stemp[i]+ " "+ itemp[i]);
			}
		}
	} 