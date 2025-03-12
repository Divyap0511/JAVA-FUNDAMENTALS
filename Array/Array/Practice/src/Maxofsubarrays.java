import java.util.Scanner;

public class Maxofsubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxOfMins = Integer.MIN_VALUE;
        for (int i = 0; i < n-k; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = i; j < i + k; j++) {
                minVal = Math.min(minVal, arr[j]);
            }
            maxOfMins = Math.max(maxOfMins, minVal);
        }
        System.out.println("Maximum of minimum values: " + maxOfMins);
    }
}
