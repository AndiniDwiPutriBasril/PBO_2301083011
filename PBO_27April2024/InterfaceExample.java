 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_27April2024;

/**
 *
 * @author ACER
 */
public class InterfaceExample {
    public static void main(String[]args){
      Relation myInteger = (Relation) new MyInteger();
      System.out.println(myInteger.isGreater(5,  4));
      Relation myDouble = (Relation) new MyDouble();
      System.out.println(myDouble.isGreater(5.6, 7.3));
      
      Line line1 = new Line(1, 5, 2, 4);
      Line line2 = new Line(2, 4, 1, 3);
      
      Relation Line = (Relation) new Line();
      System.out.println(Line.isGreater(line1, line2));
      System.out.println("Line 1     "+line1.getLength());
      System.out.println("Line 2     "+line2.getLength());
    }   
}

