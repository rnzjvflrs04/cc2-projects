
package sdarray;
import java.util.ArrayList;
import java.util.Arrays;


public class Sdarray {

    
    public static void main(String[] args) {
      int num [] = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
      
       
      
      ArrayList<Integer> odd = new ArrayList<Integer>();
      ArrayList<Integer> even = new ArrayList <Integer> ();
      
      for (int i = 0; i <num.length; i++){
          if (num[i] %2 != 0) {
              odd.add (num[i]);
              
          }
      
          else if (num [i] % 2 == 0) {
              even.add  (num[i]);
          }
      }
      
        System.out.println(Arrays.toString(num));
          System.out.println("Odd\tEven");
          for(int x = 0; x < 5 ; x++){
          System.out.println(odd.get(x)+"\t"+even.get(x));
          
    
      
    }
          
}
       

      
    
    
}
