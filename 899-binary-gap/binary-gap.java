class Solution {
    public int binaryGap(int n) {
        int max=0;
        int prev=0;
        int curr=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                prev=curr;
                curr=i;
                max=Math.max(max,curr-prev);
                
            }
        }
        return max;
    }
}