import java.util.*;
import java.io.*;
class demo16
{
	public static void main(String args[]) throws FileNotFoundException
	{
		m1();
	}
	static void m1() throws FileNotFoundException
	{
		m2();
		System.out.println("m1 method");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("m2 method");
	}
	static void m3() throws FileNotFoundException	{
		File f=new File("abc.text");
		FileReader fr=new FileReader(f);
	}
	
}