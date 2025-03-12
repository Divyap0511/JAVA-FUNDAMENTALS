import java.util.Scanner;
public class Uniquenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] N = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            N[i] = sc.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (N[i] == N[j]) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println("The first unique number from the right is: " + N[i]);
                return;
            }
        }
        System.out.println("No unique number found.");
    }
}
