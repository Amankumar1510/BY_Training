import java.util.Scanner; //util-> package, Scanner->class
class Employee
{
 int id;
 String name;
 int Age;
 int Salary;
 String Designation;
 Employee()
{
 Scanner sc=new Scanner(System.in); //in is a variable inside System class in lang package(lang package need not //be imported)
  
  System.out.println("Enter ID:");
  id=sc.nextInt();

  System.out.println("Enter Name:");
  name=sc.next();

  System.out.println("Enter Age:");
  Age=sc.nextInt();
  
  System.out.println("Enter Salary:");
  Salary=sc.nextInt();
  
  System.out.println("Enter Designation:");
  Designation=sc.next();
}
void display()
{
    System.out.println("My Id is: "+id);
  System.out.println("My name is: "+name);
  System.out.println("My Age is: "+ Age+" having Salary : "+Salary+" as my Designation is: "+Designation);
}
}
class Demo2{
   public static void main(String args[])
{
  Employee e=new Employee();
  e.display();
  
  
}
}