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
    
    public Calculadora() {

}

    @Override
    public String encender() {
        return ("Calculadora Encendido");
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
