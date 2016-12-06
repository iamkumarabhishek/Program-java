import java.io.*;
import java.util.zip.*;

public class Compress
{
	public static void main(String[] ar) throws IOException
	{
		FileInputStream fis = new FileInputStream("file2.txt");
		FileOutputStream fos = new FileOutputStream ("file5.txt");
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
				
		int ch;
		while((ch = fis.read()) != -1)
		{
			dos.write(ch);
		}
		fis.close();
		dos.close();
	}
}