import java.util.Scanner;
public class Count_of_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arra[] = new int[size];
        int count = 0;
        for (int i = 0; i < arra.length-1; i++) {
            arra[i] = sc.nextInt();
            count++;
        }
        int f = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (f == arra[i]) {
                count++;
            }
        }
        System.out.println("count is "+count);
    }

}
