class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seenOne = false;
        boolean seenZeroAfterOne = false;

        for(char c : s.toCharArray()){
            if(c == '1'){
                if(seenZeroAfterOne) return false;
                seenOne = true;
            }
            else{ 
                if(seenOne) seenZeroAfterOne = true;
            }
        }
        return true;
    }
}