package e;
import java.util.*;
import java.io.*;
abstract class bank{
    abstract void roi();
    String name;
    double bal,intrest;
    long acc;
Scanner in= new Scanner(System.in);
void getaccountno(){
    System.out.println("ENte ac npo");
    acc = in.nextInt();
    System.out.println("enter the accoujn bal");
    bal= in.nextDouble();
}
void printaccno(){
    roi();
    System.out.println("acc"+ acc);
    System.out.println("bal"+bal);
    System.out.println("balan after interrs"+bal);
}}
class Bank1 extends bank{

         void roi(){
            intrest=0.07;
            bal= (bal+(bal*intrest));
          
         }
}
class Bank2 extends bank{
    void roi(){
        intrest=0.06;
        bal=(bal+(bal*intrest));
    }
}


public class Demo {
    public static void main(String[] args) {
        Bank1 obj1= new Bank1();
        Bank2 obj2= new Bank2();
        obj1.getaccountno();
        obj1.printaccno();
        obj2.getaccountno();
        obj2.printaccno();

    }
}
