class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
        Set<Integer> set = new HashSet<>();
            int even = 0; int odd = 0; 
            for(int j=i; j<nums.length; j++){
                if(!set.contains(nums[j])){
                    if(nums[j] % 2 == 0){
                        even++;
                    } else {
                        odd++;
                    }
                    set.add(nums[j]);
                }
                if(even == odd){
                    max = Math.max(j-i+1, max);
                }
            }
        }
        return max;
    }
}