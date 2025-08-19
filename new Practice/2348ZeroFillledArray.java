class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long count=0;
        long a=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) count++;
            else count=0;
            a=a+count;
        }
        return a;
    }
}