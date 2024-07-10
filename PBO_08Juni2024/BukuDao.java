/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_08Juni2024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku("001","laskar Pelangi","Andrea Hirata","Bentang Pustaka",2005));
        data.add(new Buku("002","Bumi Manusia","Pramoedya Ananta Toer","Hasta Mitra",1980));
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
    
            
    
    
}
