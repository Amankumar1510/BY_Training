final class Car
{
	final int speed=100;
	void gear()
	{
		System.out.println("4 ");
	}
}

class BMW extends Car
{
	void gear()
	{
		System.out.println("5 gear "+"Speed is :"+speed);
		super.gear();
	}
}
class Demo13
{
	public static void main(String args[])
	{
		Car c=new Car();
		System.out.println("Car Speed: "+c.speed);
		BMW b=new BMW();
		b.gear();
	}
}