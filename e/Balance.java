package e;
import java.io.*;
import java.util.Scanner;
class Bank
{
String name;
long acno;
double bal;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter bank name ");
name=s.next();
System .out.println("Enter acc no.");
acno=s.nextLong();
}
void show()
{
System.out.println("bank name:"+name);
System.out.println("acc no."+acno);
}
}
class Deposit extends Bank
{
void dep(Bank b)
{
double dp;
System.out.println("enter the amount to be deposited");
dp=s.nextDouble();
b.bal=b.bal+dp;
b.show();
System.out.println("after depositing ur account balance is "+b.bal);
}
}
class Withdraw extends Bank
{
void withd(Bank b)
{
if(b.bal==0)
System.out.println("deposit first...ur balance is"+b.bal);
else
{
double w;
System.out.println("enter the amount to withdraw");
w=s.nextDouble();
if(w>b.bal)
{
b.show();
System.out.println("balance is low ..ur balance is "+b.bal);
}
else
{
b.bal=b.bal-w;
System.out.println("ur balance after withdrawing is"+b.bal);
}
}
}
}
class Balance
{
public static void main(String args[])
{
int n;
Bank b1=new Bank();
Deposit d=new Deposit();
Withdraw w1=new Withdraw();
b1.get();
System.out.println("Current balance is "+b1.bal);
System.out.println("1.deposit 2.withdraw");
System.out.println("enter your choice");
Scanner i=new Scanner(System.in);
n=i.nextInt();
if(n==1)
d.dep(b1);
else if(n==2)
w1.withd(b1);
else
System.out.println("invalid choice");
}
}
