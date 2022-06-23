/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Estudiante
 */
public class Triangulo {
    public double base;
    public double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        return (this.base * this.altura) / 2;
    }
}
