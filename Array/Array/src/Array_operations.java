import java.util.Scanner;
public class Array_operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{
            int size = sc.nextInt();
            int prod=1;
            double avg = 0;
            int sum = 0;
            int arr[]= new int[size];

            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                prod = prod*arr[i];
            }
            for(int i=0;i<size;i++){
                sum = sum+arr[i];
            }

            avg = sum/size;

            System.out.println("sum:"+sum);
            System.out.println("avg:"+avg);
            System.out.println("prod:"+prod);
        }
    }
}
