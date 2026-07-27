class Solution {
    public int longestPalindrome(String s) {
        int oddfreq=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch: s.toCharArray()){
            int count=map.getOrDefault(ch,0)+1;
            map.put(ch,count);
            if(count%2!=0) oddfreq++;
            else oddfreq--;
        }
        if(oddfreq>0)
        return n-oddfreq+1;
        else return n;
    }
}