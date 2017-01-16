class DigitWord
{
	public static void main(String[] ar)
	{
		int num = 1992,temp = 0,rmndr;
		int numcpy = num;
		System.out.println("no. is : "+num);
		while(numcpy>0)
		{
		 rmndr = numcpy%10;
		 temp = temp * 10 + rmndr;
		 numcpy = numcpy/10;
		}
		numcpy = temp;
		while(numcpy>0)
		{
		 rmndr = numcpy%10;
		 int rmn = rmndr;
		 if(rmn == 0)
		 {
			System.out.print("zero ");
		 }
		 else if(rmn == 1)
		 {
			System.out.print("one ");
		 }
		 else if(rmn == 2)
		 {
			System.out.print("two ");
		 }
		 else if(rmn == 3)
		 {
			System.out.print("three ");
		 }
		 else if(rmn == 4)
		 {
			System.out.print("four ");
		 }
		 else if(rmn == 5)
		 {
			System.out.print("five ");
		 }
		 else if(rmn == 6)
		 {
			System.out.print("six ");
		 }
		 else if(rmn == 7)
		 {
			System.out.print("seven ");
		 }
		 else if(rmn == 8)
		 {
			System.out.print("eight ");
		 }
		 else 
		 {
			System.out.print("nine ");
		 }
		 numcpy = numcpy/10;
		}
	}
}