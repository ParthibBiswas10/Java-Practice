import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap <Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.contains(nums[i])){
            int previndex=map.get(nums[i]);
            if(i-previndex<=k) return true;
           }
            map.put(nums[i],i);
        }
        return false;
    }
} 
    

