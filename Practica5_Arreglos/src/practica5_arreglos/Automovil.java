/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_arreglos;
/**
 *
 * @author Dell
 */
public class Automovil extends Automotor {

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
 
    private String color; 
    
    public String avanzar(double gas){
        return "Automovil avanzando";
    }
    
}
