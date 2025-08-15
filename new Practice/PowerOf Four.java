class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {   // keep dividing by 4
            n /= 4;
        }
        return n == 1;
    }
}