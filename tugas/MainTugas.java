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
public class MainTugas {
    public static void main(String[] args){
        Sando s = new Sando("Fruit Sando", 20000);
        Pegawai peg= new Pegawai("a123", "Kansha Maulidya");
        Pembeli pem=new Pembeli("Shyfa", "Kota Malang", "087883233003"); 
        
        Pesan psn=new Pesan();
        psn.setSando(s);
        psn.setPegawai(peg);
        psn.setPembeli(pem);
        psn.setJumlah(10);
        psn.setTglPesan("08/10/2022");
        psn.info();
        
    }
}
