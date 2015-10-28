/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import javax.swing.JOptionPane;
import Controlador.controladorUsuario;
import Clases.Usuario;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import java.io.Serializable;
import java.util.ArrayList;

public class NuevoUsuario extends javax.swing.JFrame {

    
    public NuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
        boolean a = false;
        ocultar(a);
    }
    
    
    private void ocultar(boolean a){
        
        userl.setVisible(a);
        passl.setVisible(a);
        textUser.setVisible(a);
        textPassword.setVisible(a);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JLabel();
        userl = new javax.swing.JLabel();
        passl = new javax.swing.JLabel();
        textNombe = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        CBtipo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        JLBhora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        MnewUser = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Telefono");

        jLabel5.setText("Correo");

        jLabel6.setText("Direccion");

        TipoUsuario.setText("Tipo Usuario");

        userl.setText("User");

        passl.setText("Password");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Una Opcion---", "Aprendiz", "Coordinador", "Instructor", "Lider" }));
        CBtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBtipoItemStateChanged(evt);
            }
        });
        CBtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBtipoActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(textTelefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNombe)
                                    .addComponent(textApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(textDireccion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TipoUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userl)
                                            .addComponent(passl))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textUser)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7))
                    .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(TipoUsuario))
                                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userl))
                                .addGap(7, 7, 7)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passl)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/city8.png"))); // NOI18N
        jMenu6.setText("Empresa");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buildings8.png"))); // NOI18N
        jMenuItem3.setText("Ver empresas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenu1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/documents7.png"))); // NOI18N
        jMenu4.setText("Contratos");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/write61.png"))); // NOI18N
        jMenuItem2.setText("Contratos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Nuevo Contrato");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pages.png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem1);

        jMenu1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/multiple25.png"))); // NOI18N
        jMenu3.setText("Usuarios");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/group2.png"))); // NOI18N
        jMenuItem4.setText("Ver Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        MnewUser.setSelected(true);
        MnewUser.setText("Nuevo Usuario");
        MnewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user91.png"))); // NOI18N
        MnewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnewUserActionPerformed(evt);
            }
        });
        jMenu3.add(MnewUser);

        jMenu1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Seguimientos.png"))); // NOI18N
        jMenu2.setText("Segumientos");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver Seguimientos.png"))); // NOI18N
        jMenuItem5.setText("Ver Seguimientos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu1.add(jMenu2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/close6.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Esta Seguro de registrar este usuario","Confirmacion",JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            
            String Nombre = textNombe.getText();
            String Apellido = textApellido.getText();
            long Telefono = 0;
            try{
            String Telefono1 =textTelefono.getText();
            
            Telefono = Long.parseLong(Telefono1);
            
            }catch(Exception es){
                
                System.out.println("Error long: "+es.getMessage());
            }
            
            
            String Correo = textCorreo.getText();
            String Direccion = textDireccion.getText();
            String TipoUsuario = (String)CBtipo.getSelectedItem();
            String User = textUser.getText();
            String Pass = textPassword.getText();
            String Estado="Activo";
            
            
            Usuario usuario = new Usuario(Nombre, Apellido, Telefono, Correo, Direccion, TipoUsuario, User, Pass, Estado);
            
            
            controladorHibernate.insertarObjecto(usuario);
            System.out.println("Pase :D");
            
            JOptionPane.showMessageDialog(null, "El registro se \n realizo correctamente","Informacion¡¡",JOptionPane.INFORMATION_MESSAGE);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Se cancelo el registro","Informacion¡¡",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtipoActionPerformed

    }//GEN-LAST:event_CBtipoActionPerformed

    private void CBtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipoItemStateChanged
         
        int m = CBtipo.getSelectedIndex();
        
        if(m == 0 || m == 1){
            
            boolean a = false;
            ocultar(a);
            
        }else{
            
            boolean a = true;
            ocultar(a);
            
            
        }
        
        if(m == 3){
            textUser.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        new UIEmpresa().setVisible(true);dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new verContratos().setVisible(true);dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        new asignarContrato().setVisible(true);dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new UIusuario().setVisible(true);dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MnewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnewUserActionPerformed
        new NuevoUsuario().setVisible(true);dispose();
    }//GEN-LAST:event_MnewUserActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new totalSeguimientos().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
    
    private void limpiar(){
        
        textNombe.setText("");
        textApellido.setText("");
        textTelefono.setText("");
        textCorreo.setText("");
        
        textDireccion.setText("");
        
        CBtipo.setSelectedIndex(0);
        
        textUser.setText("");
        textPassword.setText("");
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JLabel JLBhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JLabel TipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passl;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textNombe;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textUser;
    private javax.swing.JLabel userl;
    // End of variables declaration//GEN-END:variables
}
