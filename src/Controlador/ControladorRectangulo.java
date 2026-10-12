/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Manue
 */
public class ControladorRectangulo {

    private Rectangulo rect;
 
    public void crear(double x1, double y1, double x2, double y2) 
    {
        
        rect = new Rectangulo(new Punto(x1, y1), new Punto(x2, y2));
        
    }
 
    public boolean hayRectangulo() 
    { 
        return rect != null; 
    }
    
    public Rectangulo getRectangulo() 
    { 
        return rect; 
    }
 
    public double calcularArea() 
    { 
        return rect.calcularArea(); 
    }
 
}
