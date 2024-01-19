class A
{
	private int id;
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	void setId(int id)
	{
		this.id=id;
	}
	String getName(){return name;}
	int getid(){return id;}
}
class Demo14
{
	public static void main(String args[])
	{
		A a=new A();
		a.setId(100);
		a.setName("Thanesh");
		System.out.println(a.getid());
		System.out.println(a.getName());

		System.out.println(args[0]);
		System.out.println(args[1]);
		int c=Integer.parseInt(args[0])+Integer.parseInt(args[1]); //Integer is package and parseInt is //method
		System.out.println(c);
	}
}