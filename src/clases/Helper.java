/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



import interfaces.ListadoEmpleados;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class Helper {

  public static int mensaje(Component ventana, String info, String titulo,  int tipo) {
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

    
    
    public static void llenarTabla(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList<Usuario> personas = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = personas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(i+1, i, 0);
           tabla.setValueAt(personas.get(i).getCedula(), i, 1);
           tabla.setValueAt(personas.get(i).getNombre(), i, 2);
           tabla.setValueAt(personas.get(i).getApellido(), i, 3);
           tabla.setValueAt(personas.get(i).getTelefono(), i, 4);
           tabla.setValueAt(personas.get(i).getDireccion(), i, 5);
           tabla.setValueAt(personas.get(i).getCorreo(), i, 6);
           tabla.setValueAt(personas.get(i).getCargo(), i, 7);
           tabla.setValueAt(personas.get(i).getFechaIng(), i, 8);
           
        }
    }
    
    public static ArrayList traerDatos(String ruta){
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList personas = new ArrayList();
        Object p;
        
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                personas.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
           return personas;
    } 
    
    public static void volcado(ObjectOutputStream salida,ArrayList personas ){
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
       public static boolean buscarPorCedula(String cedula, String ruta){
        ArrayList<Usuario> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getCedula().equals(cedula)){
                return true;
            }
            
        }
        return false;
    }
    
    public static Usuario traerPersona(String cedula,String ruta){
        ArrayList<Usuario> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getCedula().equals(cedula)){
                return personas.get(i);
            }
            
        }
        return null;
    }
    
    public static ArrayList<Usuario> actualizarPersona(String ruta, String cedula, String nombre, String apellido, String Telefono, String Direccion, String Correo,String Cargo, String FechaIng){
        ArrayList<Usuario> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
          if(personas.get(i).getCedula().equals(cedula)){
                personas.get(i).setNombre(nombre);
                personas.get(i).setApellido(apellido);
                personas.get(i).setTelefono(Telefono);
                personas.get(i).setDireccion(Direccion);
                personas.get(i).setCorreo(Correo);
                personas.get(i).setCargo(Cargo);
                personas.get(i).setFechaIng(FechaIng);
                
                i=personas.size();
            }
        }
        return personas;
    }
    
    public static ArrayList<Usuario> actualizarPersona(String ruta, Usuario p){
        ArrayList<Usuario> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
          if(personas.get(i).getCedula().equals(p.getCedula())){
                personas.get(i).setNombre(p.getNombre());
                personas.get(i).setApellido(p.getApellido());
                personas.get(i).setTelefono(p.getTelefono());
                personas.get(i).setDireccion(p.getDireccion());
                personas.get(i).setCorreo(p.getCorreo());
                personas.get(i).setCargo(p.getCargo());
                personas.get(i).setFechaIng(p.getFechaIng());
               
                
                
                i=personas.size();
            }
        }
        return personas;
    }
    public static void CatidadEmpleados(String ruta){
        ArrayList<Usuario> personas = traerDatos(ruta);
        for(int i =0;i<personas.size(); i++ ){
            
        }
    }

    

}
  
