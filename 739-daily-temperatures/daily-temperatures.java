class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[n - 1] = 0;
        stack.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            int a = t[stack.peek()];
            while (t[i] >= a) {
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                a = t[stack.peek()];
            }
            if (t[i]<a) {
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}