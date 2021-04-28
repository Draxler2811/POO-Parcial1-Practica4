/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ol196
 */
public class Main {
    public static void main(String [] args ){
            Persona p = new Persona();
            p.setEdad(18);
            System.out.println("Edad: " + p.getEdad());
            
            Estudiante e = new Estudiante();
            e.Saludar();
            
    }
}
