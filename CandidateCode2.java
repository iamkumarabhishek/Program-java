import java.util.*;
import java.io.*;
public class CandidateCode2 
{
	static int t[] = new int[300],a=0;
	public static void combine(int input1[], int darr[], int srt,int end, int idx, int input2)
	{
		int s =0;
		if (idx == input2)
		{
			for (int j=0; j<input2; j++)
				s = s+darr[j];
				t[a] = s;
			if(a<t.length-1)
				a++;
			return;
		}
		for (int i=srt; i<=end && end-i+1 >= input2-idx; i++)
		{
			darr[idx] = input1[i];
			combine(input1, darr, i+1, end, idx+1, input2);
		}
	}
	
	public static int CompanyRecruitment(int[] input1,int input2)
    {
		int tmp=0,count=0;
		int n = input1.length;
		int darr[]=new int[input2];
		
		combine(input1, darr, 0, n-1, 0, input2);
		input1=t;
		for(int i=0; i<input1.length; i++)
		{
  			for(int j=i+1;j<input1.length;j++)
  			{
   				if(input1[i]<input1[j])
   			    {
    			    tmp=input1[i];
    			    input1[i]=input1[j];
    			    input1[j]=tmp;
   			    }
  			}
 		}
		int j=0;
		for(int i=0;i<input1.length;i++)
		{
			if(input1[0] == input1[j])
				count++;j++;
		}
		if(count == 300)
			count = 0;
		return count;
    }
	
	public static void main (String[] ar) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10],cnt;
		
		for(int i=0; i<arr.length;i++)
			arr[i] = sc.nextInt();
		cnt = sc.nextInt();
		
		int res = CompanyRecruitment(arr,cnt);
			System.out.println(res);
	}
	
}