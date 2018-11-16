
package repetitive;

import java.util.*;


public class Repetitive {

  
    public static void main(String[] args) {
     Scanner j = new Scanner (System.in);
       Random r = new Random();
       int GuessedValue = r.nextInt(1000);
       int Tries =0;
       int Guess =0;
       int Success =0;
       
       
       while (Success ==0){
            System.out.println("Enter a number from 1 - 1000.");
            Guess = j.nextInt();
            Tries++;
       
            if (GuessedValue %2 == 0){
                System.out.println("You're guessing for an even number");
            }
            else{
                System.out.println("You're guessing for an odd nuber");
            }
            if (Guess <1 || Guess >1000){
                System.out.println("You can only enter numbers from 1 to 100");
            }
            else if (Guess== GuessedValue){
                Success ++;
                
                System.out.println("Congratulations! You're right!");
            }
            else if (Guess> GuessedValue){
                System.out.println("You're guess is higher than the value");
            }
            else if (Guess<GuessedValue){
                System.out.println("You're guess is lower than the value");
            }
          
       }
        
        
            
            
            
        
    
    
     
      
    }
    
}
