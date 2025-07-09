import java.util.Arrays;

public class PlusOne{

    // Solution class with plusOne method
    static class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;

            // Start from the last digit and move left
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits; 
                }
                digits[i] = 0; 
            }

            // If all were 9s, we need a new array like [1, 0, 0, ...]
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }
    }

 
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1,1, 0};
        int[] output = sol.plusOne(input);

        System.out.println("Output: " + Arrays.toString(output));
    }
}
