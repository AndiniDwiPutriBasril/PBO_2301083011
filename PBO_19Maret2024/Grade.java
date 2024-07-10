


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_19Maret2024;

/**
 *
 * @author ACER
 */
public class Grade 
{
    public static void main(String[] args)
    {
        double grade = 92.0;
        
        if( grade >=90 ) {
            System.out.println( "Excellent! ");
        }
        else if (( grade < 90) && (grade>=80)){
        System.out.println("Good Job!" );
        }
        else if ((grade < 80) && (grade >=60)){
            System.out.println("Study Harder!");
        }
        else{
            System.out.println("Sorry, you failed");
        }
        
    }
    
}
