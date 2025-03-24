import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String Str=sc.nextLine();
        //int SpaceCount=count(Str," ");
        int DoubleSpaceCount=count(Str,"  ");
        int TripleSpaceCount=count(Str,"   ");
        //System.out.println("Number of Single Space: "+SpaceCount);
        System.out.println("Number of Double Space: "+DoubleSpaceCount);
        System.out.println("Number of Triple Space: "+TripleSpaceCount);
        sc.close();
    }
   public static int count(String str,String subStr){
        int Count=0;
        int index=0;
        while((index= str.indexOf(subStr,index))!=-1){
            Count++;
            //System.out.println(Count);
            index+=subStr.length();

        }
        return Count;

   }
}
