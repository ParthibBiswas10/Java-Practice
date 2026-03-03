class Solution {
    public char findKthBit(int n, int k) {
         if(n==1) return '0';
         int len=(int)Math.pow(2,n)-1;
        int mid=(len/2)+1;
         if(k<mid){
            return findKthBit(n-1,k);
         } 
        else if(k==mid) return '1';
        else {
            char value=findKthBit(n-1,len-(k-1));
            if(value=='0') return '1';
            else return '0';
         }
    }
}