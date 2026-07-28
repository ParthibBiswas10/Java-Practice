class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = n / 2;
        char[] chars = s.toCharArray();
        Arrays.sort(chars, 0, mid); 
        for (int i = 0; i < mid; i++) {
            chars[n - 1 - i] = chars[i];
        }
        return new String(chars);
    }
}


/*
    my solution: 
        class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = n / 2;

        // Take the first half
        char[] first = s.substring(0, mid).toCharArray();

        // Sort it
        Arrays.sort(first);

        // Build the first half
        String firstHalf = new String(first);

        // Reverse it to get the second half
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        // Handle the middle character (only for odd length)
        if (n % 2 == 1) {
            return firstHalf + s.charAt(mid) + secondHalf;
        }

        return firstHalf + secondHalf;
    }
}



 */