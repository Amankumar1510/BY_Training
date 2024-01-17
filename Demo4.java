import java.util.Scanner;
class Create
{
          Create(Developer d,Clerk c,Manager m,Tester t)
{
          int ch=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("1 : Developer ");
	  System.out.println("2 : Clerk");
	  System.out.println("3 : Manager ");
	  System.out.println("4 : Tester");
          System.out.println("5 : Exit");
 	  
         
          while(true)
{
System.out.println("Enter choice : ");
	  ch=sc.nextInt();
 if(ch==1)
{
  d=new Developer();
}

if(ch==2)
{
 c=new Clerk();
}

if(ch==3)
{
 m=new Manager();
}

if(ch==4)
{
 t=new Tester();
}

if(ch==5)
{
 System.out.println("Thank you");
 System.exit(0);
}

}
}
}

class Developer
{
	int id;
	String name;
	int age;
	int salary=50000;
	String desig="Developer";
	
	Developer()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			id=sc.nextInt();
			System.out.println("Enter Name");
			name=sc.next();
			System.out.println("Enter Age");
			age=sc.nextInt();
			
		}
	void display()
		{
 			System.out.println("My name is : "+name);
			System.out.println("My Id is : "+id);
			System.out.println("My Age is : "+age);
			System.out.println("My Salary is : "+salary);
			System.out.println("My Designation is : "+desig);
		}
}

class Clerk
{
	int id;
	String name;
	int age;
	int salary=20000;
	String desig="Clerk";
	
	Clerk()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			id=sc.nextInt();
			System.out.println("Enter Name");
			name=sc.nextLine();
			System.out.println("Enter Age");
			age=sc.nextInt();
			
		}
	void display()
		{
 			System.out.println("My name is : "+name);
			System.out.println("My Id is : "+id);
			System.out.println("My Age is : "+age);
			System.out.println("My Salary is : "+salary);
			System.out.println("My Designation is : "+desig);
		}
}

class Manager
{
	int id;
	String name;
	int age;
	int salary=30000;
	String desig="Manager";
	
	Manager()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			id=sc.nextInt();
			System.out.println("Enter Name");
			name=sc.nextLine();
			System.out.println("Enter Age");
			age=sc.nextInt();
			
		}
	void display()
		{
 			System.out.println("My name is : "+name);
			System.out.println("My Id is : "+id);
			System.out.println("My Age is : "+age);
			System.out.println("My Salary is : "+salary);
			System.out.println("My Designation is : "+desig);
		}
}

class Tester
{
	int id;
	String name;
	int age;
	int salary=40000;
	String desig="Tester";
	
	Tester()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			id=sc.nextInt();
			System.out.println("Enter Name");
			name=sc.nextLine();
			System.out.println("Enter Age");
			age=sc.nextInt();
			
		}
	void display()
		{
 			System.out.println("My name is : "+name);
			System.out.println("My Id is : "+id);
			System.out.println("My Age is : "+age);
			System.out.println("My Salary is : "+salary);
			System.out.println("My Designation is : "+desig);
		}
}



class Demo4
{
	public static void main(String args[])
	{
         Developer d=null;Clerk c=null;Manager m=null;Tester t=null;
	 int value=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("1: Create ");
 	 System.out.println("2 : Display ");
	  System.out.println("3 : Exit ");
         System.out.println("Enter first choice: "); 
	 value=sc.nextInt();
         while(true)
	 {
		if(value==1)
		{
                  Create crt=new Create(d,c,m,t);
		}
		if(value==2)
		{
                 int ch=0;
	  	Scanner sn=new Scanner(System.in);
	  	System.out.println("1 : Developer ");
	  	System.out.println("2 : Clerk");
	  	System.out.println("3 : Manager ");
	  	System.out.println("4 : Tester");
          	System.out.println("5 : Exit");
 	  
         
          		while(true)
			{
			System.out.println("Enter choice : ");
	  		ch=sc.nextInt();
 			if(ch==1)
			{
                                if(d==null)
                                System.out.println("Developer not yet registered");
                                else
  				d.display();
			}

			if(ch==2)
			{
                                if(c==null)
                                System.out.println("Clerk not yet registered");
                                else
 				c.display();
			}

			if(ch==3)
			{
                                 if(m==null)
                                System.out.println("Manager not yet registered");
                                else
				 m.display();
			}

			if(ch==4)
			{
                                if(t==null)
                                System.out.println("Tester not yet registered");
                                else
 				t.display();
			}

			if(ch==5)
			{
 				System.out.println("Thank you");
 				System.exit(0);
			}
		}
	}
		if(value==3)
		{
			System.out.println("Thank you");
			System.exit(0);
		}
	 }
         
	}
}