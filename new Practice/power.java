class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortDigits(n);
        
        // Compare with all powers of 2 up to 2^30
        for (int i = 0; i < 31; i++) {
            int power = 1 << i;
            if (target.equals(sortDigits(power))) {
                return true;
            }
        }
        return false;
    }
    
    // Helper method to sort digits of a number
    private String sortDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}
