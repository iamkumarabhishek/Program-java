class ArrCalc
{
	public static void main(String[] args) 
	{
	int[] arr1 = {2,4,6,8,10};
	int[] arr2 = {1,3,5,7};
	int count,big,small;
	
	System.out.print("no of array1 : ");
	for(int j=0;j<arr1.length;j++)
	{
		System.out.print(arr1[j]);
		System.out.print(" ");
	}
	
	System.out.println(" ");
	System.out.print("no of array2 : ");
	for(int j=0;j<arr2.length;j++)
	{
		System.out.print(arr2[j]);
		System.out.print(" ");
	}
	
	System.out.println(" ");
	System.out.print("addition of both array : ");
	if(arr1.length >= arr2.length)
	{
		count=arr2.length;
		for(int i=0;i<count;i++)
		{
			arr1[i]   = arr1[i]+arr2[i];
		}
		for(int j=0;j<arr1.length;j++)
		{
			System.out.print(arr1[j]);
			System.out.print(" ");
		}
		
	}

	else
	{
		count=arr1.length;
		for(int i=0;i<count;i++)
		{
			arr2[i]=arr2[i]+arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
	}
	
}
}
		
	  