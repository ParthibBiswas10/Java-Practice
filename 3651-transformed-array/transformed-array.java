class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ni=(i+nums[i])%nums.length;
            if(ni<0) ni+=nums.length;
            result[i]=nums[ni];
        }
        return result;
    }
}