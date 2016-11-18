/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class HelperInv {
    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }
    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }
    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    
    
    
      public static void llenarTabla2(JTable tabla, String rutaP){
        DefaultTableModel tm;
        int nf;
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = inventario.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(i+1, i, 0);
           tabla.setValueAt(inventario.get(i).getMarca(), i, 1);
           tabla.setValueAt(inventario.get(i).getNombrep(), i, 2);
           tabla.setValueAt(inventario.get(i).getCantidad(), i, 3);
           tabla.setValueAt(inventario.get(i).getFechaV(), i, 4);
           tabla.setValueAt(inventario.get(i).getTipo(), i, 5);
           
        }
    }
    public static void llenadoTabla2(JTable tabla, ArrayList<Inventario> inventario){
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel)tabla.getModel();
        nf = inventario.size();
        tm.setRowCount(nf);
        limpiadoTabla(tabla);
        for (int i = 0; i < nf; i++) {
           tm.setValueAt(i+1, i, 0);
           tm.setValueAt(inventario.get(i).getMarca(), i, 1);
           tm.setValueAt(inventario.get(i).getNombrep(), i, 2);
           tm.setValueAt(inventario.get(i).getCantidad(), i, 3);
           tm.setValueAt(inventario.get(i).getFechaV(), i, 4);
           tm.setValueAt(inventario.get(i).getTipo(), i, 5);
           
     
        }
    }
    
    public static ArrayList traerDatos2(String rutaP){
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList inventario = new ArrayList();
        Object p;
        
        try {
            archivo = new FileInputStream(rutaP);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                inventario.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
           return inventario;
    } 
    
    public static void volcado2(ObjectOutputStream salida,ArrayList inventario ){
        for (int i = 0; i < inventario.size(); i++) {
            try {
                salida.writeObject(inventario.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
  public static boolean buscarMarca(String Marca, String rutaP){
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getMarca().equals(Marca)){
                return true;
            }
            
        }
        return false;
    }
    
    public static Inventario traerDatos2(String Marca,String rutaP){
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getMarca().equals(Marca)){
                return inventario.get(i);
            }
            
        }
        return null;
    }
    
    public static ArrayList<Inventario> actualizarProducto(String rutaP, String Marca, String nombrep, String cantidad, String FechaV,String Tipo){
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        for (int i = 0; i < inventario.size(); i++) {
          if(inventario.get(i).getMarca().equals(Marca)){
                inventario.get(i).setNombrep(nombrep);
                inventario.get(i).setCantidad(cantidad);
                inventario.get(i).setFechaV(FechaV);
                inventario.get(i).setTipo(Tipo);
                
                
                
                i=inventario.size();
            }
        }
        return inventario;
    }
    
    public static ArrayList<Inventario> actualizarProducto(String rutaP, Inventario p){
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        for (int i = 0; i < inventario.size(); i++) {
          if(inventario.get(i).getMarca().equals(p.getMarca())){
                inventario.get(i).setNombrep(p.getNombrep());
                inventario.get(i).setCantidad(p.getCantidad());
                inventario.get(i).setFechaV(p.getFechaV());
                inventario.get(i).setTipo(p.getTipo());
                
                
                i=inventario.size();
            }
        }
        return inventario;
    }
    public static void listadoPorTipo(JTable tabla, String rutaP, String tipo){
        ArrayList<Inventario> inventario = traerDatos2(rutaP);
        ArrayList<Inventario> productoFiltradas = new ArrayList();
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getTipo().equals(tipo)){
                productoFiltradas.add(inventario.get(i));
            }
            
        }
        
        llenadoTabla2(tabla, productoFiltradas);
    }
        
  
}
 

