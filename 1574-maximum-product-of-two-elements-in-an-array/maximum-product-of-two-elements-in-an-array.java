class Solution {
    public int maxProduct(int[] nums) {
        int m1=-9999;
        int m2=-9999;
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>m1) {
                m1=nums[i];
                k=i;
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]>m2 && i!=k) m2=nums[i];
        }
        return (m1-1)*(m2-1);
    }
}