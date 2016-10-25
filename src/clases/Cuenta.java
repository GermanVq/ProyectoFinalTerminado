/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Lenovo
 */
public class Cuenta implements java.io.Serializable{
    private String cuenta;
    private String contraseña;

    public Cuenta(String cuenta, String contraseña) {
        this.cuenta = cuenta;
        this.contraseña = contraseña;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
}
