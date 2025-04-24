import java.util.Scanner;

public class LongSubString {
    public static int check(String s){
        String current="";
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(current.contains(String.valueOf(ch))){
                int index=current.indexOf(ch);
                current=current.substring(index+1);


            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=check(str);

    }
}
