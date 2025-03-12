import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int no = in.nextInt();
        int copy = no;
        while (no > 0) {
            int digit = copy % 10;
            int copy = copy / 10;
            int cube = (digit * digit * digit);
            int sum = sum + cube;
            if (sum == no) {
                System.out.println("armstrong");
            } else {
                System.out.println("not");
            }
        }
    }
}
        /*if(no == 1){
            System.out.println("Enter marks");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int m =(a+b+c+d+e)/100;
            if(m>90){
                System.out.println("this is good");
            }
            else{
                if(89<=m && m>=60){
                    System.out.println("this is also good");
                }
            else{
                System.out.println("this is good as well");
                }
            }
        }
        if(no == 0){
            System.out.println("Exit");
        }

    }*/


