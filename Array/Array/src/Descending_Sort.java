import java.util.Scanner;

public class Descending_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int temp;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
        for (int j = i+1; j < size; j++) {
            if (array[i] < array[j]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        }
            for(int i=0;i<size;i++){
                System.out.print(array[i]+" ");
            }
    }
}
