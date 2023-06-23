package hashing;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hashset {
    
    static void Union(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set.size());
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        
    }
    static Integer Intersection(int arr1[], int arr2[]){
        
         HashSet<Integer> set=new HashSet<>();
         int Count=0;
         for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
         }
         for(int j=0;j<arr1.length;j++){
            if(set.contains(arr2[j])){
                Count =Count+1;
                set.remove(arr2[j]);
            }
         }
         return Count;
    }
    static void Majority(int arr[]){

    }

public static void main(String[] args) {
    int arr[] = {10,5,10,15,10,5};
     int arr1[] = {10,5,6,15};
     int arr2[]={1,2,3,5};
     int n = arr.length;
     //Frequency(arr, n);
    //  Union(arr1, arr2);
    System.out.println(Intersection(arr1,arr2));
    
}
}
