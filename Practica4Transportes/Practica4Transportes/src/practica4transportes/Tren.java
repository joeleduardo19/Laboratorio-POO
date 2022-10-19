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
public class Tren extends Vehiculo {
    
    public Tren (){
    }
    
    public Tren (int carbon) {
        this.encenderTren(carbon);
        this.avanzarTren(carbon);
    }
    
    public Tren (double electrico) {
        this.encenderTren(electrico);
        this.avanzarTren(electrico);
    }
    
    private void encenderTren (int carbon) {
        if (carbon > 25)
            System.out.println("Tren encendido");
        else
            System.out.println("Combustible insuficiente");
    }
    
    private void avanzarTren (int carbon) {
        if(carbon >= 40 && carbon <= 100)
            System.out.println("Tren avanzando");
        else 
            System.out.println("Insuficiente combustible para avanzar");
    }
    
    private void encenderTren (double electrico) {
        if (electrico > 25)
            System.out.println("Tren encendido");
        else
            System.out.println("Carga insuficiente");
    }
    
    private void avanzarTren (double electrico) {
        if(electrico >= 40 && electrico <= 100)
            System.out.println("Tren avanzando");
        else 
            System.out.println("Insuficiente carga para avanzar");
    }
}
