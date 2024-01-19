class A
{
	A()
	{
                this(100);
		System.out.println("A() ");
	}
	A(int a)
	{
		this(100,"raj");
		System.out.println("A(int a)");
	}
	A(int a, String name)
	{
		System.out.println("A(int a,String name)");
	}
}
class Demo9
{
	public static void main(String args[])
	{
		A a=new A();
		//A a1=new A(100);
		//A a2=new A(100,"raj");
	}
}