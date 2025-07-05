import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Enter score of " + (i + 1) + " Subject: ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        float avg = (float) total / n;
        System.out.print("The average Score is: " + avg);
        sc.close();
    }
}
