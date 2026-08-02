class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ca=str.toCharArray();
            Arrays.sort(ca);
            String ss=new String(ca);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            map.get(ss).add(str);
        }
        return new ArrayList<>(map.values());
    }
}