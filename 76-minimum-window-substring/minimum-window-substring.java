class Solution {
    public String minWindow(String s, String t) {
        int[] maps=new int[128];
        int[] mapt=new int[128];
        for(char ch:t.toCharArray()) mapt[ch]++;
        int left=0;
        int minlen=Integer.MAX_VALUE,minstart=0;
        for(int right=0;right<s.length();right++){
            maps[s.charAt(right)]++;
            while(contains(maps,mapt)){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    minstart=left;
                }
                maps[s.charAt(left)]--;
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(minstart,minstart+minlen);
    }
        boolean contains(int[] maps, int[]mapt){
            for(int i=0;i<128;i++){
                if(mapt[i]>maps[i]) return false;
               
            }
             return true;
        }
    
}