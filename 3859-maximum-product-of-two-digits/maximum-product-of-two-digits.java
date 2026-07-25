class Solution {
    public int maxProduct(int n) {
        int count=0;
        int temp=n;
      
        while(temp>0){
            temp=temp/10;
            count++;
        }
      Integer [] arr=new Integer[count];
      temp=n;
        for(int i=0;i<count;i++){
            arr[i]=temp%10;
             temp=temp/10;
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int max=arr[0]*arr[1];
        return max;
    }
}