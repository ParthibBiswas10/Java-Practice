class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        int[] last=new int[26]; 
        boolean [] taken=new boolean[26];
        StringBuilder result=new StringBuilder();

        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            last[ch-'a']=i;
        }

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(taken[idx]) continue;
            while(result.length()>0 && ch<result.charAt(result.length()-1)&& last[result.charAt(result.length()-1)-'a']>i){
                taken[result.charAt(result.length() - 1) - 'a']=false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(ch);
            taken[idx]=true;
            
        }
       return result.toString();
    
    }
}