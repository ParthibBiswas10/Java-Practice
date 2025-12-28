/* We count : All odds up to high
All odds before low*/

class Solution {
    public int countOdds(int low, int high) {
       return ((high+1)/2)-low/2;
    }
}
