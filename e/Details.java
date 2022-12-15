package e;
import java.io.*;
import java.util.*;
class Student
{
String name,dept;
int id;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter name");
name=s.next();
System.out.println("Enter id ");
id=s.nextInt();
System.out.println("Enter department");
dept=s.next();
}
void show()
{
System.out.println("Student name:"+name);
System.out.println("Department    :"+dept);
System.out.println("ID no :"+id);
}
}
class Area extends Student
{
String state,a;
void gets()
{
System.out.println("Enter area");
a=s.next();
System.out.println("Enter state");
state=s.next();
}
void show()
{
System.out.println("Area:"+a);
System.out.println("State:"+state);
}
}
class Details
{
public static void main(String args[])
{
Student c=new Student();
Area a=new Area();
c.get();
a.gets();
c.show();
a.show();
}
}
