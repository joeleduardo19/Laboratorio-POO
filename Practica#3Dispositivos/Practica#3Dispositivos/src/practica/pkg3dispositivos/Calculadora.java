/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3dispositivos;

/**
 *
 * @author Dell
 */
public class Calculadora extends DispositivosElectronicos implements IOperacionesAritmeticas {

    @Override
    public String encender() {
        return ("Calculadora Encendido");
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
