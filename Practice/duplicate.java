import java.util.Scanner;

class duplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter array elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int newLength = removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + newLength);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
