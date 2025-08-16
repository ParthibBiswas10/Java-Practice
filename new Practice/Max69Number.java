class Solution {
    public int maximum69Number (int num) {
        // Convert number to string
        String s = String.valueOf(num);
        
        // Convert to char array for modification
        char[] arr = s.toCharArray();
        
        // Change the first '6' to '9' and break
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break; // only one change allowed
            }
        }
        
        // Convert back to integer
        return Integer.parseInt(new String(arr));
    }
}
