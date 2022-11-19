/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author 52812
 */
public class Telefono extends ComponenteElectronico implements IOtrosComponentes {

    @Override
    public String encender() {
        return "Telefono Encendido";
    }

    @Override
    public String apagar() {
        return "Telefono Apagado";
    }

    @Override
    public double bateria(double carga) {
        return carga;
    }

  
}
