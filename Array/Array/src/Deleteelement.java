import java.util.Scanner;
public class Deleteelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int loc = sc.nextInt();

        for (int i = loc; i < size-1; i++) {
            array[i]= array[i + 1];
        }
        size--;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
