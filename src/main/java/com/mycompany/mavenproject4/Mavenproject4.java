/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Estudiante
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        
        contenedor.agregarTriangulo(new Triangulo(20.0, 30.0));
        
        System.out.println(contenedor.lista[0].getArea());
        
    }
}
