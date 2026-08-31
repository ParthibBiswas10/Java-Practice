class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();

        int[]s1f=new int[26];
        int[]s2f=new int[26];

        for(int i=0;i<a;i++){
            s1f[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        
        while(j<b){
            s2f[s2.charAt(j)-'a']++;

            if(j-i+1>a){
                s2f[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(s1f,s2f)){
                return true;
            }
            j++;

        }

    return false;
    }
}