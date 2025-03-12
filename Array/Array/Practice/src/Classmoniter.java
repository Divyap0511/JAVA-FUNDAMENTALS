import java.util.Scanner;
public class Classmoniter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ranks = new int[N];
        for (int i = 0; i < N; i++) {
            ranks[i] = sc.nextInt();
        }
        int cutCount = 0;
        for (int i = 0; i < N-1; i++) {
            if (ranks[i+1] < ranks[i]) {
                cutCount++;
            }
        }
        System.out.println(cutCount);
    }
}
