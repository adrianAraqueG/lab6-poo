/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Estudiante
 */
public class Contenedor {
    public Triangulo[] lista;
    private int contador;
    
    public Contenedor(){
        this.lista = new Triangulo[50];
        this.contador = 0; 
    }
    
    public void agregarTriangulo(Triangulo t){
        this.lista[contador] = t;
    }
}
