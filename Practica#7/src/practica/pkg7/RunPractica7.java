/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg7;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Datos gato = new Datos();
        System.out.println("\tInformacion sobre el gato\n");
        System.out.println("Ingrese la edad del gato");
        gato.edad = sc.nextInt();
        System.out.println("Ingrese el nombre del gato");
        sc.nextLine();
        gato.nombre = sc.nextLine();
        System.out.println("Ingrese la raza del gato");
        gato.raza = sc.nextLine();
        System.out.println("Ingrese el color del gato");
        gato.color = sc.nextLine();
        Gato c = new Gato();        
        System.out.println(c.caminar(20));
        System.out.println(c.comer());
        System.out.println(c.maullaryladrar());
        
        Datos perro = new Datos();
        System.out.println("\n\tInformacion sobre el perro\n");
        System.out.println("Ingrese la edad del perro");
        perro.edad = sc.nextInt();
        System.out.println("Ingrese el nombre del perro");
        sc.nextLine();
        perro.nombre = sc.nextLine();
        System.out.println("Ingrese la raza del perro");
        perro.raza = sc.nextLine();
        System.out.println("Ingrese el color del perro");
        perro.color = sc.nextLine();
        Perro p = new Perro();        
        System.out.println(p.caminar(20));
        System.out.println(p.comer());
        System.out.println(p.maullaryladrar());
        
        Datos gorrion = new Datos();
        System.out.println("\n\tInformacion sobre el gorrion\n");
        System.out.println("Ingrese la edad del gorrion");
        gorrion.edad = sc.nextInt();
        System.out.println("Ingrese el nombre del gorrion");
        sc.nextLine();
        gorrion.nombre = sc.nextLine();
        System.out.println("Ingrese la raza del gorrion");
        gorrion.raza = sc.nextLine();
        System.out.println("Ingrese el color del gorrion");
        gorrion.color = sc.nextLine();
        Gorrion g = new Gorrion();        
        System.out.println(g.caminar(20));
        System.out.println(g.comer());
        System.out.println(g.maullaryladrar());
        
        Datos jaguar = new Datos();
        System.out.println("\n\tInformacion sobre el jaguar\n");
        System.out.println("Ingrese la edad del jaguar");
        jaguar.edad = sc.nextInt();
        System.out.println("Ingrese el nombre del jaguar");
        sc.nextLine();
        jaguar.nombre = sc.nextLine();
        System.out.println("Ingrese la raza del jaguar");
        jaguar.raza = sc.nextLine();
        System.out.println("Ingrese el color del jaguar");
        jaguar.color = sc.nextLine();
        Jaguar j = new Jaguar();        
        System.out.println(j.caminar(20));
        System.out.println(j.comer());
        System.out.println(j.maullaryladrar());
        
        Datos cocodrilo = new Datos();
        System.out.println("\n\tInformacion sobre el cocodrilo\n");
        System.out.println("Ingrese la edad del cocodrilo");
        cocodrilo.edad = sc.nextInt();
        System.out.println("Ingrese el nombre del cocodrilo");
        sc.nextLine();
        cocodrilo.nombre = sc.nextLine();
        System.out.println("Ingrese la raza del cocodrilo");
        cocodrilo.raza = sc.nextLine();
        System.out.println("Ingrese el color del cocodrilo");
        cocodrilo.color = sc.nextLine();
        Cocodrilo z = new Cocodrilo();        
        System.out.println(z.caminar(20));
        System.out.println(z.comer());
    }
    
}
