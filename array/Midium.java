package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Midium {
        static void zeroonetwoSort(ArrayList<Integer> arr,int n){
            int low=0;
            int mid=0;
            int high=n-1;
            while(mid<=high){
                if(arr.get(mid)==0){
                            int temp=arr.get(low);
                            arr.set(low,arr.get(mid));
                            arr.set(mid,temp);
                            low++;
                            mid++;
                }
                else if(arr.get(mid)==1){
                        mid++;
                }else{
                    int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
                }
            }
        }
        static int nby2TImes(int arr[],int n){
            HashMap<Integer, Integer> map = new HashMap<>();
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
     for (Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        if(entry.getValue()>n/2) {
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }
  return -1;
        }
            
    public static void main(String[] args) {
        int arr1[]= {1,2,1,2,2,2};
         int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        zeroonetwoSort(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        nby2TImes(arr1,n);

    }

}
