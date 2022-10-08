/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kansha11.relasiclass.tugas;

/**
 *
 * @author HP
 */
public class Sando {
    private String nama;
    private int harga;
    
    public Sando(){
        
    }
    public Sando(String nama, int harga){
    this.nama = nama;
    this.harga = harga;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public String info(){
        String info = "";
        info += "Nama Sando: " +this.nama +"\n";
        info += "Harga Sando: " +this.harga + "\n";
        return info;
    }
}
