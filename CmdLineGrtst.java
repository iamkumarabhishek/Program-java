class CmdLineGrtst
{
 public static void main(String[] args)
{
 int num1,num2,temp;
 num1 = Integer.parseInt(args[0]);
 num2 = Integer.parseInt(args[1]);
 System.out.println("num1 = "+num1 +"num2 = "+num2);
 if (num1 < num2) 
{
 System.out.println("greater is num2 = "+num2);
}
else if(num1 > num2)
{
 System.out.println("greater is num1 = "+num1);
}
else
{
 System.out.println("no.s are equal");
}
}
}
 