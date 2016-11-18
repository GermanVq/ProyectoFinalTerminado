/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
/**
 *
 * @author Lenovo
 */
public class Validar {
    
    public void ValidarSoloLetras(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public  void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               
               if(Character.isDigit(c)){
                   e.consume();
               }
            }
        
    
        });
    }

public void ValidarSoloNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public  void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               
               if(!Character.isDigit(c)){
                   e.consume();
               }
            }
        
    
        });
    }
public void LimitarCaracteres(JTextField campo,int cantidad){
        campo.addKeyListener(new KeyAdapter(){
            public  void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               int cant=campo.getText().length();
               
               if(cant>=cantidad){
                   e.consume();
                     }
            }
        
    
        });
}
}