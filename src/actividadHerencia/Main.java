/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadHerencia;

/**
 *
 * @author ol196
 */
public class Main {
    public static void main (String [] args ){
      Perro perro = new Perro();
      perro.setColor("Negro");
      perro.setTamaño("grande");
        System.out.println("color del perro es: " + perro.color);
        System.out.println("Tamaño del perro es: " + perro.tamaño);
        System.out.println("--------------------------------------");
     
      Lobo lobo = new Lobo();
      lobo.setColor("Gris");
      lobo.setTamaño("pequeño");
        System.out.println("color del lobo:" + lobo.getColor());
        System.out.println("Tamaño del lobo "+ lobo.tamaño);
        System.out.println("--------------------------------------");
        
        Gato gato = new Gato();
        gato.setColor("naranja");
        gato.setTamaño("mediano");
        System.out.println("color gato es:" + gato.getColor());
        System.out.println("tamaño gato es:" + gato.getTamaño());
        System.out.println("---------------------------------------");
        
        Tigre tigre = new Tigre();
        tigre.setColor("blanco");
        tigre.setTamaño("grande");
        System.out.println("color del tigre  es:" + tigre.getColor());
        System.out.println("tamaño del tigre es:" + tigre.getTamaño());
        System.out.println("---------------------------------------");
        
        Aguila aguila = new Aguila();
        aguila.setColor("Cafe con amarillo ");
        aguila.setTamaño("grande");
        System.out.println("color del la aguila  es:" + aguila.getColor());
        System.out.println("tamaño del la aguila  es:" + aguila.getTamaño());
        System.out.println("---------------------------------------");
        
        Paloma paloma = new Paloma();
        paloma.setColor("Gris con blanco ");
        paloma.setTamaño("pequeña");
        System.out.println("color de la paloma  es:" + paloma.getColor());
        System.out.println("tamaño de la paloma  es:" + paloma.getTamaño());
        System.out.println("---------------------------------------");
        
         
        Trucha trucha = new Trucha();
        trucha.setColor("fluorescentes ");
        trucha.setTamaño("30 cm ");
        System.out.println("color de la trucha  es:" + trucha.getColor());
        System.out.println("tamaño de la trucha  es:" + trucha.getTamaño());
        System.out.println("---------------------------------------");
        
        Salmon salmon = new Salmon();
        salmon.setColor("rosa anaranjada  ");
        salmon.setTamaño("60-110 cm ");
        System.out.println("color del Salmon  es:" + salmon.getColor());
        System.out.println("tamaño del salmon    es:" + salmon.getTamaño());
        System.out.println("---------------------------------------");
        
      
      
    }
}
