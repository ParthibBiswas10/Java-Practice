class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long swaps = 0;
        int white = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {  // Move black to the right
                swaps += white;
            } else {  // If it's white ('0'), increment white count
                white++;
            }
        }

        return swaps;
    }
}