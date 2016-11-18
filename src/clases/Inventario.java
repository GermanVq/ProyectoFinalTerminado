/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Lenovo
 */
public class Inventario implements java.io.Serializable {
    private String Marca;
    private String Nombrep;
    private String Cantidad;
    private String FechaV;
    private String Tipo;

    public Inventario(String Marca, String Nombrep, String Cantidad, String FechaV, String Tipo) {
        this.Marca = Marca;
        this.Nombrep = Nombrep;
        this.Cantidad = Cantidad;
        this.FechaV = FechaV;
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNombrep() {
        return Nombrep;
    }

    public void setNombrep(String Nombrep) {
        this.Nombrep = Nombrep;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFechaV() {
        return FechaV;
    }

    public void setFechaV(String FechaV) {
        this.FechaV = FechaV;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
}
