/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class RunCalculadora {
static Scanner sumobj = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op = new Operaciones(); {
        System.out.println("class Operaciones");
        System.out.println("Introducir el primer valor para la resta");
        double v1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la resta");
        double v2 = sumobj.nextDouble();
        double a = op.resta(v1, v2);
        System.out.println("resta de " + v1 + " - " + v2 + " = " + a);
        
        System.out.println("Introducir el primer valor para la suma");
        double s1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la suma");
        double s2 = sumobj.nextDouble();
        System.out.println("suma de " + s1 + " + " + s2 + " = " + op.suma(s1, s2) );
        
        System.out.println("Introducir el primer valor para la division");
        double d1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la division");
        double d2 = sumobj.nextDouble();
        System.out.println("division de " + d1 + " / " + d2 + " = " + op.division(d1, d2));
        
        System.out.println("Introducir el primer valor para la multiplicacion");
        double m1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la multiplicacion");
        double m2 = sumobj.nextDouble();
        double b = op.multi(m1, m2);
        System.out.println("multiplicacion de " + m1 + " * " + m2 + " = " + b);
    }
        OperacionesAvanzadas opa = new OperacionesAvanzadas(); {
        System.out.println("class OperacionesAvanzadas");
        System.out.println("Introduzca un valor para elevarlo al cuadrado");
        double c1 = sumobj.nextDouble();
        System.out.println("el cuadrado de " + c1 + " es " +  opa.cuadrado(c1));
     
        System.out.println("Introduzca un valor para sacar raiz cuadrada");
        double r1 = sumobj.nextDouble();
        System.out.println("la raiz cuadrada de " + r1 + " es " +  opa.squtr(r1));
    }
    }   
}
