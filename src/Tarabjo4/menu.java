/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarabjo4;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class menu {
       private int Numeros[];
    Scanner sc = new Scanner(System.in);
    
    
    public void Numero(){
        Numeros = new int [10];
        for(int i=0; i<10; i++){
        System.out.print("Numero :");
        Numeros[i]=sc.nextInt();
        }
    }
    public void Promedio(){
        double suma=0;
        double  promedio=0;
        for (int i = 0; i < 10; i++) {
            suma = suma + Numeros[i];
            promedio = suma/10;
        }
        System.out.println("El promedio es:" + promedio );
    }
    public void Resultado(){
        System.out.println("El arreglo original es:");
        for (int i = 0; i < 10; i++) {
            System.out.println("" + Numeros[i]); 
        }
    }
}


