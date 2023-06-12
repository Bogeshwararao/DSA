package patterns;
public class Patterns {

  
static void pattern1(int N)
{
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
} 
static void pattern2(int N)
{
    for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void pattern3(int N)
{
    for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
static void pattern4(int N)
{
    for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
} 
static void pattern5(int N)
{
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
} 
static void pattern6(int N)
{
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
} 
static void pattern7(int N)
{
    for(int i=0;i<N;i++){
        //spaces
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        //starts
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    
} 
static void pattern8(int N)
{
    for(int i=0;i<N;i++){
        //spaces
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        //starts
        for(int j=0;j<2*N-(2*i+1);j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
static void pattern9(int N)
{
    for(int i=1;i<=2*N-1;i++){
          int star= i;
          if(i>N) star=2*N-i;
          for(int j=1;j<=star;j++){
            System.out.print("* ");
          }
        System.out.println();
    }
    
}
static void pattern10(int N)
{
    for(int i=0;i<N;i++){
        int start=1;
        if(i % 2==0){
            start=1;
        }else{
            start=0;
        }
        for(int j=0;j<=i;j++){
            System.out.print(start+" ");
            start= 1-start;
        }
        System.out.println();
    }
    
}
static void pattern11(int n){
    int space= 2*(n-1);
    for(int i=1;i<=n;i++){
        //number
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
         //spaces
         for(int j=1;j<=space;j++){
             System.out.print(" ");
         }
         //number
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        
        
       
        System.out.println();
         space -=2;
    }
    
   
    
}
static void pattern12(int n){
    int space= 2*(n-1);
    for(int i=1;i<=n;i++){
        //number
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
         //spaces
         for(int j=1;j<=space;j++){
             System.out.print(" ");
         }
         //number
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        
        
       
        System.out.println();
         space -=2;
    }
    
   
    
}
   public static void main(String[] args) {
    pattern1(4);
    pattern2(4);
    pattern3(4);
    pattern4(4);
    pattern5(4);
    pattern6(4);
    pattern7(4);
    pattern8(4);
    pattern9(4);
    pattern10(4);
    pattern11(4);
    pattern12(4);
    }
}
