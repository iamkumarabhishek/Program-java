import java.io.*;
class ArrMerge
{
	public static void main(String[] args) throws IOException
	{
		//int[] arr2 = {2,4,6,8,10,12,14,16};
		//int[] arr1 = {1,3,5,7};

		
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int count,big,small,cntAll;
		

		
		System.out.print("how many no u want to enter in array1 : ");
		int num1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[num1];
		System.out.println(" ");
		System.out.print("enter "+ num1 +" no.s in array1 : ");
		System.out.print(" ");
		for (int i=0; i<num1; i++)
		{
		  	arr1[i] = Integer.parseInt(br.readLine());
			System.out.print(" ");		
		}
		
			
		System.out.println("");
		System.out.print("how many no u want to enter in array2 : ");
		int num2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[num2];
		System.out.println("");
		System.out.print("enter "+ num2 +" no.s in array : ");
		for (int i =0; i<num2; i++)
		{
		  	arr2[i] = Integer.parseInt(br.readLine());
			System.out.print(" ");
		}
			cntAll = arr1.length + arr2.length;
		
	System.out.println("");
	int[] arr3 = new int[cntAll];
	System.out.print("no of array1 : ");
	for(int j=0;j<arr1.length;j++)
	{
		System.out.print(arr1[j]);
		System.out.print(" ");
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("no of array2 : ");
	for(int j=0;j<arr2.length;j++)
	{
		System.out.print(arr2[j]);
		System.out.print(" ");
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("addition of both array : ");
	
	System.out.print	(" ");
		

	int k =0;
	if(arr1.length >= arr2.length)
	{
		count=arr2.length;
		for(int i=0;i<count;i++)
		{
			arr3[k]   = arr1[i];
			arr3[k+1] = arr2[i];
			k= k+2;
		}

		for(int i=count;i<arr1.length;i++)
		{
			arr3[k] = arr1[i];
			k = k+1;
		}
		for(int j=0;j<cntAll;j++)
		{
			System.out.print(arr3[j]);
			System.out.print(" ");
		}
	}
	
	else
	{
		count=arr1.length;
		k=0;
		for(int i=0;i<count;i++)
		{
			arr3[k]   = arr2[i];
			arr3[k+1] = arr1[i];
			k=k+2;
		}
		
		for(int i=count;i<arr2.length;i++)
		{
			arr3[k] = arr2[i];
			k = k+1;
		}
		for(int j=0;j<cntAll;j++)
		{
			System.out.print(arr3[j]);
			System.out.print(" ");
		}
		
	}

}
}
		
	  