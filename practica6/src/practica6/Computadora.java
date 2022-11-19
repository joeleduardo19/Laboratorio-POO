/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class Computadora extends ComponenteElectronico implements IOtrosComponentes {

    @Override
    public String encender() {
        return "Computador Encendido";
    }

    @Override
    public String apagar() {
        return "Computador Apagado";
    }

    @Override
    public double bateria(double carga) {
        return carga;
    }
}



