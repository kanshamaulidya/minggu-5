/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kansha11.relasiclass.percobaan1;

/**
 *
 * @author HP
 */
public class MainPercobaan1 {
    public static void main(String[] args){
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", p);
        L.info();
        
        Processor pl = new Processor();
        pl.setMerk("Intel i5");
        pl.setCache(4);
        Laptop Ll = new Laptop();
        Ll.setMerk("Thinkpad");
        Ll.setProc(pl);
        Ll.info();
        
        
    }
}
