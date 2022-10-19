/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_arreglos;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Run_Practica5_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        Automovil[] audi = new Automovil[5];
        for (int i = 0; i < audi.length; i++) {
            System.out.println("\nIngrese el color de su coche");
            scan.nextLine();
            String color = scan.nextLine();
            System.out.println("\nIngrese el modelo de su coche");
            String Modelo = scan.nextLine();
            System.out.println("\nIngrese el nivel de gas de su coche");
            double gas = scan.nextDouble();
            audi[i] = new Automovil();
            audi[i].setColor(color + " " + Integer.toString(i));
            audi[i].setModelo(Modelo + " " + Integer.toString(i));
            //System.out.println(audi[i].frenar());    
        }
        
        for (Automovil auto: audi){
            System.out.println("\n" + auto.getColor());             
            System.out.println(auto.getModelo());
            System.out.println(auto.frenar());  
            System.out.println(auto.acelerar(54));
            System.out.println(auto.avanzaDerecha(23));
            System.out.println(auto.avanzaIzquierda(23));
            System.out.println(auto.avanzar(50));
        }
    }
}