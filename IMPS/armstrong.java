import java.util.*;

public class armstrong{
    public static void main(String args[]){
        System.out.println("Armstrong numbers between 1 and 1000 are:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=r*r*r;
            temp/=10;
        }
        if(sum==n){
            System.out.println(n+" is an Armstrong number.");
        }

    }
}