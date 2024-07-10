/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_25Juni2024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class WarnetDao {
    private final List<Warnet> data = new ArrayList();
    
    public  WarnetDao(){
        
    }
    
    public void insert(Warnet warnet){
        data.add(warnet);
    }
    
    public void update(int index, Warnet warnet){
        data.set(index,warnet);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    
    public List<Warnet> getAll(){
        return data;
    }
}
