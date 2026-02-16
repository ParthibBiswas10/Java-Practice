class Solution {
    boolean check(int[] freq){
        int common=0;
        for(int f:freq){
            if(f==0)continue;
            if(common==0){
                common=f;
            }
            else if(common !=f){return false;}
        }
        return true;
    }
    
    public int longestBalanced(String s) {
        int n=s.length();
        int maxn=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(check(freq)){
                    maxn=Math.max(maxn,j-i+1);
                }
            }
        }
        return maxn;
    }
}