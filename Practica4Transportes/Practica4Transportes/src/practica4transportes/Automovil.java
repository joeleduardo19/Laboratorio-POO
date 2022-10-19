/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4transportes;

import Vehiculos.Vehiculo;
/**
 *
 * @author Dell
 */
public class Automovil extends Vehiculo {
    
    public Automovil(){
    }
    
    public Automovil(int gas){
        this.encenderAutomovil(gas);
        this.avanzarAutomovil(gas);
    }
    
    public Automovil(double carga){
        this.enciendeAutomovil(carga);
        this.avanzaAutomovil(carga);
    }
    

    private void encenderAutomovil(int gas){
        if (gas>1){
            System.out.println("Automovil Encendido");
        }
        else{
            System.out.println("No suficiente gasolina");
        }
    }
    private void avanzarAutomovil (int gas){
        if (gas > 10 && gas < 20) {
            System.out.println("Nivel bajo de gasolina");
        }
        else {
            System.out.println("Insuficiente gasolina");
        }
    }
    
    private void enciendeAutomovil(double carga){
        if (carga >= 70) 
            System.out.println("Auto encendido");
        else
            System.out.println("Insuficiente carga");
    }
    
    private void avanzaAutomovil (double carga) {
        if (carga >= 80) 
            System.out.println("Auto avanzando");
        else 
            System.out.println("Insuficiente carga");
    }
}
