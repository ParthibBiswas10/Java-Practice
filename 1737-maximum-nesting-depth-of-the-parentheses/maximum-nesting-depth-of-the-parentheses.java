class Solution {
    public int maxDepth(String s) {
        //Stack<Character>st=new Stack<>();
        int result=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') count++;
            else if(ch==')')
            count--;
            result=Math.max(count,result);
        }
        return result;
    }
}