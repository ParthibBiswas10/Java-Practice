import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        
        for (String f : folder) {
            // If result is empty or current folder is not a subfolder of the last one in result
            if (result.isEmpty() || !f.startsWith(result.get(result.size() - 1) + "/")) {
                result.add(f);
            }
        }
        
        return result;
    }
}
