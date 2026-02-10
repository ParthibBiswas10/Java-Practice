class Solution {
    public boolean isTrionic(int[] nums) {
        int flag=0;
        int n=nums.length;
        int inc=0;
        int dec=0;
        for(int i=0;i<nums.length-1;i++){
           if(nums[0]>=nums[1]) return false;
            if (nums[i] == nums[i + 1]) return false;
           if(flag==0){
            if(nums[i]>nums[i+1]){
                flag=1;
                inc++;
            }
           }
           if(flag==1){
            if(nums[i]<nums[i+1]){
                flag=0;
                dec++;
            }
           }
        }
           if(flag==0){
             inc++;
           }
           else dec++;
        
        if(inc==2 && dec==1) return true;
        else return false;
    }
}