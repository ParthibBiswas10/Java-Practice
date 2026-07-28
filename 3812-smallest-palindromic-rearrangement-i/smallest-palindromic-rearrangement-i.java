class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] first=s.substring(0,mid).toCharArray();
        Arrays.sort(first);
        String firsthalf=new String(first);
       String secondhalf=new StringBuilder(firsthalf).reverse().toString();
       if(n%2!=0)
        return firsthalf+s.charAt(mid)+secondhalf;
        return firsthalf+secondhalf;
    }
}