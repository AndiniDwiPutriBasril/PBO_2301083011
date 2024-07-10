/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_23April2024;

/**
 *
 * @author ACER
 */
public class StudentExample 
{
    public static void printInformation(Person p)
    {
        if(p instanceof Student) {
            System.out.println("Nama    :"+p.getName());
            System.out.println("Alamat  :"+p.getAddress()); 
        } 
        if(p instanceof Employee) {
            System.out.println("Nama    :"+p.getName());
            System.out.println("Alamat  :"+p.getAddress()); 
        } 
        
    }      
    public static void main(String[] args)
    {
        Person ref;
        Student ali = new Student();
        ali.setName("Ali");
        ali.setAddress("Padang");
        Employee budi = new Employee();
        budi.setName("Budi");
        budi.setAddress("Bukit Tinggi");
        
        printInformation(ali);
        printInformation(budi);
        
        ref = ali;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        
        ref = budi;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress()); 
    }
   
}
