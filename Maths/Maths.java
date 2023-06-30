package Maths;
public class Maths {
   static void Countingdigits(int n){
        int Count=0;
        while(n> 0){
            n /= 10;
            Count =Count+1;
          System.out.println(n);  
        }
        System.out.println(Count);
    }
    static void Reverse(int n){
        int Rever=0;
        while(n!=0){
            int digit= n%10;
            Rever=Rever*10+digit;
            n/=10;
           
        }
         System.out.println(Rever);
    }
    static void Palidrome(int n){
        int Rever=0;
        int dup=n;
        while(n!=0){
            int digit= n%10;
            Rever=Rever*10+digit;
            n/=10;
           
        }
        if(dup==Rever){
         System.out.println(Rever);}
         else{
            System.out.println("Not an palidrome");
         }
        
    }
    static void Amstrong(int n){
        int dup=n;
        int Amstro=0;
        while(n!=0){
            int digit= n%10;
            Amstro=Amstro+digit*digit*digit;

            n/=10;
           
        }
        if(Amstro==dup){
         System.out.println(Amstro);}
         else{
            System.out.println("Not an amstrong");
         }
        
        
    }
    static void Divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
        System.out.println();
    }
    static void Prime(int n){
        int cout=0;
        for(int i=0;i<=n;i++){
            if(n%1==0){
                cout +=1;
            }
        }
        if(cout==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not an prime");
        }
    }
    static void Hcf(int a,int b){
        
        for(int i= Math.min(a,b);i>1;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Countingdigits(2004);
        Reverse(2004);
        Palidrome(12);
        Amstrong(371);
        Divisor(30);
        Prime(12);
        Hcf(30,20);
    }
}
