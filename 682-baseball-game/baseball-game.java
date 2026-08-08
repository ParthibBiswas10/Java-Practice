class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int last=stack.pop();
                int sl=stack.pop();
                stack.push(sl);
                stack.push(last);
                stack.push(last+sl);
            }
            else if(op[i].equals("D")){
                int last=stack.pop();
                stack.push(last);
                stack.push(last*2);
            }
            else if(op[i].equals("C")){
                stack.pop();
            }
            else stack.push(Integer.parseInt(op[i]));
        }
        int sum=0;
        for (int num : stack) {
            
            sum+=num;
        }
        return sum;
    }
}