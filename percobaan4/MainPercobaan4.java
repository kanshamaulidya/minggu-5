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
public class MainPercobaan4 {
    public static void main(String[] args){
        Penumpang p = new Penumpang("1234","Mr. Crab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        
        Penumpang budi = new Penumpang("5678", "Budi");
        gerbong.setPenumpang(budi, 1);
        
        System.out.println(gerbong.info());
   }
}
