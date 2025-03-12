import java.util.Scanner;
public class Find_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       int array[] = new int[size];

        for (int i=0; i<size; i++) {
            array[i]= sc.nextInt();
        }
        int d = sc.nextInt();
        for(int i=0; i<size; i++){
            if(array[i] == d){
                System.out.println("number found at"+i);
            }
        }
    }
}