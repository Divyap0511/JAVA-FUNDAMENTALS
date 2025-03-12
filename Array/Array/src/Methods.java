import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
         //Three methods are Arrays.sort() ,  Arrays.equals() , Arrays.copyOf()
        // import java.util.Arrays for this

        Arrays.sort(array); // default order is ascending

        int c[] =Arrays.copyOf(array,size);
        for (int i = 0; i < size; i++) {
            System.out.print(c[i] + " ");
        }
        int ant []= new int[size];
        for (int i = 0; i < size; i++) {
            ant[i] = sc.nextInt();
        }

        boolean b = Arrays.equals(c,ant);
        System.out.print(b);




    }
}


