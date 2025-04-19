import java.util.*;
public class StrongNumber {
    public static int fact(int num){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }

    public static int check(int n){
        int copy=n;
        int sum=0;
        while(copy>0){
            sum=fact(copy%10)+sum;
            copy=copy/10;

        }
        return sum;

    }
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        n=sc.nextInt();
        if(n==check(n)){
            System.out.println("Strong Number");
        }
        else
            System.out.println("Not Strong number");


    }
}
