class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] w=new char[3];
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<=n-3;i++){
            map.clear();
            w[0]=s.charAt(i);
            map.put(w[0],map.getOrDefault(w[0],0)+1);
            w[1]=s.charAt(i+1);
            map.put(w[1],map.getOrDefault(w[1],0)+1);
            w[2]=s.charAt(i+2);
            map.put(w[2],map.getOrDefault(w[2],0)+1);
        boolean good=true;
            for(int value:map.values()){
                if(value>1){
                    good=false;
                    break;
                }
            }
            if(good)count++;
           
        }
         return count;
    }
}