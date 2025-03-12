//given an array of size n find minimum +ve integer x such that x%arr[i] is same for all elements(!=0).
import java.util.Scanner;
public class Minimize {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g[]= new int[n];
        int x=1;

        for(int i=0;i<n;i++){
            g[i]= sc.nextInt();
        }
        int rem = x%g[0];
        boolean flag = true;

        for(int i=0;i<n;i++){
            if(rem != x%g[i]){
                flag = false;
                break;
            }
        }
      if(flag == true){
      System.out.print(x);
    }

    }
}
