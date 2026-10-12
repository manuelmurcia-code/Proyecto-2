/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public abstract class FiguraGeometrica {
 
    // Cada figura calcula su area de forma distinta
    public abstract double calcularArea();
 
    // Cada figura se mueve de forma distinta
    public abstract void mover(double dx, double dy);
}
