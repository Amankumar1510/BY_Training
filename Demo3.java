import java.util.Scanner;
class Employee{
  byte a=127;
  short s=32767;
  long i=9835232125L;
  float f=10/3f;
  double d=10/3d;
  int b=100;
  
  void display()
  {
   System.out.println("Byte: "+a);
   System.out.println("Short: "+s);
   System.out.println("Long: "+i);
   System.out.println("Float: "+f);
   System.out.println("Double: "+d);
   System.out.println("Int: "+b);
  }
}
class Demo3
{
  public static void main(String args[])
{
 Employee e=new Employee();
 e.display();
}
}