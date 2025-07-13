import java.util.Scanner;

public class SingleNum {
     public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;  // Use ^ instead of xor
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter Array size:");
        int n=0;
       
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         int[] nums=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res= singleNumber(nums);
        System.out.println("Non repeating Number:  "+ res);
    }
}
