import java.util.Scanner;
public class Momentum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int s = 0;
        for (int i = 0; i < P; i++) {
            int m = sc.nextInt();
            int v = sc.nextInt();
            s = s + (m * v);
        }
        System.out.println(s);
    }

}