/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tallerIGS.clase;

import java.util.Scanner;

/**
 *
 * @author napos
 */
public class BusquedaBinaria {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        
        System.out.print("Ingresa el número que deseas buscar: ");
        
        // Verificar si el usuario ingresó un número
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next();  // Limpiar la entrada inválida
        }
        
        int objetivo = scanner.nextInt();
        
        int resultado = busquedaBinaria(numeros, objetivo);
        
        if (resultado == -1) {
            System.out.println("El número no se encontró en el arreglo.");
        } else {
            System.out.println("Número encontrado en la posición: " + resultado);
        }
        
        scanner.close();
    }
    
    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda <= derecha) {
            int mitad = (izquierda + derecha) / 2;
            
            if (arreglo[mitad] == objetivo) {
                return mitad;
            }
            
            if (arreglo[mitad] < objetivo) {
                izquierda = mitad + 1;
            } else {
                derecha = mitad - 1;
            }
        }
        
        return -1;
    }
}
