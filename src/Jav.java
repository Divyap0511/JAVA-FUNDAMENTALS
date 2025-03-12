
import java.util.*;
public class Jav {
    int z =10; //instance var
    protected int i = 10;
    static int d = 9;

    private int e = 0;
        protected void print(){ // to access protected methods in main class create a new object and call method.
            System.out.print("Hello");
}
    private void prin(){ // to access protected methods in main class create a new object and call method.
        System.out.print("fuck life");
    }
public static void main(String[] args){
  System.out.println("static variable  " +d); // we can access variables outside the main class by declaring the variable as static.

    Jav c = new Jav(); //acessing protected method & variables
    System.out.println("protected variable  "+c.i);
    c.print();

    Jav p = new Jav(); //acessing private method & variables
    System.out.println("privatesss variable  "+c.i);
    p.prin();
    }
}


