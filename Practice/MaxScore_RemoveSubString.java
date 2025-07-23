public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            // Remove "ab" first, then "ba"
            return removePair(s, 'a', 'b', x, y);
        } else {
            // Remove "ba" first, then "ab"
            return removePair(s, 'b', 'a', y, x);
        }
    }

    private int removePair(String s, char first, char second, int score1, int score2) {
        StringBuilder sb = new StringBuilder();
        int total = 0;

        // Step 1: remove higher score pair
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && c == second) {
                sb.deleteCharAt(sb.length() - 1);
                total += score1;
            } else {
                sb.append(c);
            }
        }

        // Step 2: remove the second pattern
        StringBuilder finalStr = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            if (finalStr.length() > 0 && finalStr.charAt(finalStr.length() - 1) == second && c == first) {
                finalStr.deleteCharAt(finalStr.length() - 1);
                total += score2;
            } else {
                finalStr.append(c);
            }
        }

        return total;
    }
}
