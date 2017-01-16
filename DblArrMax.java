class DblArrMax
{
	public static void main(String[] args)
	{
		int[][] arr = {{12,15,13}, {10,8,11}};
		int temp;
		System.out.println("Elements of array : ");
		for (int i =0; i<arr.length;i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
	
		for (int i =0; i<arr.length;i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				for(int k=j+1; k<arr[i].length; k++)
				{
					if(arr[i][j]>arr[i][k])
					{
						temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
			}
		}

		for (int i =0; i<arr.length;i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println("maximum element is :  "+arr[1][2]);
	}
}