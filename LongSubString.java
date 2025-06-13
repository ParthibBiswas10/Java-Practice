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
            
            current=current+ch;
            maxlen=Math.max(maxlen, current.length());
           
        }
        System.out.println("Longest Substring: "+current);
        return maxlen;

    }
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=check(str);
        System.out.println("Length of Max Sub String: "+result);
        
    }
}
