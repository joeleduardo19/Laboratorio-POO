/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_arreglos;

/**
 *
 * @author Dell
 */
public class Automotor {

    
    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    private String Modelo;
    
        public String frenar(){
            return "Automovil frenando";
    }   
        public String acelerar(double gas){
            return "Automovil acelerando";
    }  
        public String avanzar(double gas){
            return "Automovil avanzando";
    }   
        public String avanzaDerecha(double gas){
            return "Vuelta a la derecha";
    }
        public String avanzaIzquierda(double gas){
            return "Vuelta a la izquierda";
    }
}
