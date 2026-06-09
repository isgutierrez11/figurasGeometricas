/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;
import figgeometricas.FG;

/**
 *
 * @author Yumor
 */
public class Circulo extends FG{
    private double r; 
    private static final double pi=Math.PI;

    public double getRadio() {
        return this.r;
    }

    public static double getPi() {
        return pi;
    }

    public double getDiametro() {
        return this.r*2;
    }

    public void setRadio(double r) {
        this.r = r;
    }

    public Circulo(double r) {
        this.r = r;
    }
    
    
    @Override
    public double calcularPerimetro() {
       this.perimetro = 2*pi*r; 
      
       return perimetro; 
    } 

    @Override
    public double calcularArea() {
       this.area= Math.pow(r,2)*pi;
       
       return area;
    }

    
   
    
}
