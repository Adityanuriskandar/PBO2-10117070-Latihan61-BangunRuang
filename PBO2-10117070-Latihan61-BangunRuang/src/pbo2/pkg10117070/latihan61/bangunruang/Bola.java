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
public class Bola extends BangunRuang {
    private double jari;
    

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    public double hitungVolume() {
        return (4/3) * 3.14 * (jari * jari * jari);
       
    }
}
