import java.util.*;
public class StrongNumber {
    public static int check(int n){
        int copy=n;
        while(copy>0){
            fact(copy%10);
            

        }

    }
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        n=sc.nextInt();
        check(n);


    }
}
