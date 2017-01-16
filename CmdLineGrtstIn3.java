class CmdLineGrtstIn3
{
 public static void main(String[] args)
{
 int num1,num2,num3,sum,argLnth;
 num1 = Integer.parseInt(args[0]);
 num2 = Integer.parseInt(args[1]);
 num3 = Integer.parseInt(args[2]);
 argLnth = args.length;
 if (argLnth < 3 || argLnth >3)
 {
   System.out.println("input no. is exceeding or decresing by 3");
 }
 else
 {
   sum = num1+num2+num3;
   System.out.println("sum = "+sum);
 }
 }
}

 
 