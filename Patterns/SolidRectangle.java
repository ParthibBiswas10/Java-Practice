import java.util.*;
public class SolidRectangle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.printf("Enter NUmber of Rows: ");
        row=sc.nextInt();
        System.out.printf("Enter Number of Column : ");
        col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}