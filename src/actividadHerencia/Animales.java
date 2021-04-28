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
public  abstract class  Animales implements Comportamiento {
    protected String color;
    protected String tamaño;
    
    @Override
   public abstract void setColor(String color);
   
    @Override
   public abstract String getColor();
   
    @Override
   public abstract void setTamaño(String tamaño);
   
    @Override
   public abstract String getTamaño();
  
    
    
}

    
    