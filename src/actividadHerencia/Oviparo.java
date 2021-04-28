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
public abstract class Oviparo extends Animales {
    @Override
   public void setColor(String color){
       this.color = color;
   }
   @Override
   public String getColor(){
       return color;
   }
    @Override
   public void setTamaño(String tamaño){
       this.tamaño = tamaño;
   }
   @Override
   public String getTamaño(){
       return tamaño;
   }
}