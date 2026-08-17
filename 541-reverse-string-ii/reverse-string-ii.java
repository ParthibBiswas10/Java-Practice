class Solution {
    public void rev(char[] arr,int i, int j){
        while(i<j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    
    }
    public String reverseStr(String s, int k) {
        int i=0;
        char[] arr=s.toCharArray();
       int j=0;
        while(i<s.length()){
         j = Math.min(i + k - 1, arr.length - 1);
          
                rev(arr,i,j);
                i=i+2*k;
            
        }
        return new String(arr);
    }
}