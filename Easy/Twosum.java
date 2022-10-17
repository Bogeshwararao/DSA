package Easy;
import java.util.HashMap;
public class Twosum {
    public static void main(String[] args) {
        int[] nums= {1,3,4,5};
        int target=7;
        HashMap<Integer,Integer> HM= new HashMap<>();
        
        for (int i =0 ; i<nums.length ; i++){
           int comp=target-nums[i];
            if(HM.containsKey(comp)){
                // return new int[]{i,HM.get(comp)};
                System.out.println(i + ","+ HM.get(comp));
            }else {
                HM.put(nums[i],i);
            }   
        }
    }
}
