class Solution {
    public int maxVowels(String s, int m) {
        int count=0;
        int max=0;
        for (int i = 0; i < m; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
       max = count;
    for (int i = m; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                count++;
            }
            if ("aeiouAEIOU".indexOf(s.charAt(i - m)) != -1) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}