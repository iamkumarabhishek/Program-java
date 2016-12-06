
	class ArrTkRet1
	{
		public static void main(String[] args)
		{
			
			ArrTkRet1 atr = new ArrTkRet1();
			
			
			int[] iArr1 = {12,45,89,56,75};
			int[] iArr2 = {21,32,98,65,54};
			double[] dArr1 = {2.5,56.4,48.75,15.46,34.85};
			
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