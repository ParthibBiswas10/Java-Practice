class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char og=s.charAt(i);
            char cp=t.charAt(i);
            if(!map.containsKey(og)){
                if(!map.containsValue(cp))
                map.put(og,cp);
                else return false;
            }
            else{
                char check=map.get(og);
                if(check!=cp) return false;
            }
        }
        return true;
    }
}