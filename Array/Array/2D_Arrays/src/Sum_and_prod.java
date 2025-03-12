import java.util.Scanner;

public class Sum_and_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sine = sc.nextInt();
        int number[][] = new int[size][sine];
        int numbers[][] = new int[size][sine];
        int sum[][] = new int[size][sine];
        int prod[][] = new int[size][sine];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                sum[i][j] = number[i][j] + numbers[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sine; j++) {
                prod[i][j] = number[i][j] * numbers[i][j];
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }


    }
}