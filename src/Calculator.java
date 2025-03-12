import java.util.*;
    public class Calculator {
        public static void main(String args[] )
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1st no");
            int a = sc.nextInt();
            System.out.println("enter 2snd no");
            int b = sc.nextInt();
            System.out.println("enter your choice: \n1.Add\n 2.Sub\n 3.Mul\n 4.Div\n 5.Mod\n 6.Exit");
            int ch = sc.nextInt();
            int add = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            int mod = a % b;
            switch(ch) {
                case 1:System.out.println("Addition is" +add);
                    break;
                case 2:System.out.println("Subraction is" +sub);
                    break;
                case 3:System.out.println("Multiplication is" +mul);
                    break;
                case 4:System.out.println("Division is" +div);
                    break;
                case 5:System.out.println("remaindar is" +mod);
                    break; default:
                    System.out.println("invalid input");
            }
        }
    }

