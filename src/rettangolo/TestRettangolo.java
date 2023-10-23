/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rettangolo;

/**
 *
 * @author fulls
 */
public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5.0, 4.0);
        Rettangolo rettangolo2 = new Rettangolo(3.0, 6.0);
        Rettangolo rettangolo3 = new Rettangolo(7.0, 2.0);

        // Calcola la somma delle aree
        double sommaAree = rettangolo1.area() + rettangolo2.area() + rettangolo3.area();
        System.out.println("Somma delle aree: " + sommaAree);

        // Calcola la somma dei perimetri
        double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro() + rettangolo3.perimetro();
        System.out.println("Somma dei perimetri: " + sommaPerimetri);

        // Ridimensiona il primo rettangolo
        rettangolo1.ridimensiona(8.0, 5.0);

        // Stampa nuove aree e perimetri
        System.out.println("Area del rettangolo 1 dopo il ridimensionamento: " + rettangolo1.area());
        System.out.println("Perimetro del rettangolo 1 dopo il ridimensionamento: " + rettangolo1.perimetro());
    }
}
