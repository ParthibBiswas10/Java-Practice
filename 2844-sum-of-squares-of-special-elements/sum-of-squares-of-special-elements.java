class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i!=0 && n%i==0) sum+=Math.pow(nums[i-1],2);
        }
        return sum;
    }
}