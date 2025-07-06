import java.util.*;
class Cal{
    public int add(int a, int b) {return a+b;}
    public double add(double a, double b) {return a+b;}
    public String add(String s, int a, int b) {return s+" "+(a+b);}
}
public class PolyCalcy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cal obj=new Cal();
        System.out.println(obj.add(5,10));
        System.out.println(obj.add(5.21,6.17));
        System.out.println(obj.add("result: ",50,10));
    }
}
