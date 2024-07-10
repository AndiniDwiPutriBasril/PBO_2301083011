/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_14Mei2024;

/**
 *
 * @author ACER
 */
public class ThrowDemo {

    public static void main(String[] args) {
        String input = "Invalid Output";
        try {
            if (input.equals("Invalid Output")) {
                throw new RuntimeException("invalid dari throw");
            } else {
                System.out.println(input);
            }
           } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
           }
    }
}

   
