import java.util.*;
import java.io.*;
import java.sql.*;
class A
{
	void abc() throws FileNotFoundException, SQLException, ArithmeticException
	{
		for(int age=0;age<=20;age++)
		{
			if(age==18) throw new ArithmeticException();
			if(age==15) throw new InputMismatchException();
			if(age==10) throw new FileNotFoundException();
			if(age==8) throw new SQLException();
			System.out.println("I: "+age);
		}
}
}
class demo18
{
	public static void main(String args[])
	{
	try
	{
		A a=new A();
		a.abc();
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic Exception came");
	}
	catch(InputMismatchException im)
	{
		System.out.println("InputMismatch Exception came");
	}
	catch(FileNotFoundException fnf)
	{
		System.out.println("FileNotFound Exception came");
	}
	catch(SQLException sql)
	{
		System.out.println("SQL Exception came");
	}
	}
}