import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int res = 0;
        int temp = n;
        
        while(temp != 1 && !seen.contains(temp)) {
            seen.add(temp);
            res = 0;
            while(temp > 0) {
                int rem = temp % 10;
                res = res + (int) Math.pow(rem, 2);
                temp = temp / 10;
            }
            temp = res;
        }
        return temp == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        Solution solution = new Solution();
        boolean result = solution.isHappy(n);
        
        System.out.println(n + " is " + (result ? "happy" : "not happy"));
    }
}
/*Happy Number in C:
 bool isHappy(int n) {
    int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    while (n != 1 && n != 4) {
        n = getNext(n);
    }

    return n == 1;
}

 */