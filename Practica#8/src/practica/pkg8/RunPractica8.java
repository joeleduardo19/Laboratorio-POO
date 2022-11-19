/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg8;


/**
 *
 * @author 52812
 */
public class RunPractica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utils fileTexto = new Utils();
        fileTexto.crearArchivo(); //El archivo se guarda en la carpeta del proyecto en donde se encuentra ubicado en la pc
        fileTexto.writeArchivo();
        fileTexto.Readfile();
    }
    
}
