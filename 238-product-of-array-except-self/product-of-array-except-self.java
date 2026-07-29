class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int flag=0;
        int mul=1;
        
        int answer[]=new int[n];
        for(int i=0;i<n;i++){
           if(nums[i]!=0){
            mul*=nums[i];
           }
           else flag++;
        }
        if(flag==n) mul=0;
        for(int i=0;i<n;i++){
            if(flag!=0){
                if(nums[i]!=0) answer[i]=0;
                else answer[i]=mul;
            }
            else answer[i]=mul/nums[i]; 
        }
        if(flag>1){
            for(int i=0;i<n;i++){
           answer[i]=0;
        }
        }
        return answer;
    }
}