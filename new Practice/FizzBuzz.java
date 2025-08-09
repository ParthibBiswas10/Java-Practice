import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }
}
/*
 approach 2:

    class Solution {
    public List<String> fizzBuzz(int n) {
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            int numnew=i+1;
            arr[i]=String.valueOf(numnew);
        }
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(arr[i]);
            if(num%3==0 && num%5==0)  arr[i]="FizzBuzz";
            else{
            if(num%3==0) arr[i]="Fizz";
            else if(num%5==0) arr[i]="Buzz";
            }
        }
    return Arrays.asList(arr);
    }
}
 */