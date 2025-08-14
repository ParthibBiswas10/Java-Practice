class Solution {
    public String largestGoodInteger(String num) {
        for (char d = '9'; d >= '0'; d--) {
            String target = "" + d + d + d; 
            if (num.contains(target)) {
                return target;  
            }
        }
        return "";
    }
}