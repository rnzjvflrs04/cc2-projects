/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multid;

public class Multid {

   
    public static void main(String[] args) {
       String [][]names ={{"Teofilo", "Ana"},
                         {"Adrian","Aldwin"} ,
                         {"Fred", "John"},
                         {"Emil", "David"}};
        int i;
       
       for (i=0; i< names.length ; i++)
       {
           System.out.println("Row"+i);
           int j;
           for (j=0; j< names[i].length ; j++)
           {
               System.out.println(names[i][j]);
           
             
           }
       }   
       
    
    }
    
}
