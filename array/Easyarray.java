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
    static void Rough(int arr,int n){
        int large = Integer.MIN_VALUE;
        System.out.println(large);
    }
    public static void main(String[] args) {
        int arr[]={13,14,2,76,45};
        int arr1[]={1,1,2,2,2,3,4};
        int n=arr.length;
        int n1=arr1.length;
        // System.out.println(Largest(arr, n));
        Largest(arr, n);
        Secondlarge(arr, n);
        secondSmallest(arr, n);
        Sort(arr, n);
        Removedup(arr1,n1);
    }
}
