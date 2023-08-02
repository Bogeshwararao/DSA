package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Midium {
     static void twoSum(int[] nums, int target,int n) {
         Arrays.sort(nums);
       int left=0;      
       int right=n-1;
       while(left<right){
           int sum=nums[left]+nums[right];
           if(sum==target) {
               System.out.print(nums[left]+"  " +nums[right]);
               return;
           }
           else if(sum<target) left++;
           else right--;
       }
       System.out.println();
       
    }
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
              for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
        }
        static void maxProfit(int[] arr) {
            int maxPro = 0;
            int minPrice = arr[0];
            for (int i = 0; i < arr.length; i++) {
                minPrice = Math.min(minPrice, arr[i]);
                maxPro = Math.max(maxPro, arr[i] - minPrice);
            }
            System.out.println(maxPro); 
            }
            
    public static void main(String[] args) {
        int arr1[]= {3,2,3};
        int arr3[]= {2, 6, 5, 8, 11};
         int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        // zeroonetwoSort(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    //    nby2TImes(arr1,n);
        // twoSum(arr3,14,5);
        maxProfit(arr3);
    }

}
