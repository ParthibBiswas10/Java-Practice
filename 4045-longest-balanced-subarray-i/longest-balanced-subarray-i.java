class Solution {
    public int longestBalanced(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int even=0;
            int odd=0;
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(set.add(nums[j])){
                    if(nums[j]%2==0)even++;
                    else odd++;
                    //set.add(nums[j]);
                }
                if(even==odd){
                    max=Math.max(max,j+1-i);
                }
            }
        }
        return max;
    }
}