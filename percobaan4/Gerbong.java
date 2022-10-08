/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kansha11.relasiclass.percobaan4;

/**
 *
 * @author HP
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public Gerbong (){
        
    }
    public Gerbong (String kode, int jumlah){
            this.kode = kode;
            this.arrayKursi = new Kursi[jumlah];
            this.initKursi();
    }
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String info(){
        String info = "";
        info += "Kode: "+kode+"\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        //percobaan
        //this.arrayKursi[nomor- 1].setPenumpang(penumpang);
        
        //soal no.5
        if(arrayKursi[nomor - 1].getPenumpang()!= null){
            System.out.println("Kursi " +nomor+ " Terisi. Silahkan pilih kursi dengan nomor yang lain!");
        }else{
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
        }
    }

}
