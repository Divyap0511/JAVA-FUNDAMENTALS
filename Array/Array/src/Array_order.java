import java.util.Arrays;
import java.util.Scanner;

public class Array_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int b[] = new int[size];
        int d[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        boolean isAscending = false;
        boolean isDescending = false;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] < array[i + 1]) {
                isAscending = true;
                b[i] = array[i];
            }
            if (array[i] > array[i + 1]) {
                isDescending = true;
                d[i]= array[i];
            }
        }
        for(int i =0; i<size;i++) {
            if (isAscending == true) {
                System.out.print("array is in asscending order");
            } else if (isDescending == true) {
                System.out.print("array is in descending order");
            } else {
                System.out.print("Array is unordered.");
            }
        }

    }
}
