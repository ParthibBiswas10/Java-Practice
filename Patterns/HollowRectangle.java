import java.util.*;
class HollowRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter Row and Column:");
        row=sc.nextInt();
        col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}