//Developer Manager project with inheritance.
import java.util.Scanner;
interface Company
{
	public abstract void access();
	static String companyname="Blue Yonder";
}
abstract class Emp
{
    public int id;
    public String name;
    public int salary;
    public int age;
    public String designation;
    
    
    Emp()
	{
        Scanner sc = new Scanner(System.in);
	System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Age: ");
        int age = sc.nextInt();
	}

    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
	System.out.println("Company : " + Company.companyname);
    }
    abstract void raiseSalary();
    abstract void PF();
}
final class Developer extends Emp implements Company{
    boolean salaryincreased=false;
    Developer()
{
    salary = 50000;
    designation = "Developer";
}
    void raiseSalary()
	{
	if(salaryincreased==false)
{
	salary+=(salary*3/20);
	salaryincreased=true;
}
	}
	void PF()
	{
	System.out.println(salary/10);
	}
	public void access()
	{
		System.out.println("A block");
	}

}

final class Clerk extends Emp implements Company{
     boolean salaryincreased=false;
    Clerk(){
     salary = 250000;
     designation = "Clerk";
}
	void raiseSalary()
	{
	if(salaryincreased==false)
{
	salary+=(salary/20);
	salaryincreased=true;
}
	}
	void PF()
	{
	System.out.println(salary/10);
	}
	
	public void access()
	{
		System.out.println("C block");
	}
}
final class Manager extends Emp implements Company{
     boolean salaryincreased=false;
     Manager(){
     salary = 90000;
     designation = "Manager";		
     
}
	void raiseSalary()
	{
        if(salaryincreased==false)
{
	salary+=(salary/5);
	salaryincreased=true;
}
	}
	void PF()
	{
	System.out.println(salary/10);
	}
	
	public void access()
	{
		System.out.println("A+B block");
	}
}
final class Tester extends Emp implements Company{
boolean salaryincreased=false;
     Tester(){
     salary = 40000;
     designation = "Tester";
}
    void raiseSalary()
	{
         if(salaryincreased==false){
	salary+=(salary/10);
        salaryincreased=true;
}
	}
	void PF()
	{
	System.out.println(salary/10);
	}
	
	public void access()
	{
		System.out.println("D block");
	}
}

public class Demo5 {
    public static void main(String args[]){
        Developer d = null;
        Tester t = null;
        Manager m = null;
        Clerk c = null;

        int ch1 = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Create");
            System.out.println("2) Display");
	    System.out.println("3) UpdateSalary");
	    System.out.println("4) Show PF");
            System.out.println("5) Exit");

            System.out.println("Enter your 1st choice.....");
            ch1 = sc.nextInt();

            if(ch1 == 1){ //create
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit to main menu");

                System.out.print("Enter your 2nd choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
		    d = new Developer();
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    d.name = name;
                    d.id = id;
                    d.age = age;
                }
                if(ch2 == 2){ //Clerk
		    c = new Clerk();
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    c.name = name;
                    c.id = id;
                    c.age = age;
                }
                if(ch2 == 3){ //Tester
		     t = new Tester();
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    t.name = name;
                    t.id = id;
                    t.age = age;
                }
                if(ch2 == 4){ //Manager
		     m = new Manager();
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    m.name = name;
                    m.id = id;
                    m.age = age;
                }
                if(ch2 == 5){ //exit to main menu
                    continue;
                }
            }
            if(ch1 == 2){ //display
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your 2nd choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d.id != 0)
                        d.display();
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c.id != 0)
                        c.display();
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                    if(t.id != 0)
                        t.display();
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m.id != 0)
                        m.display();
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }
            }
	    if(ch1 == 3)
		{
 			int ch2=0;
			System.out.println("1) Developer");
                	System.out.println("2) Clerk");
                	System.out.println("3) Tester");
                	System.out.println("4) Manager");
                	System.out.println("Exit to main menu");

                	System.out.print("Enter your 2nd choice : ");
                	ch2 = sc.nextInt();

			if(ch2 == 1){ //developer
                    if(d.id != 0)
                        d.raiseSalary();
                    else
                        System.out.println("Developer Not yet registered");
                	}
                	if(ch2 == 2){ //Clerk
                    		if(c.id != 0)
                       		 c.raiseSalary();
                    	else
                        System.out.println("Clerk Not yet registered");
                	}
                	if(ch2 == 3){ //Tester
                    	if(t.id != 0)
                        t.raiseSalary();
                    	else
                        System.out.println("Tester Not yet registered");
                	}
                	if(ch2 == 4){ //Manager
                    	if(m.id != 0)
                        m.raiseSalary();
                    	else
                        System.out.println("Manager Not yet registered");
                	}
                	if(ch2 == 5) { //exit to main menu
                    	continue;
                	}
		}
			if(ch1 == 4)
		{
 			int ch2=0;
			System.out.println("1) Developer");
                	System.out.println("2) Clerk");
                	System.out.println("3) Tester");
                	System.out.println("4) Manager");
                	System.out.println("Exit to main menu");

                	System.out.print("Enter your 2nd choice : ");
                	ch2 = sc.nextInt();

			if(ch2 == 1){ //developer
                    if(d.id != 0)
                        d.PF();
                    else
                        System.out.println("Developer Not yet registered");
                	}
                	if(ch2 == 2){ //Clerk
                    		if(c.id != 0)
                       		 c.PF();
                    	else
                        System.out.println("Clerk Not yet registered");
                	}
                	if(ch2 == 3){ //Tester
                    	if(t.id != 0)
                        t.PF();
                    	else
                        System.out.println("Tester Not yet registered");
                	}
                	if(ch2 == 4){ //Manager
                    	if(m.id != 0)
                        m.PF();
                    	else
                        System.out.println("Manager Not yet registered");
                	}
                	if(ch2 == 5) { //exit to main menu
                    	continue;
                	}
		}
            if(ch1 == 5) {
                System.exit(0);
            }
        }while(ch1 != 5);
    }
}
