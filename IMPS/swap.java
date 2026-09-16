import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

         System.out.println("Enter position1 to swap:");
        int a=sc.nextInt();
        System.out.println("Enter position2 to swap:");
        int b=sc.nextInt();
       
       int biti=(n>>a)&1;
       int bitj=(n>>b)&1;

       if(biti!=bitj){
        n=n^(1<<a);
        n=n^(1<<b);
       }
       System.out.println("Number after swapping bits: " + n);
        
    }
}



/**
 * 
 * 
 * 
 * num = 8
i = 0
j = 3

Binary:

8 = 00001000

Positions:

7 6 5 4 3 2 1 0
0 0 0 0 1 0 0 0
        ↑       ↑
        j       i

So:

bit i = 0
bit j = 1

We want:

bit i: 0 → 1
bit j: 1 → 0

Therefore:

Before:
00001000

After:
00000001

So the answer is:

1
 */