/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 52812
 */
public class Utils {
    
    File archivo;
    
    void crearArchivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir el nombre de su archivo con terminancion .txt");
        String nomfile = sc.nextLine();
        archivo = new File(nomfile);
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado con exito");
            }
            else{
                System.out.println("Error al crear archivo");
            }
        }catch(IOException exception){
            exception.printStackTrace(System.out);
        }
    }
    protected void writeArchivo(){        
        try{
            FileWriter wfile = new FileWriter(archivo);
            System.out.println("Ingrese lo que desea escribir en el archivo");
            Scanner scan = new Scanner(System.in);
            String escribir = scan.nextLine();
            wfile.write(escribir);
            wfile.close();
        
            System.out.println("Texto escrito con exito");
        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
        }
    }
    
    public void Readfile (){
        String contenido;
        try{
            FileReader rfile = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(rfile);
            contenido = lectura.readLine();
            System.out.println("La lectura del archivo es:");
            System.out.println(contenido);
        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
        }
    
    }
}
     
    

