class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            
            for(int j=i;j<i+k;j++){
            int a=Math.abs(x-arr[j]);
            sum+=a;
            }
        
        if(sum<min){
        min=sum;
        start=i;
        }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=start;i<start+k;i++){
            ans.add(arr[i]);
        }
        return ans;
    
    }
}