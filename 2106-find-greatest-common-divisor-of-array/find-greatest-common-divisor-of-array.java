class Solution {
    public int findGCD(int[] nums) {
        int max=-1;
        int min=9999;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }

        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}