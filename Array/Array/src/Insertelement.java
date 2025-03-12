import java.util.Scanner;
public class Insertelement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int array[] = new int[size+1];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            int loc = sc.nextInt();
            int ele = sc.nextInt();

            for (int i = size; i > loc; i--) {
                array[i]= array[i - 1];
            }
            array[loc]= ele;
            size++;
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]+" ");
             }
            }
}
