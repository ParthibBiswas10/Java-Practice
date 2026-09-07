class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] tokens=path.split("/");
        for(String token:tokens){
            if(token.equals(".") || token.equals(""))continue;
            else{
                if(!token.equals("..")){
                stack.push(token);
                }
                 else if(!stack.isEmpty() && token.equals("..")) stack.pop();
            }
        }
         String res="";
        while(!stack.isEmpty()){
        res="/"+stack.pop()+res;
        }
        if(res.length()==0) return "/";
        else return res;
    }
}