class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res=new int[n];
        if(k==0) return res;
        int i=-1,j=-1;
         if(k>0){
            i=1;
            j=k;
        }
          if(k<0){
            i=n-Math.abs(k);
            j=n-1;
        }
        int window=0;
        for(int p=i;p<=j;p++){
            window+=code[p];
        }
        
        for(int a=0;a<n;a++){
            res[a]=window;
            window-=code[i];
            i=(i+1)%n;

            j=(j+1)%n;
            window+=code[j];
        }

        return res;
    }
}