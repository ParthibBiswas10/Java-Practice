class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer>set=new HashSet<>();

            for(int j=0;j<k;j++){
                set.add(nums[i+j]);
            }
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)==1){
                max=Math.max(max,num);
            }
        }
       return max == Integer.MIN_VALUE ? -1 : max;
    }
}