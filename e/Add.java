package e;
import java.util.*;
import java.io.*;

public class Add {
      int a,b;
      Add(int x, int y){
        a=x;
        b=y; 
      }
       
      void show(){
        System.out.println("sum of 2 numbers is "+(a+b));
      }
      public static void main(String[] args) {
        Add obj = new Add(10,10);
        obj.show();
      }
}
