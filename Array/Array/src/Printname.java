import java.util.Scanner;
public class Printname{
    public static String name(String g){
        return g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
         name(g) ;
        System.out.print(g);
    }
}