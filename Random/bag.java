import java.util.*;

class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) return 0; 

        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            pairs.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairs); 

        long minScore = 0, maxScore = 0;
        int n = pairs.size();
        
        for (int i = 0; i < k - 1; i++) {
            minScore += pairs.get(i);       
            maxScore += pairs.get(n - 1 - i); 
        }

        return maxScore - minScore;
    }
}
