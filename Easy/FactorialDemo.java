package Easy;

import java.io.*;
import java.util.Scanner;
class Factorial
{
void fact()
{ 
    int fact=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a number to find the factorial of that number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
fact=fact*i;
System.out.println("the factorial of a given number "+n+" is"+fact);
}
}
class FactorialDemo
{
public static void main(String args[])
{
Factorial f=new Factorial();
f.fact();
}
}