import java.util.Scanner;

public class Dell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int m = sc.nextInt();
        int s =0;
        int su =0;
        for(int i =0;i<=m;i++){
                if(i%size==0){
                    s= s+i;
                }

                else {
                    su = su + i;
                }
            }
        int diff = su-s;
        System.out.println(diff);
            }

        }


