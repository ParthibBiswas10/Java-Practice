class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && num.charAt(i)-'0'<st.peek()){
                st.pop();
                k--;
            }
            st.push(num.charAt(i)-'0');
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
        sb.append(st.pop());
        }

        sb.reverse();
        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0') i++;

        String ans= sb.substring(i);
        return ans.isEmpty()?"0":ans;
    }
}