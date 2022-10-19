/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_2;
import java.util.Scanner;
/**
 *
 * @author 52812
 */
public class RunPractica_2 extends CalculadoraCientifica {
static Scanner sumobj = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora casio = new Calculadora();{
     
        System.out.println("Class Calculadora");
        System.out.println("Introducir el primer valor para la resta");
        double v1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la resta");
        double v2 = sumobj.nextDouble();
        double a = casio.resta(v1, v2);
        System.out.println("resta de " + v1 + " - " + v2 + " = " + a);
        
        System.out.println("Introducir el primer valor para la suma");
        double s1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la suma");
        double s2 = sumobj.nextDouble();
        System.out.println("suma de " + s1 + " + " + s2 + " = " + casio.suma(s1, s2) );
        
        System.out.println("Introducir el primer valor para la division");
        double d1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la division");
        double d2 = sumobj.nextDouble();
        System.out.println("division de " + d1 + " / " + d2 + " = " + casio.division(d1, d2));
        
        System.out.println("Introducir el primer valor para la multiplicacion");
        double m1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la multiplicacion");
        double m2 = sumobj.nextDouble();
        double b = casio.multi(m1, m2);
        System.out.println("multiplicacion de " + m1 + " * " + m2 + " = " + b);
    }
        
        CalculadoraCientifica casioC = new CalculadoraCientifica();{
        casioC.resta(4, 2);
        System.out.println("\nclass Calculadora Cientifica");
        
        System.out.println("Introducir el primer valor para la resta");
        double v1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la resta");
        double v2 = sumobj.nextDouble();
        double a = casioC.resta(v1, v2);
        System.out.println("resta de " + v1 + " - " + v2 + " = " + a);
        
        System.out.println("Introducir el primer valor para la suma");
        double s1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la suma");
        double s2 = sumobj.nextDouble();
        System.out.println("suma de " + s1 + " + " + s2 + " = " + casioC.suma(s1, s2) );
        
        System.out.println("Introducir el primer valor para la division");
        double d1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la division");
        double d2 = sumobj.nextDouble();
        System.out.println("division de " + d1 + " / " + d2 + " = " + casioC.division(d1, d2));
        
        System.out.println("Introducir el primer valor para la multiplicacion");
        double m1 = sumobj.nextDouble();
        System.out.println("Introducir el segundo valor para la multiplicacion");
        double m2 = sumobj.nextDouble();
        double b = casioC.multi(m1, m2);
        System.out.println("multiplicacion de " + m1 + " * " + m2 + " = " + b);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor para elevarlo al cuadrado");
        double c = sc.nextDouble();
        double d = casioC.cuadrado(c);
        System.out.println("el cuadrado de " + c + " es " +  casioC.cuadrado(c));
        
        System.out.println("Introduzca un valor para sacar raiz cuadrada");
        double e = sc.nextDouble();
        double f = casioC.raiz(e);
        System.out.println("la raiz cuadrada de " + e + " es " +  casioC.raiz(e));
    }   
}
}