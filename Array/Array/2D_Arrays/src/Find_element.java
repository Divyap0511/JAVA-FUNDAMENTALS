import java.util.Scanner;
public class Find_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sine = sc.nextInt();
        int number[][] = new int[size][sine];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                number[i][j] = sc.nextInt();
            }}

        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                if (number[i][j] == x) {
                    System.out.println("Element found at [" + i + "," + j + "]");
                    found = true;
                }}}
        if (!found) {
            System.out.println("Element not found in the array.");
        }

    }
}
