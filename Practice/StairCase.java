import java.util.Scanner;

public class StairCase {
     public static int climbStairs(int n) {
        int current=0;
        if(n==1) return 1;
        else if(n==2) return 2;
        else{
            int a=1;
            int b=2;
            
            for(int i=3;i<=n;i++){
                current=a+b;
                a=b; //it stores to reach previous previous step
                b=current; //it stores to reach prev step
            }

        }
        return current;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Peak Value: ");
        n = sc.nextInt();
        
        int result = climbStairs(n);
        System.out.println("total Ways: " + result);
    }
}

