
package fibonacci;
import java.util.*;

public class Fibonacci {
    public static int N;
   
    public static void main(String[] args) {
        user();
        display();
    }
    public static void user(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number :");
        N = sc.nextInt();
    }
    
    static int fibo (int nn){
        if (nn == 0 ){
            return 0;
        } else if (nn == 1){
            return 1;
        } else {
            return fibo (nn-1)+ fibo (nn-2);
        }
    }
    public static void display(){
        for (int i = 0; i <= N; i++) {
            System.out.print ("f(" + i +")\t");
        }
    for ( int i = 0 ; i <= N; i++){
        System.out.println("");
        for ( int j = 0; j<= i; j++){
            System.out.print("" + fibo(j)+ "\t");
        } 
    }
    
    System.out.println("");
    }
}
