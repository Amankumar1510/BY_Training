//abstract method used to hide implementation, if a method is abstract that class must also be abstract.
abstract class Bank
{
   abstract void loan(); //here we are hiding the implementation
}
class B extends Bank
{
  public void loan()
	{
		System.out.println("I have a logic loan method, edu,....gold ,");
	}
}
class Demo10
{
	public static void main(String args[])
	{
		 B b=new B();
		 b.loan();
	}
}