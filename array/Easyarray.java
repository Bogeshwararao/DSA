package array;
import java.util.*;
import java.lang.reflect.Array;

public class Easyarray {
     static void Print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void Largest(int arr[], int n){
        int Largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
           
        }
       // return Largest;
        System.out.println(Largest);
    }
    static void Secondlarge(int arr[],int n){
        if(n<2){
            System.out.println("invalid");
            return;
        }
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                System.out.println(arr[i]);
                return;
            }
        }

    }
     static void Secondsmall(int arr[],int n){
        if(n<2){
            System.out.println("invalid");
            return;
        }
        Arrays.sort(arr);
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                System.out.println(arr[j]);
                return;
            }
        }

    }
    static int secondSmallest(int arr[], int n){
        if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
    }
    static boolean Sort(int arr[], int n){
        for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }

    return true;
    }
    static void Removedup(int arr1[],int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
         Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
    static void Leftrotateoneplace(int arr[], int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
           arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        Print(arr,n);
    }      
      static void Reverse(int arr[],int n,int start,int end){
            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
             }
           // Print(arr, n);
      }
      static void Leftrotatedplace(int arr[],int n, int d){
        if(d>n){
            d=d%n;
        }
        Reverse(arr, n,  0, d-1);
         Reverse(arr, n,  d, n-1);
        Reverse(arr, n,  0, n-1);
         Print(arr, n);
      }
      static void Nonzerotolast(int arr[], int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        Print(arr,n);
      }
      static void Linearsearch(int arr[], int n,int num){
               for(int i=0;i<n;i++){
                if(arr[i]==num){
                   System.out.println(i);
                   return;
                }
                
               }   
               System.out.println("not found");
      }
      static void MissingNum(int arr[], int N){
        int xor1=0, xor2=0;
        int n=N-1;
        for(int i=0;i<n;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^N;
        System.out.println( xor1^xor2);
      }
      static void Rough(int arr,int n){
        int large = Integer.MIN_VALUE;
        System.out.println(large);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int arr1[]={1,1,2,2,2,3,4};
        int n=arr.length;
        int n1=arr1.length;
        // System.out.println(Largest(arr, n));
        //Largest(arr, n);
        //Secondlarge(arr, n);
        //secondSmallest(arr, n);
      //  Secondsmall(arr, n);
        //Sort(arr, n);
        //Removedup(arr1,n1);
       // Leftrotateoneplace(arr,5);
        //Reverse(arr,0,2,n);
        //Leftrotatedplace(arr,n,13);
      //  Nonzerotolast(arr,n);
      //Linearsearch(arr,n,45);
      MissingNum(arr,n);
    }
}
