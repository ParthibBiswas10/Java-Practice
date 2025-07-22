class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer>seen=new HashSet<>();
        int left=0,cs=0,ms=0;
        for(int right=0;right<nums.length;right++){
            int num=nums[right];
            while(seen.contains(num)){
                seen.remove(nums[left]);
                cs-=nums[left];
                left+=1;
            }
            seen.add(num);
            cs+=num;
            ms=Math.max(ms,cs);

        }
        return ms;
    }
}