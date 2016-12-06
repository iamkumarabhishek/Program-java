class CmdLine2
{
 
public static void main(String[] args)
{
 int sRoll;
 String sName;
 double fee;
 char grade;
 sName = (args[0]);
 sRoll = Integer.parseInt(args[1]);
 fee = Double.parseDouble(args[2]);
 grade = (args[3]).charAt(1);
 System.out.println("name = " + sName );
 System.out.println("roll = " + sRoll );
 System.out.println("fee  = " + fee );
 System.out.println("grade = " + grade );
} 
}