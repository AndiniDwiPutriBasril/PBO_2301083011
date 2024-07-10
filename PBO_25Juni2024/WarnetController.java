/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_25Juni2024;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class WarnetController {
   private final FormWarnet formWarnet;
    private Warnet warnet;
    private final WarnetDao warnetDao;  // Declare an instance of WarnetDao
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        this.warnetDao = new WarnetDao();  // Initialize the WarnetDao instance
    }
    
    public void clearForm(){
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtNamaPelanggan().setText("");
        formWarnet.getTxtJamMasuk().setText("");
        formWarnet.getTxtJamKeluar().setText("");
        formWarnet.getTxtTglMasuk().setText("");
        formWarnet.getCboJenisPelanggan().removeAllItems();
        formWarnet.getCboJenisPelanggan().addItem("VIP");
        formWarnet.getCboJenisPelanggan().addItem("Gold");
    }
     
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet> list= warnetDao.getAll();  // Use the instance to call the method
        for (Warnet a : list){
            Object[] row = {
                a.getKode(),
                a.getNamaPelanggan(),
                a.getJenisPelanggan(),
                a.getTglMasuk(),
                a.getJamMasuk(),
                a.getJamKeluar(),
                a.getLama(),
                a.getTarif(),
                a.getDiskon(),
                a.getTotalBayar(),
                a.calculateLama(),
                a.calculateTarif(),
                a.calculateDiskon(),
                a.calculateTotalBayar(),
            };
            tabelModel.addRow(row);
        }
    }
     
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNamaPelanggan().getText());
        warnet.setJenisPelanggan(formWarnet.getCboJenisPelanggan().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTglMasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText());
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.insert(warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Insert OK");
    }
     
    public void updateWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNamaPelanggan().getText());
        warnet.setJenisPelanggan(formWarnet.getCboJenisPelanggan().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTglMasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText()); 
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.update(index, warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Update OK");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);  // Use the instance to call the method
        if(warnet != null){
            formWarnet.getTxtKode().setText(warnet.getKode());
            formWarnet.getTxtNamaPelanggan().setText(warnet.getNamaPelanggan());
            formWarnet.getTxtTglMasuk().setText(warnet.getTglMasuk());
            formWarnet.getCboJenisPelanggan().setSelectedItem(warnet.getJenisPelanggan());
            formWarnet.getTxtJamKeluar().setText(warnet.getJamKeluar());
            formWarnet.getTxtJamMasuk().setText(warnet.getJamMasuk());
        }
    }
     
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Delete OK");
    }
}
