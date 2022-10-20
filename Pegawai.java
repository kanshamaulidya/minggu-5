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
public class Pegawai {
    private String id;
    private String nama;
    
    public Pegawai(){
        
    }
    public Pegawai(String id, String nama){
        this.id=id;
        this.nama=nama;
    }
    public String getId(){
       return id; 
    }
    public void setId(String id){
        this.id=id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
       this.nama=nama; 
    }
    public String info(){
        String info = "";
        info += "Id: " +this.id+"\n";
        info += "Nama Pegawai:" + this.nama+"\n";
        return info;
    }
}
