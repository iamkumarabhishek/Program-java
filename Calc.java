	import java.io.*;
	class Calc
	{
  
  	 public static void main(String[] args) throws IOException
	 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a,b;
		Calc cl = new Calc();
  	 	System.out.println("MENU");
	 	System.out.println("1 : add");
	 	System.out.println("2 : sub");
	 	System.out.println("3 : mul");
	 	System.out.println("4 : div");
	 	System.out.print("enter your choice: ");
   		int ch = Integer.parseInt(br.readLine());
   		
		switch(ch)
		{
  

			case 1:
        			cl.add();
  				break;
  
			case 2:
        			System.out.print("enter first no. :- ");
  				a = Double.parseDouble(br.readLine());
   				System.out.print("enter second no. :- ");
  				b = Double.parseDouble(br.readLine());
				cl.sub(a,b);
  				break;
	
			case 3:
				double res_mul = cl.mul();
				System.out.print("multiplication :"+ res_mul);        
   				break;

			case 4:
				System.out.print("enter first no. :- ");
  				a = Double.parseDouble(br.readLine());
   				System.out.print("enter second no. :- ");
  				b = Double.parseDouble(br.readLine());
        			double res_div = cl.div(a,b);
				System.out.print("division : "+res_div);
   				break;

			default : 
				System.out.print("wrong choice");
		}

	}

	void add() throws IOException
	{
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
		double num1,num2,res;
  		System.out.println("enter first no. :- ");
  		num1 = Double.parseDouble(br.readLine());
   		System.out.println("enter second no. :- ");
  		num2 = Double.parseDouble(br.readLine());
		res = num1+num2;
 		System.out.println("addition : "+ res);
 	}

	void sub(double num1,double num2)
	{
 		double res = num1-num2;
 		System.out.println("subtraction :"+ res);
	}


	double mul() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter first no:- ");
		double num1 = Double.parseDouble(br. readLine());
		System.out.println("enter second no:- ");
		double num2 = Double.parseDouble(br. readLine());
		double res = num1*num2;
		return res;
	}

	double div(double num1, double num2)
	{
 		double res = num1/num2;
 		return res;
	}
       }