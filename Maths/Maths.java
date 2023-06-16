package Maths;
public class Maths {
   static void Countingdigits(int n){
        int Count=0;
        while(n> 0){
            n /= 10;
            Count =Count+1;
            
        }
        System.out.println(Count);
    }
    public static void main(String[] args) {
        Countingdigits(2004);
    }
}
