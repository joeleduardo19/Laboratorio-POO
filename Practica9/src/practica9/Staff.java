/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author UsuarioFCFM
 */
public class Staff extends Person {

    private String school;
    private double pay;
    String dirname;
    
    public Staff(String name, String address, String school, double pay){
        
        super(name, address);
        this.school = school;
        this.pay = pay;
        dirname = "Nombre: " + name + "\nDireccion: " +  address;
    }
    
     /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        return this.dirname + "\nEscuela: " + this.school + "\nPaga: " + this.pay;
    }
            
}
