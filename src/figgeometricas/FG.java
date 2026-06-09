/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figgeometricas;

/**
 *
 * @author Yumor
 */
public abstract class FG {
   protected double perimetro; 
   protected double area; 
    
    public double getPerimetro(){
       return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public abstract double calcularPerimetro();
    
    public abstract double calcularArea();
    
}
