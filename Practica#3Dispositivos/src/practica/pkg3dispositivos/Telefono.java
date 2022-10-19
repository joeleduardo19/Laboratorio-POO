/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3dispositivos;

/**
 *
 * @author Dell
 */
public class Telefono extends DispositivosElectronicos implements IOperacionesAritmeticas {
    
    private String modelo;
    private String carga;
    
    public Telefono() {
    
    
    }
    public Telefono(String carga) {
        this.carga = carga;
    }

    @Override
    public String encender() {
        if(this.carga.contains("carga")){
            System.out.println("carga");
        }
        return ("Telefono Encendido");
    }
    
    public String hacerllamada (int num) {
        return "Llamando" + num;
    }

    @Override
    public double suma(double a, double b){
        return a + b;
    }
    
     @Override
    public double reta(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacion(double a, double b){
        return a * b;
    }

    @Override
    public double division(double a, double b){
        return a / b;
    }

  
}
