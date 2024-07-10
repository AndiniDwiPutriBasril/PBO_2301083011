/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_02April2024;

import java.util.Scanner;

public class BalokExample 
{
    public static void main(String[] args)
    {
        int pj,lbr,tg,la;
        Scanner in = new Scanner (System.in);
        //buat balok b1--> konstruktor 1
        System.out.println("===Balok 1===");
        Balok b1 = new Balok();
        System.out.print("Panjang = "); pj = in.nextInt();
        b1.setPanjang(pj);
        System.out.print("Lebar   = ");lbr =in.nextInt();
        b1.setLebar(lbr);
        System.out.print("Tinggi  = ");tg =in.nextInt();
        b1.setTinggi(tg);
        la = b1.hitungLuasAlas();
        b1.printBalok(la,b1.hitungLuasPermukaan(), b1.hitungVolume());
        
        //buat balok b2 --> konstratuktor 2
        System.out.println("===Balok 2===");
        Balok b2= new Balok(10);
        b2.setLebar(4);
        b2.setTinggi(5);
        b2.printBalok();
        b2.printBalok(b2.hitungLuasAlas(), b2.hitungLuasPermukaan(),b2.hitungVolume(b2.hitungLuasAlas()));
        
        //buat balok b2 --> konstruktur 2
        System.out.println("===Balok 3===");
        System.out.print("Panjang = "); pj  = in.nextInt();
        System.out.print("Lebar   = "); lbr = in.nextInt();
        System.out.print("Tinggi  = "); tg  = in.nextInt();
        Balok b3 = new Balok(pj,lbr,tg);
        la = b3.hitungLuasAlas();
        b3.printBalok(la,b3.hitungLuasPermukaan(), b3.hitungVolume(la));
        
    }
    
}
