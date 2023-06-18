package Recursion;

public class Recur {
   
       static int cnt = 0;
    static void print(){
        
         // Base Condition.
         if(cnt == 3 ) return;
         System.out.println(cnt);

         // Count incremented.
         cnt = cnt+1;
         print();

    }
    static void Nname(int i, int n){
        if(i>n) return;
        System.out.println("bogi");
        Nname(i+1,n);
    }
     static void Nno(int i, int n){
        if(i>n) return;
        System.out.println(i);
        Nno(i+1,n);
    }
    static void LNno(int i, int n){
        if(i<1) return;
        System.out.println(i);
        LNno(i-1,n);
    }
    static void Sumn(int n){
        int Sum=0;
        for(int i=1;i<=n;i++){
            Sum+=i;
        }
        System.out.println(Sum);
    }
    static void Fac(int n){
        int Sum=1;
        for(int i=1;i<=n;i++){
            Sum=i*Sum;
        }
        System.out.println(Sum);
    }
    static void printArray(int ans[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(ans[i] + " ");
      }
   }
    static void reverseArray(int arr[], int n) {
      int ans[] = new int[n];
      for (int i = n - 1; i >= 0; i--) {
         ans[n - i - 1] = arr[i];
      }
      printArray(ans, n);
   }
    public static void main(String[] args) {
        print();
        Nname(1,4);
        Nno(1,4);
        LNno(4,4);
        Sumn(5);
        Fac(5);
     int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, n);
    }

    }

