import java.util.Stack;
class Solution {
    Stack<Character> stack=new Stack<>();
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || s.length()==1) return false;
                char top=stack.pop();
                if((c==')' && top!='(')||
                (c=='}'&& top!='{')||
                (c==']'&& top!='[')
                ) return false;
            }
        }
        return stack.isEmpty();
    }
} 