import java.util.*;
public class Nr{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        boolean isRepeat=false;
        for(int i=0;i<str.length();i++){
            isRepeat=false;
            if(str.charAt(i)!=' '){
            for(int j=0;j<str.length();j++){
                if(i !=j && str.charAt(i)==str.charAt(j) ){
                    isRepeat=true;
                    break;
                }
            }
            if(!isRepeat){
                System.out.println("1st non Repeating Character: "+str.charAt(i));
                break;
            }
         }
        
        sc.close();
    }
}
}