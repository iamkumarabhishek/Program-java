	import java.io.*;
	class ArrTkRet2
	{
		public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			ArrTkRet2 atr = new ArrTkRet2();
			
			System.out.println("how many no. you want to enter for addition: ");
			int num1 = Integer.parseInt(br.readLine());
			System.out.println("input no. in array for addition : ");
			int iArr1[] = new int[num1];
			for(int i=0; i<num1; i++)
			{
				iArr1[i] = Integer.parseInt(br.readLine());
			}

			System.out.println("how many no. you want to enter for comparing min value: ");
			int num2 = Integer.parseInt(br.readLine());
			System.out.println("input no. in array for searching min value : ");
			int iArr2[] = new int[num2];
			for(int i=0; i<num2; i++)
			{
				iArr2[i] = Integer.parseInt(br.readLine());
			}
		
			System.out.println("how many no. you want to enter for comparing max value: ");
			int num3 = Integer.parseInt(br.readLine());
			System.out.println("input no. in array for searching max value : ");
			double dArr1[] = new double[num3];
			for(int i=0; i<num3; i++)
			{
				dArr1[i] = Double.parseDouble(br.readLine());
			}
			
			int iRes1 = atr.add(iArr1);
			System.out.println("addition of all no. : "+iRes1);
			
			int iRes2 = atr.min(iArr2);
			System.out.println("minimum in all no. : "+iRes2);
			
			double dRes1 = atr.max(dArr1);
			System.out.println("maximum in all no. : "+dRes1);
		}

		int add(int itemp1[])
		{
			int temp = 0,i;
			System.out.println("given no.s are :");
			for(i=0; i<itemp1.length; i++)
			{
				System.out.println(itemp1[i]);
				temp = itemp1[i]+temp;
			}
	  		return temp;
		}

		int min(int itemp2[])
		{
			int i,j,a;
			System.out.println("given no.s are :");
			for(i=0; i<itemp2.length; i++)
			{
				System.out.println(itemp2[i]);
			}
	
			for(i=0; i<itemp2.length; i++)
			{
  			  for(j=i+1;j<itemp2.length;j++)
  			  {
   			    if(itemp2[i]>itemp2[j])
   			    {
    			      a=itemp2[i];
    			      itemp2[i]=itemp2[j];
    			      itemp2[j]=a;
   			    }
  			  }
 			}
			int res = itemp2[0];
			return res;
		}

		double max(double dtemp1[])
		{
			double a;
			int i,j;
			System.out.println("given no.s are :");
			for(i=0; i<dtemp1.length; i++)
			{
				System.out.println(dtemp1[i]);
			}
	
			for(i=0; i<dtemp1.length; i++)
			{
  			  for(j=i+1;j<dtemp1.length;j++)
  			  {
   			    if(dtemp1[i]>dtemp1[j])
   			    {
    			      a=dtemp1[i];
    			      dtemp1[i]=dtemp1[j];
    			      dtemp1[j]=a;
   			    }
  			  }
 			}
			double res = dtemp1[dtemp1.length-1];
			return res;
		}
	}