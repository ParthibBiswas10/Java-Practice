class Solution {
    public int numSpecial(int[][] mat) {
       int r=mat.length;
       int c=mat[0].length;
       int count=0;
       int scount=0;
       int[] ra=new int[r];
       int[] ca=new int[c];
        for(int i=0;i<r;i++){
            count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1) count++;
            }
            ra[i]=count;
        }

        for(int i=0;i<c;i++){
            count=0;
            for(int j=0;j<r;j++){
                if(mat[j][i]==1) count++;
            }
            ca[i]=count;
        }

       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(mat[i][j]==1 && ra[i]==1 && ca[j]==1){
                scount++;
            }
        }
       } 
         return scount;
    }
  
}