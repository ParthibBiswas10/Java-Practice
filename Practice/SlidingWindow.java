import java.util.*;

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

class SlidingWindow{
    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        
        int maxSum = obj.maximumUniqueSubarray(nums);
        System.out.println("Maximum sum of unique subarray: " + maxSum);
    }
}