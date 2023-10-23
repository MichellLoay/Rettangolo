/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rettangolo;

/**
 *
 * @author fulls
 */
public class Rettangolo {

    /**
     * @param args the command line arguments
     */
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void ridimensiona(double nuovaBase, double nuovaAltezza) {
        this.base = nuovaBase;
        this.altezza = nuovaAltezza;
    }

    public double perimetro() {
        return 2 * (base + altezza);
    }

    public double area() {
        return base * altezza;
    }
}


