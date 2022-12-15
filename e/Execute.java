package e;

import java.io.*;
import java.util.*;
class Addition
{
int a,b;
Addition(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println("The values are"+a+" and "+b);
}
}
class Execute extends Addition
{
int c,sum;
Execute(int x,int y,int z)
{
super(x,y);
c=z;
}
void showc()
{
System.out.println("and "+c+" is");
}
void cal()
{
int sum=a+b+c;
System.out.println("the sum of the given values is "+sum);
}
}
class Demo
{
public static void main(String args[])
{
int a1,b1,c1;
Scanner s=new Scanner(System.in);
System.out.println("enter 3 values to add them");
a1=s.nextInt();
b1=s.nextInt();
c1=s.nextInt();
Execute e=new Execute(a1,b1,c1);
e.show();
e.showc();
e.cal();
}
}
