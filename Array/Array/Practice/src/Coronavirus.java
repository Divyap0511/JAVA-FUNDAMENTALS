import java.util.Scanner;
public class Coronavirus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of elements
        int n = sc.nextInt();
        // Create and fill the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number of positions to shift
        int k = sc.nextInt();

        // Process each element with a right shift and print
        for (int i = 0; i < n; i++) {
            System.out.print( (arr[i] >> k)+ " ");
        }
    }
}
