import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alice_bob {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
		
		int[] A = {a0,a1,a2};
		int[] B = {b0,b1,b2};
		
		int al=0, bb=0, bl=0; 
		if(A[0]>B[0])
			al = 1;
		else
			bb = 1;
		
		if(A[1]==B[1])
			bl = 0;
		
		if(A[2]<B[2])
			bb = 1;
		else
			al = 1;
		
		
		System.out.print(al+" "+bb);
	}
}