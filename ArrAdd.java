import java.io.*;
class ArrAdd
{
 	public static void main(String[] args) throws IOException
	{
		ArrAdd aad = new ArrAdd();
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("how many no u want to enter in array1 : ");
		int num1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[num1];
		System.out.println("enter"+ num1 +"no.s in array1 : ");
		for (int i=0; i<num1; i++)
		{
		  arr1[i] = Integer.parseInt(br.readLine());
		}
		
			

		System.out.println("how many no u want to enter in array2 : ");
		int num2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[num2];
		System.out.println("enter"+ num2 +"no.s in array : ");
		for (int i =0; i<num2; i++)
		{
		  arr2[i] = Integer.parseInt(br.readLine());
		}

		

		int resArr[] = aad.arrCalc(arr1, arr2);
		for(int i=0; i< resArr.length; i++)
		{
			System.out.println(resArr[i]);
		}
	}



	int[] arrCalc(int[] tarr1, int[] tarr2)
	{
		if(tarr1.length > tarr2.length)
		{
			/*int tarr3[] = new int[tarr1.length];
			for(int i=0; i<tarr1.length; i++){
			tarr3[i] = tarr2[i];}*/
			//int tarr3[] = new int[tarr1.length];
			int tarr3[] = tarr1;
			int v = tarr3.length;System.out.println("length : "+v);
			int res_arr[] = new int[tarr1.length];
			for(int i=0; i<tarr1.length; i++){
			res_arr[i] =  tarr1[i] + tarr3[i];}
			retuen res_arr;
		}			

		if(tarr1.length < tarr2.length)
		{
			/*int tarr3[] = new int[tarr2.length];
			for(int i=0; i<tarr2.length; i++){
			tarr3[i] = tarr1[i];}*/
			//int tarr3[] = new int[tarr2.length];
			int tarr3[] = tarr2;
			int v = tarr3.length;System.out.println("length : "+v);
			int res_arr[] = new int[tarr2.length];
			for(int i=0; i<tarr2.length; i++){
			res_arr[i] =  tarr2[i] + tarr3[i];}
			retuen res_arr;
		}			

		if(tarr1.length == tarr2.length)
		{
			if(tarr1.length < tarr2.length){
			int res_arr[] = new int[tarr2.length];}else{
			int res_arr[] = new int[tarr2.length];}
			for(int i=0; i<tarr2.length; i++)
			{
				res_arr[i] =  (tarr2[i] + tarr1[i]);
			}
			retuen res_arr;
		}
		
		//return res_arr;
	}
}




























































		
	/*	if(arr1[].length > arr2[].length)
		{
			int[] resArr = new int[arr1.length];
			resArr[] = aad.ArrCalc();
			System.out.println("addition of both no.s of array is : ");
			for (int i=0; i<resArr.lengh; i++)
			{
				System.out.println(resArr[i]);
			} 
		
		}

		if(arr1[].length < arr2[].length)
		{
			int[] resArr = new int[arr2.length];
			resArr[] = aad.ArrCalc();
			System.out.println("addition of both no.s of array is : ");
			for (int i=0; i<resArr.lengh; i++)
			{
				System.out.println(resArr[i]);
			} 
		
		}

		
		if(arr1[].length = arr2[].length)
		{
			int[] resArr = new int[arr2.length];
			resArr[] = aad.ArrCalc();
			System.out.println("addition of both no.s of array is : ");
			for (int i=0; i<resArr.lengh; i++)
			{
				System.out.println(resArr[i]);
			} 
		
		}		*/