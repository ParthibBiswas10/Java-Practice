class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B') count++;
        }
        int opt=k-count;
        min=Math.min(min,opt);

        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W') opt--;
            if(blocks.charAt(i)=='W') opt++;
            min=Math.min(min,opt);
        }
        return min;
    }
}