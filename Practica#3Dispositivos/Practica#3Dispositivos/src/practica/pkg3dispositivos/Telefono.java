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
    
    @Override
    public String encender() {
    return ("Telefono Encendido");
    }
    
    public String hacerllamada (int num) {
        return "Llamando" + num;
    }
    public double suma(double a, double b){
        return a + b;
    }
    public double resta(double a, double b){
        return a - b;
    }
    public double multiplicacion(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        return a / b;
    }
}
