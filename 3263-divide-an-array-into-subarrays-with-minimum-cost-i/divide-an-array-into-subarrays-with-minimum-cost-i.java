class Solution {
    public int minimumCost(int[] nums) {
        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        int score=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<f){
                s=f;
                f=nums[i];
            }
            else if(nums[i]<s){
                s=nums[i];
            }
        }
        return score+f+s;
    }
    //lessgooo
}