class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr= new char[m][n];
        String[] res= new String[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1) arr[i][j]='.';
                else arr[i][j]='#';
            }
            res[i]=new String(arr[i]);
        }
    
       
       /*StringBuilder sb=new StringBuilder();
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            res[i]=sb.toString();
            sb.setLength(0);
        }*/
    return res;
    }
}