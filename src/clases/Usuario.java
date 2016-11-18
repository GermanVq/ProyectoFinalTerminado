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
 * @author rmorales1
 */
public class Usuario implements java.io.Serializable{
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String Direccion;
    private String correo;
    private String Cargo;
    private String FechaIng;

    public Usuario(String cedula, String nombre, String apellido, String telefono, String Direccion, String correo, String Cargo, String FechaIng) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.correo = correo;
        this.Cargo = Cargo;
        this.FechaIng = FechaIng;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getFechaIng() {
        return FechaIng;
    }

    public void setFechaIng(String FechaIng) {
        this.FechaIng = FechaIng;
    }

  
    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    public boolean empiezaPor(String inicio) {
        if(inicio.isEmpty() || inicio.length()>cedula.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if( inicio.charAt(i) != cedula.charAt(i) )
                return false;
        return true;
    }
    
    @Override
    public String toString() {
        
        return  "cedula:" + cedula +
                "\nNombre completo: "+nombre+", "+apellido+
                "\nTelefono: "+telefono+
               "\nDireccion: "+Direccion+
               "\ncorreo: "+correo+
                "\ncargo: "+Cargo+
                "\nFechaing: "+FechaIng;
    }

        
}

    

