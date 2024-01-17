//parent //base //super
class Parent
{
	int a=100;
	int money=1000;
	int salary;
	Parent()
	{
		salary=20000;
		System.out.println("parent class");
	}
}
//child //derived //sub
class Child extends Parent
{
	int money=500;
	Child()
	{
		salary=50000;
		System.out.println("child's money:" +money);
		System.out.println("parent's money: "+super.money);
		System.out.println("B class "+a);
		System.out.println("B salary "+salary);
	}
}
public class Demo6
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		Child c=new Child();
	}
}