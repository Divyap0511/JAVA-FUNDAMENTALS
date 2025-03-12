import java.util.Scanner;
public class Factorial{
    public static int fac(int a){
       int product = 1;
       for(int i = a; i >= 1;i--){
           product = product * i;
       }
       return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result= fac(a) ;
        System.out.println(result);
    }
}