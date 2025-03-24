import java.util.Scanner;

public class replace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String txt=sc.nextLine();
        String newStr =txt.replace(" ","_");
        System.out.print(newStr);
        sc.close();

    }
}
