class ArrMin
{
	static 	int arr[] = {5,8,13,6,9}, i, j, tmp;
			int min;  		// min is an instance array variabble
	
	public static void main(String[] args)
	{
	    ArrMin am = new ArrMin();
		int min = dispMin();
		System.out.print("minimum value in array is : "+min);
	}
	
	static int dispMin()
	{
		for(i=0; i<arr.length; i++)
		{
  			for(j=i+1;j<arr.length;j++)
  			{
   				if(arr[i]>arr[j])
   			    {
    			    tmp=arr[i];
    			    arr[i]=arr[j];
    			    arr[j]=tmp;
   			    }
  			}
 		}
		
		ArrMin am = new ArrMin();
		am.dispVal();
		return arr[0];		
	}

	void dispVal()
	{
		System.out.println("given no.s are :");
		
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}