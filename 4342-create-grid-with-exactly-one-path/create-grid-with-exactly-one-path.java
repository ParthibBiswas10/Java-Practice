class Solution {
    public String[] createGrid(int m, int n) {
        String[][] arr= new String[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1) arr[i][j]=".";
                else arr[i][j]="#";
            }
        }
    String[] res= new String[m];
       
        StringBuilder sb=new StringBuilder();
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            res[i]=sb.toString();
            sb.setLength(0);
        }
    return res;
    }
}