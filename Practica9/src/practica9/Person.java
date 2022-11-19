/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;
/**
 *
 * @author UsuarioFCFM
 */
public class Person { 
    
    private String name;
    private String address;
    
    public Person(String name, String address) {
    
        this.name = name;
        this.address = address;
    }

    
     /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
       return "Nombre:" + this.name+ "\nDireccion:" + this.address;
    }
}
