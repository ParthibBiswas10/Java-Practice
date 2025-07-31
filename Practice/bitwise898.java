import java.util.*;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> prev = new HashSet<>();
        
        for (int num : arr) {
            Set<Integer> curr = new HashSet<>();
            curr.add(num);  // subarray of length 1
            for (int p : prev) {
                curr.add(p | num); // extend previous subarrays
            }
            prev = curr;
            result.addAll(curr); // add all ORs from this position
        }
        
        return result.size();
    }
}
