/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan61.bangunruang;

/**
 *
 * @author Aditya
 */
public class Segitiga extends BangunRuang {
   private double jari;
    private double tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double hitungVolume() {
        
        return 3.14*jari*jari*tinggi;
    }
}

