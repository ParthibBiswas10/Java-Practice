import java.util.Scanner;
import java.util.Arrays;
public class anargram {
    public static isAna(String s1, String s2){
        s1=s1.replace(" ","").toLowerCase();
        s2=s2.replace(" ", "").toLowerCase();
        if (s1.length() != s2.length()) return false;
        char[] arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        String s1,s2;
        System.out.println("Enter String 1: ");
        s1=sc.nextLine();
        System.out.println("Enter String 2: ");
        s2=sc.nextLine();
        if(isAna(s1,s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
