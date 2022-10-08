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
public class Pembeli {
    private String nama;
    private String alamat;
    private String nomor;
    
    public Pembeli(){
        
    }
    public Pembeli(String nama, String alamat, String nomor){
        this.nama=nama;
        this.alamat=alamat;
        this.nomor=nomor;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNomor(){
        return nomor;
    }
    public void setNomor(String nomor){
        this.nomor=nomor;
    }
    public String info(){
        String info = "";
        info += "Nama Pemesan: "+this.nama+"\n";
        info += "Alamat: "+this.alamat+"\n";
        info += "Nomor HP: "+this.nomor;
        return info;
    }
}
