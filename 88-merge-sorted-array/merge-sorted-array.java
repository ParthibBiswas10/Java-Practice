class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lenA=m;
        int lenB=n;
        int l=0;
        int j=0;
        int[] arr=new int[lenA+lenB];
        int k=Math.min(lenA,lenB);
        int i;
        for(i=0;l < lenA && j < lenB;i++){
            if(nums1[l]<=nums2[j]){
                arr[i]=nums1[l];
                l++;
            }
            else if(nums1[l]>nums2[j]){
                arr[i]=nums2[j];
                j++;
            }
        }
        if(l>=lenA){
            while(j<lenB){
                arr[i++]=nums2[j++];
            }
        }
        else if(j>=lenB){
            while(l<lenA) arr[i++]=nums1[l++];
        }
        //return arr;
        for(int x = 0; x < arr.length; x++) {
    nums1[x] = arr[x];
}
    }
}