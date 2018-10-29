/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan61.bangunruang;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung volume 
 * dari segitiga kerucut, bola, dan tabung.
 */
public class PBO210117070Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bl = new Bola();
        Tabung tb = new Tabung();
        Segitiga sg = new Segitiga();
        
        bl.setJari(7);
        System.out.println("Volume Bola : " + bl.hitungVolume());
        
        tb.setTinggi(21);
        tb.setJari(10);
        System.out.println("Volume Tabung : " + tb.hitungVolume());
        
        sg.setJari(14);
        sg.setTinggi(9);
   
        System.out.println("Volume Segitiga Kerucut : " + sg.hitungVolume());
    }
    
}
