import java.util.Scanner;
public class Prac {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i< arr.length;i++) {
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i]< min){
            min = arr[i];
        }
        }
        System.out.println("min is"+min+"max is"+max);
    }
}
