/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

import java.util.*;

public class Main {

    
    public static void main(String[] args) {
  

    Scanner input = new Scanner(System.in);
    StringBuilder output = new StringBuilder();


    System.out.println("Enter the number of rows & columns: ");

    System.out.print("Enter the number of rows: ");
    int row = input.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();

    int [][]nums = new int[row][columns];

    for (int i = 0; i < row; i++)
         
                
    {System.out.println ("Row" +i);
    
    {for (int j = 0; j < columns; j++)
          
           
        {
            
            System.out.print("Column" + (j + 1) + ": ");
            nums[i][j] = input.nextInt();
            output.append("\n").append(nums[i][j]);
        }
        System.out.println( " " );

    }

    System.out.println(output);

   }
  }

