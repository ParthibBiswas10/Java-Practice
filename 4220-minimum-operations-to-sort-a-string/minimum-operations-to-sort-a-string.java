class Solution {
    public int minOperations(String s) {
        int n=s.length();
   boolean sorted=true;
        char[]arr=new char[n];
        arr=s.toCharArray();
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
            }
        }
        if(sorted) return 0;
        if(n<=2) return -1;
     

        

        char highest=arr[0];
        char lowest=arr[0];
        for(int i=0;i<n;i++){
        highest=(char)Math.max(arr[i],highest);
        lowest=(char)Math.min(arr[i],lowest);
        }

        if(arr[0]==lowest || arr[n-1]==highest) return 1;

        char midhighest=arr[1];
        char midlowest=arr[1];
        for(int i=2;i<n-1;i++){
            midhighest=(char)Math.max(arr[i],midhighest);
            midlowest=(char)Math.min(arr[i],midlowest);
        }

    if (arr[0] > midhighest && arr[n-1] < midlowest) return 3;
    return 2;
    }
}