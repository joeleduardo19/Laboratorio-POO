/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4transportes;

import Vehiculos.Vehiculo; 
/**
 *
 * @author 52812
 */
public class Avion extends Vehiculo {
    
    public Avion (){
    }
    
    public Avion (int combustible) {
        this.encenderAvion(combustible);
        this.avanzarAvion(combustible);
    }
    
    public Avion (double carga) {
        this.encenderAvion(carga);
        this.avanzarAvion(carga);
    }
    
    private void encenderAvion ( int combustible) {
        if (combustible > 20) 
            System.out.println("Avion encendido");
        else
            System.out.println("Falta de combustible");
    }
    
    public void avanzarAvion (int combustible) {
        if (combustible >= 50 && combustible <= 100) 
            System.out.println("Avion Avanzando");
        else
            System.out.println("Combustible insuficiente");
    }
    
    public void encenderAvion (double carga) {
        if (carga > 20) 
            System.out.println("Avion encendido");
        else 
            System.out.println("Carga insuficiente");
    }
    
    public void avanzarAvion (double carga){
        if (carga >= 50 && carga <= 100) 
            System.out.println("Avion avanzando");
        else
            System.out.println("Nivel bajo de carga");
    }
}
