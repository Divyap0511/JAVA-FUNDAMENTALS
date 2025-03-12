public class Primefactors{
    public static void main(String []args){
        int n = 100;
        int op =0;
        while(n%2==0){
            n=n/2;
            op++;
        }
        int p =3;
        while(p*p <= n){
        while(n%p==0) {
            n = n / p;
            op++;
        }
            p+=2;
        }
        if(n>1){
         op++;
        }
        System.out.println(op);

    }
}

/* . Prime Factors Operations
Take n integer such that and perform the operation p should be divisible by n and be a prime number.
Find the max no. of operations that can be performed.
Input: n
Output: no. of operations
 */
 */
 */
 */
 */

