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
    public static void main(String[] args) {
        int arr[]={13,14,2,76,76,45};
        int n=arr.length;
        // System.out.println(Largest(arr, n));
        Largest(arr, n);
        Secondlarge(arr, n);
    }
}
