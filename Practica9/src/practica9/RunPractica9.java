/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

import java.util.Scanner;

/**
 *
 * @author UsuarioFCFM
 */
public class RunPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String address = sc.nextLine();
        Person p = new Person(name, address);
        System.out.println(p.toString());
        
        System.out.println("\nIngrese su nombre");
        String n = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String d = sc.nextLine();
        System.out.println("Ingrese su escuela");
        String school = sc.nextLine();
        System.out.println("Ingrese su paga");
        double pay = sc.nextDouble();
        Staff s = new Staff(n, d, school, pay);
        System.out.println(s.toString());
        
        System.out.println("\nIngrese su nombre");
        String aux = sc.nextLine();
        String nom = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String dir = sc.nextLine();
        System.out.println("Ingrese el programa en el que esta");
        String program = sc.nextLine();
        System.out.println("Ingrese el ano");
        int year = sc.nextInt();
        System.out.println("Ingrese la tarifa");
        double fee = sc.nextDouble();
        Student st = new Student(nom, dir, program, year, fee);
        System.out.println(st.toString());
    }
    
}
