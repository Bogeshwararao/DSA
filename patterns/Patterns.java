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
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
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

    }
}
