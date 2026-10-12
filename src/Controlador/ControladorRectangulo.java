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
 
    public boolean puntoDentro(double x, double y) 
    {
        
        double minX = Math.min(rect.getP1().getX(), rect.getP2().getX());
        double maxX = Math.max(rect.getP1().getX(), rect.getP2().getX());
        double minY = Math.min(rect.getP1().getY(), rect.getP2().getY());
        double maxY = Math.max(rect.getP1().getY(), rect.getP2().getY());
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
        
    }
    
}
