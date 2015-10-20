
package Grafico;

import Clases.Usuario;
import Controlador.controladorUsuario;
import Controlador.controladorHibernate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UIusuario extends javax.swing.JFrame {

    public DefaultTableModel model;
    public UIusuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTabla();
        ComboBox();
        esconderId();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tusuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CTbuscar = new javax.swing.JTextField();
        BTbuscar = new javax.swing.JButton();
        CBtipo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Usuarios Registrados"));

        Tusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tusuarios);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        CTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTbuscarKeyReleased(evt);
            }
        });

        BTbuscar.setText("Buscar");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Nombres", "Apellidos", "Tipo Usuario", "Estado" }));
        CBtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBtipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jButton2.setText("Recargar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
    int fila = Tusuarios.getSelectedRow();
    
    if(fila >= 0){
        
        
        
         
        miId(fila);
        
       
    }else{
        
        JOptionPane.showMessageDialog(null, "Por favor seleccione el usuario a actualizar" , "INFORMACION" , JOptionPane.INFORMATION_MESSAGE);
        
    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipoItemStateChanged
        if(CBtipo.getSelectedItem().equals("---Seleccione Una Opcion---")){
            CTbuscar.setEnabled(false);
            CTbuscar.setText("");
        }else{
            CTbuscar.setEnabled(true);
        }
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
       String Tipo = (String) CBtipo.getSelectedItem();
       String Buscar = CTbuscar.getText();
       if(!Buscar.equals("")){
            Buscar(Tipo, Buscar);
       }else{
           JOptionPane.showMessageDialog(null, "Registre un dato para buscar");
       }
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void CTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTbuscarKeyReleased
        try{
            String buscar = CTbuscar.getText();
            String tipo = (String)CBtipo.getSelectedItem();
            if(!buscar.equals("")){
                Buscar(tipo, buscar);
            }else{
                cargarTabla();
            }
        }catch(Exception ex){
            System.out.println("Error al buscar en la accion de escucha: "+ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_CTbuscarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        
        int fila = Tusuarios.getSelectedRow();
        
        
        if(fila >= 0){
        
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el usuario?", "Información" , JOptionPane.OK_CANCEL_OPTION);


                    System.out.println("Yes = "+confirm);

                    if(confirm == JOptionPane.YES_OPTION){

                        eliminar(fila);


                    }
             
        }
        
        
        
    }//GEN-LAST:event_EliminarActionPerformed
     
    public Integer delete;
    public void eliminar(int miFila){
    
        String borrar = model.getValueAt(miFila, 0).toString();
        
        delete = Integer.parseInt(borrar);
    
        Usuario u = new Usuario(delete);
    
        controladorHibernate.delete("Usuario", "idUsuarios", delete);
        model.removeRow(miFila);
        
        
    }
    
    
    public int idFinal;
    
    public String nombre, apellido,  correo , direccion, tipo;
    long telefono;
    
    public void miId(int fila){
        
        
        
        dispose();
        
        
        
  
        String id = model.getValueAt(fila ,0).toString();
        
        
        idFinal = Integer.parseInt(id);
        nombre = model.getValueAt(fila ,1).toString();
        apellido = model.getValueAt(fila ,2).toString();
        telefono = Long.parseLong(model.getValueAt(fila ,3).toString());
        correo = model.getValueAt(fila ,4).toString();
        direccion = model.getValueAt(fila ,5).toString();
        tipo = model.getValueAt(fila ,6).toString();
        
        
        
        
        
        Usuario usuario = new Usuario(idFinal, nombre, apellido, telefono, correo, direccion, tipo);
        ActualizarUsuario m = new ActualizarUsuario(usuario);
        m.setVisible(true);
        
        
       
        
    
    }
    
    public void cargarTabla(){
        
        try{
            
            String filas[][]={};
            String columnas[]={"idUsuario","Nombre","Apellido","Telefono","Correo","Direccion","Tipo de Usuario","User","Contraseña"};
            model = new DefaultTableModel(filas,columnas);
            Tusuarios.setModel(model);
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            lista = controladorHibernate.devolverTodo("Usuario");
            
            for(Usuario item: lista){
                model.addRow(item.arrayToVector());
            }
            
        }catch(Exception ex){
            System.out.println("Se encontro un error al buscar: "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public void ComboBox(){
        if(CBtipo.getSelectedItem().equals("---Seleccione Una Opcion---")){
            CTbuscar.setEnabled(false);
            CTbuscar.setText("");
        }
    }
    
    public void Buscar(String Tipo, String Buscar) {
        try {

            String filas[][] = {};
            String columnas[] = {"idUsuario", "Nombre", "Apellido", "Telefono", "Correo", "Direccion", "Tipo de Usuario", "User", "Contraseña"};
            model = new DefaultTableModel(filas, columnas);
            Tusuarios.setModel(model);

            List<Usuario> list;

            System.out.println("Voy a buscar");
            list = controladorHibernate.buscarLike("Usuario",Tipo,Buscar);
            System.out.println("Termine de buscar ingresar for each");
            for (Usuario item : list) {
                System.out.println("El item es: " + item);
                model.addRow(item.arrayToVector());
            }

        } catch (Exception ex) {
            System.out.println("Se encontro un error al buscar: " + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    
    public void esconderId(){
        Tusuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        Tusuarios.getColumnModel().getColumn(0).setMinWidth(0);
        Tusuarios.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIusuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JTextField CTbuscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable Tusuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
