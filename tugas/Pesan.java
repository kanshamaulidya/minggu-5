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
public class Pesan {
    private String tglPesan;
    private int jumlah;
    private Sando sando;
    private Pegawai pegawai;
    private Pembeli pembeli;
    
    public Pesan(){
        
    }
    public Pesan(String tglPesan, int jumlah,
            Sando sando, Pegawai pegawai, Pembeli pembeli){
        this.tglPesan=tglPesan;
        this.jumlah=jumlah;
        this.sando=sando;
        this.pegawai=pegawai;
        this.pembeli=pembeli;
    }
    public String getTglPesan(){
        return tglPesan;
    }
    public void setTglPesan(String tglPesan){
        this.tglPesan=tglPesan;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    public Sando getSando(){
        return sando;
    }
    public void setSando(Sando sando){
        this.sando=sando;
    }
    public Pegawai getPegawai(){
        return pegawai;
    }
    public void setPegawai(Pegawai pegawai){
        this.pegawai=pegawai;
    }
    public Pembeli getPembeli(){
        return pembeli;
    }
    public void setPembeli(Pembeli pembeli){
        this.pembeli=pembeli;
    }
    public int total(int jumlah, int harga){
        return jumlah* harga;
    }
    public void info(){
        System.out.println("Tanggal: "+tglPesan+"\n");
        System.out.println("Pegawai "+pegawai.info());
        System.out.println(pembeli.info()+"\n");
        System.out.println(sando.info());
        System.out.println("Jumlah Beli: " +jumlah);
        System.out.println("Total: "+total(jumlah,sando.getHarga() ));
    }

    
}
