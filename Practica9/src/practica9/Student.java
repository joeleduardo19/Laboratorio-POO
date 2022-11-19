/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author UsuarioFCFM
 */
public class Student extends Person {

    private String program;
    private int year;
    private double fee;
    String dirname;
    
    public Student (String name, String address, String program, int year, double fee){
       
        super(name, address);
        dirname = "Nombre: " + name + "\nDireccion: " +  address;
        this.program = program;
        this.year = year;
        this.fee = fee;
        
    }
    
        /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    @Override
    public String toString() {
        return this.dirname + "\nSemestre: " + program + "\nAno: " + year + "\nTarifa: " + fee;
    }
}
