import java.util.*;
public class lowercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String txt=sc.nextLine();
        String lowernew =txt.toLowerCase();
        System.out.print(lowernew);
        sc.close();

    }
}
