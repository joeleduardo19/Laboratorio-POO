/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4transportes;

/**
 *
 * @author Dell
 */
public class RunPractica4Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tAutomovil de gas");
        Automovil audi = new Automovil (15);
        System.out.println("\n\tAutomovil electrico");
        Automovil tesla = new Automovil ((double) 80); 
        
        System.out.println("\n\tAvion de combustible");
        Avion jet = new Avion (76);
        System.out.println("\n\tAvion de carga");
        Avion aircraft = new Avion ((double) 43);
        
        System.out.println("\n\tTren de carbon");
        Tren vapor = new Tren (23);
        System.out.println("\n\tTren electrico");
        Tren electrico = new Tren ((double) 63);
    }
    
}
