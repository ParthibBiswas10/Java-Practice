class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int start=0;
        for(int i=0;i<n;i++){
                int x=nums[i];
                map.put(x,map.getOrDefault(x,0)+1);

               while(map.get(x)>k){
                int remove=nums[start];
             map.put(remove, map.get(remove) - 1);
                start++;
               }
                max=Math.max(max,i-start+1);
            }
        
        return max;
    }
}