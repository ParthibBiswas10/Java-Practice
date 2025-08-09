import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort greed factors
        Arrays.sort(s); // sort cookie sizes
        
        int i = 0; // child pointer
        int j = 0; // cookie pointer
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // cookie can satisfy the child
                i++; // next child
            }
            j++; // move to next cookie
        }
        
        return i; // number of content children
    }
}
