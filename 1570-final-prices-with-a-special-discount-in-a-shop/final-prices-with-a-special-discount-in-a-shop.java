class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        int j=0;
        /*for(int k:prices){
            ans[j]=k;
            j++;
        }*/
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = prices[i] - prices[st.peek()];
            } else {
                ans[i] = prices[i];
            }
            st.push(i);
        }
        return ans;
    }
}