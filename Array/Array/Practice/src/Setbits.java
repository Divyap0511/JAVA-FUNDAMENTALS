import java.util.Scanner;
import java.lang.Integer;
public class Setbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (Integer.bitCount(i) == k) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
