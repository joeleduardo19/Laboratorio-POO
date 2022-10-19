/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3dispositivos;

/**
 *
 * @author Dell
 */
public abstract class DispositivosElectronicos {
    private String marca;
    private String color;
    
    public abstract String encender();
    
    public String apagar (){
        return ("Dispositivo Apagado");
    }
}
