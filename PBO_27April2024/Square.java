/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_27April2024;

/**
 *
 * @author ACER
 */
public class Square extends Shape{
    private static double phi = 3.14;
    private int sisi;
    
    public Square() {
        sisi=0;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi=sisi;
    }
    
    public String getName() {
        return "Square";
    }
    
    public float getArea() {
        return sisi*sisi;
    }
    public static void main(String[] args) {
        Square square = new Square();
        square.setSisi(4);
        System.out.println("Nama    :"+square.getName());
        System.out.println("Luas    :"+square.getArea());
    }
}