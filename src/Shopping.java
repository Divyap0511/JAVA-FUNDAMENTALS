import java.util.*;
class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int ch;
        do {
            System.out.println("1.Tea \n 2.Coffee \n 3.Cold drink \n 4.Croissant \n 5.Exit");
            ch = sc.nextInt();
         for(int i=0;i<=0) {
             switch (ch) {
                 case 1:
                     int a1 = 10;
                     count = count + a1;
                     System.out.println("Total amount :" + count);
                     break;

                 case 2:
                     int a2 = 70;
                     count = count + a2;
                     System.out.println("Total amount :" + count);
                     break;

                 case 3:
                     int a3 = 110;
                     count = count + a3;
                     System.out.println("Total amount :" + count);
                     break;

                 case 4:
                     int a4 = 120;
                     count = count + a4;
                     System.out.println("Total amount :" + count);
                     break;

                 case 5:
                     int a5 = 130;
                     count = count + a5;
                     System.out.println("Total amount :" + count);
                     break;
                 default:
                     System.out.println("Invalid input!!!");
                     break;
             }
         }

        }
        while(ch!=0);


    }
}
