import java.util.*;
class ArrayListDemo
{
	public static void main(String ar[])
	{
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("10");
		al.add("a");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"p");
		System.out.println(al);
		al.add("q");
		System.out.println(al);
	}
}