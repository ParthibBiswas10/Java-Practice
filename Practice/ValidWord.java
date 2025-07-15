class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
         boolean hasVowel=false;
        boolean hasCon=false;
        for(char c: word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                if(isVowel(c)) hasVowel=true;
                else hasCon=true;
            }
        }
        return hasVowel && hasCon;
       
    }
    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}