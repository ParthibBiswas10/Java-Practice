import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet <Integer> seen= new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)) return true;
            else seen.add(num);
        }
        return false;
    }
}
class check{
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] nums = {1, 2, 3, 1}; 
        boolean hasDuplicate = obj.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + hasDuplicate);
    }
}