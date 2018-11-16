
package course;
import java.io.*;
import java.util.Scanner;
        
public class Course {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println(" What is your Course?");
        String degree = sc.nextLine();
     if (degree.equals("BSIT")){
        System.out.println("What is you major? ");
        String major = sc.nextLine();
        if(major.equals("Web Development")){
            System.out.println("BSIT major in Web Developement");
        }
        else if(major.equals("Network Security")){
            System.out.println("BSIT major in Network Security");
        }
        else if(major.equals("ERP")){
            System.out.println("BSIT major in Enterprises Resource Planning");
        }
            
     }
      
     else if( degree.equals ("BSCS")){
       System.out.println("What is your major?");
       String major = sc.nextLine();
        if(major.equals ("Mobile Development")){
        System.out.println("BSCS major in mobile development");
        }
     else if (major.equals ("Digital arts and Animation")){
         System.out.println("BSCS major in Digital arts and Animation");
        }
     }
     else if(degree.equals("BSDA")){
         System.out.println("Course is Bachelor of Science major in Data Analytics");
     }
     else{
         System.exit(0);
     }
        
     
     
     
     

    }
}