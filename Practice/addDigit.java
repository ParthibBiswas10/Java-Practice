import java.util.Scanner;

public class addDigit {
    
    public int addDigits(int num) {
        int res = 0;
        int temp = num;
        while(temp >= 10) {  
            res = 0;  
            while(temp > 0) {
                res = res + (temp % 10);
                temp = temp / 10;
            }
            temp = res;
        }
        return temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        addDigit solution = new addDigit();
        int result = solution.addDigits(num);
        
        System.out.println("Sum of digits until single digit: " + result);
    }
}

