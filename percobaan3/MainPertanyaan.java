/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kansha11.relasiclass.percobaan3;

/**
 *
 * @author HP
 */
public class MainPertanyaan {
 public static void main(String[] args){
     Pegawai masinis = new Pegawai ("1234","Spongebob Squarepants");
     Pegawai asisten = new Pegawai ("45767", "Patrick Star");
     KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis,asisten);
     
     System.out.println(keretaApi.info());
 }   
}
