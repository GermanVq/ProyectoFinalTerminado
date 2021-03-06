/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import clases.Helper;
import clases.Usuario;
import clases.Validar;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Lenovo
 */
public class Agregar extends javax.swing.JDialog {
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Usuario> personas;
    int aux= 0;
    /**
     * Creates new form Agregar
     */
    private static DefaultTableModel modelo;
    private TableRowSorter trsFiltro;
    Validar v= new Validar();
    public Agregar(java.awt.Frame parent, boolean modal) {
      
    
    
        super(parent, modal);
        try {
            initComponents();
            v.ValidarSoloLetras(txtNombre);
            v.ValidarSoloLetras(txtApellido);
            v.ValidarSoloLetras(txtCargo);
            v.ValidarSoloNumeros(txtCedula);
            v.ValidarSoloNumeros(txtTelefono);
            v.LimitarCaracteres(txtCedula, 10);
            setLocationRelativeTo(null);
            
            ruta = "src/datos/personas.txt";
            personas = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.volcado(salida, personas);
            Helper.limpiadoTabla(tblTablaPersonas);
            Helper.llenarTabla(tblTablaPersonas, ruta);
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdGuardar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
 public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoG4.png"));
        return retValue;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdPasardatos = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFechaIng1 = new javax.swing.JTextField();
        cmdCalcularFecha = new javax.swing.JButton();
        jDatefecha = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPersonas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(0, 0, 51));
        cmdGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        cmdEliminar.setBackground(new java.awt.Color(0, 0, 51));
        cmdEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdEliminar.setForeground(new java.awt.Color(255, 255, 255));
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 51));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, -1));

        cmdBuscar.setBackground(new java.awt.Color(0, 0, 51));
        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBuscar.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, -1));

        cmdPasardatos.setBackground(new java.awt.Color(0, 0, 51));
        cmdPasardatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdPasardatos.setForeground(new java.awt.Color(255, 255, 255));
        cmdPasardatos.setText("Pasar Datos");
        cmdPasardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPasardatosActionPerformed(evt);
            }
        });
        jPanel4.add(cmdPasardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        cmdCancelar.setBackground(new java.awt.Color(0, 0, 51));
        cmdCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 270, 150));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Persona"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Ing:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 20));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellidos:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cargo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));
        jPanel2.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, -1));
        jPanel2.add(txtFechaIng1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));

        cmdCalcularFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularFechaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcularFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 20, 20));
        jPanel2.add(jDatefecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 270, 290));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personas"));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cédula", "Nombres", "Apellidos", "Telefono", "Dirección", "Correo", "Cargo", "Fecha de Ing."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaPersonasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaPersonas);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 350));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 380));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        txtBusqueda.setForeground(new java.awt.Color(0, 0, 204));
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 560, 20));

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", " " }));
        jPanel1.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 90, -1));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-waves-2880x1800px-593927-tapety-gier.jpg"))); // NOI18N
        jPanel1.add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        try {
            String cedula, nombre, apellido, telefono,direccion,correo,cargo,fechaing;
            cedula = txtCedula.getText();
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            telefono= txtTelefono.getText();
            direccion= txtDireccion.getText();
            correo= txtCorreo.getText();
            cargo= txtCargo.getText();
            fechaing = txtFechaIng1.getText();
           
            ArrayList<Usuario> personasActualizado;

            if (aux == 0) {

                Usuario p = new Usuario(cedula, nombre, apellido, telefono,direccion,correo,cargo,fechaing);
                p.guardar(salida);
                Helper.llenarTabla(tblTablaPersonas, ruta);
                txtNombre.setText("");
                txtCedula.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtDireccion.setText("");
                txtCorreo.setText("");
                txtCargo.setText("");
                txtFechaIng1.setText("");
                txtCedula.requestFocusInWindow();

            } else {
                personasActualizado = Helper.actualizarPersona(ruta, cedula, nombre, apellido,telefono,direccion,correo,cargo,fechaing);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, personasActualizado);
                Helper.llenarTabla(tblTablaPersonas, ruta);
                Helper.mensaje(this, "Datos actulizados exitosamente", "Correcto!", 1);

                limpiar();

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdGuardar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
       op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
        ArrayList<Usuario> personas = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaPersonas.getSelectedRow();
            personas.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, personas);
            Helper.llenarTabla(tblTablaPersonas, ruta);
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtCorreo.setText("");
            txtCargo.setText("");
            txtFechaIng1.setText("");
            txtCedula.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void tblTablaPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaPersonasMouseClicked
        int i;
        
        Usuario p;
        ArrayList<Usuario> personas = Helper.traerDatos(ruta);
        i = tblTablaPersonas.getSelectedRow();
        

        p = personas.get(i);
        
        

        txtCedula.setText(p.getCedula());
        txtNombre.setText(p.getNombre());
        txtApellido.setText(p.getApellido());
        txtTelefono.setText(p.getTelefono());
        txtDireccion.setText(p.getDireccion());
        txtCorreo.setText(p.getCorreo());
        txtCargo.setText(p.getCargo());
        txtFechaIng1.setText(p.getFechaIng());

    }//GEN-LAST:event_tblTablaPersonasMouseClicked

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtCargo.setText("");
        txtFechaIng1.setText("");

        txtCedula.requestFocusInWindow();
    
    }//GEN-LAST:event_cmdLimpiarActionPerformed
   
    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
     
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
     
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed
    
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void cmdPasardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPasardatosActionPerformed
     Principal ventana=new Principal();
     ventana.nombre=txtNombre.getText()+" "+txtApellido.getText();
     ventana.cedula=txtCedula.getText();
     ventana.direccion=txtDireccion.getText();
     ventana.telefono=txtTelefono.getText();
     ventana.correo=txtCorreo.getText();
     ventana.cargo=txtCargo.getText();
     ventana.fechaIng=txtFechaIng1.getText();
        this.dispose();       
     ventana.setVisible(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_cmdPasardatosActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
    String cedula;
      cedula = txtCedula.getText();
      
       if (Helper.buscarPorCedula(cedula, ruta)) {
            Usuario p = Helper.traerPersona(cedula, ruta);
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellido());
            txtTelefono.setText(p.getTelefono());
            txtDireccion.setText(p.getDireccion());
            txtCorreo.setText(p.getCorreo());
            txtCargo.setText(p.getCargo());
            
           
            aux = 1;
           
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
           
        }
        
            JButton botonesH[] = {cmdGuardar, cmdCancelar};
            JButton botonesD[] = {cmdBuscar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdBuscarActionPerformed
  public void limpiar() {
        txtNombre.setText("");
        txtCedula.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtCargo.setText("");
        txtFechaIng1.setText("");
        txtCedula.requestFocusInWindow();
        aux = 0;
  }
    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
      limpiar();
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdGuardar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          }     
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          }     
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
     
    }//GEN-LAST:event_txtNombreKeyTyped
      
    private void cmdCalcularFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularFechaActionPerformed
       String dia = Integer.toString(jDatefecha.getCalendar().get(Calendar.DAY_OF_MONTH));
       String mes = Integer.toString(jDatefecha.getCalendar().get(Calendar.MONTH)+1);
       String año = Integer.toString(jDatefecha.getCalendar().get(Calendar.YEAR));
       String fecha =(año + "/" + mes + "/" + dia);
       txtFechaIng1.setText(fecha);
    }//GEN-LAST:event_cmdCalcularFechaActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
     
    }//GEN-LAST:event_txtBusquedaKeyTyped
     
 
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCalcularFecha;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdPasardatos;
    private javax.swing.JComboBox<String> comboFiltro;
    private com.toedter.calendar.JDateChooser jDatefecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaPersonas;
    private javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaIng1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
