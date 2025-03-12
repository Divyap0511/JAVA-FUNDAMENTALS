import java.util.Scanner;
public class Transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sine = sc.nextInt();
        int number[][] = new int[size][sine];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                System.out.print(number[j][i]+" ");
            }
            System.out.println();
        }
    }
}
