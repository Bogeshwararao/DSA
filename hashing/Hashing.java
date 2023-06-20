package hashing;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    
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
            System.out.print(itr.next());
        }
        
    }
    static void Intersection(int arr1[], int arr2[]){
         
    }
    static void Majority(int arr[]){

    }
     static void Frequency(int arr[], int n)
{
    Map<Integer, Integer> map = new HashMap<>();
 
    for (int i = 0; i < n; i++)
    {
        if (map.containsKey(arr[i]))
        {
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        else
        {
            map.put(arr[i], 1);
        }
    }
    // Traverse through map and print frequencies
    for (Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
public static void main(String[] args) {
    int arr[] = {10,5,10,15,10,5};
     int arr1[] = {10,5,6,10,15,10,5};
     int arr2[]={1,2,3};
     int n = arr.length;
     Frequency(arr, n);
     Union(arr1, arr2);
}
}
