import java.util.Scanner;
public class Middlenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            int middleIndex = n / 2;
            int middleIndex1 = (n / 2) - 1;
            System.out.println(arr[middleIndex]+","+arr[middleIndex1]);
        } else {
            int middleIndex2 = n / 2;
            System.out.println(arr[middleIndex2]);
        }
    }
}
