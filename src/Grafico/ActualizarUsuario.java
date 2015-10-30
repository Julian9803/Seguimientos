
package Grafico;

import javax.swing.JOptionPane;
import Controlador.controladorUsuario;

import Clases.Usuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class ActualizarUsuario extends javax.swing.JFrame {

    
    Usuario usuario;
    public ActualizarUsuario(Usuario usuario) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        llenaCampo();
        validarTXT(false);
        
        
        id = usuario.getIdUsuarios();
        
        
       String nombre = usuario.getNombres();
       String apellido = usuario.getApellidos();
       String telefono = String.valueOf(usuario.getTelefono());
       String correo = usuario.getCorreo();
       String direccion = usuario.getDireccion();
       String tipo = usuario.getTipoUsuario();
       String documento = String.valueOf(usuario.getNumeroDocumento());
       
       CTnombre.setText(nombre);
       CTapellido.setText(apellido);
       CTtelefono.setText(telefono);
       CTdocumento.setText(documento);
       CTcorreo.setText(correo);
       CTdireccion.setText(direccion);
       CBtipousuario.setSelectedItem(tipo);
       
    }
    
    int id;
    public void llenaCampo(){
        
 
        
          
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CTapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CTnombre = new javax.swing.JTextField();
        CTcorreo = new javax.swing.JTextField();
        CTdireccion = new javax.swing.JTextField();
        CTtelefono = new javax.swing.JTextField();
        CBtipousuario = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JLuser = new javax.swing.JLabel();
        JLpass = new javax.swing.JLabel();
        CTuser = new javax.swing.JTextField();
        CTpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        CTdocumento = new javax.swing.JTextField();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Actualizar Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        CTapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTapellidoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Direccion");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de usuario");

        CTnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTnombreKeyTyped(evt);
            }
        });

        CTcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTcorreoKeyTyped(evt);
            }
        });

        CTdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CTtelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTtelefonoKeyTyped(evt);
            }
        });

        CBtipousuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CBtipousuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Aprendiz", "Instructor", "Coordinador", "Lider" }));
        CBtipousuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBtipousuarioItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JLuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLuser.setText("User");

        JLpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLpass.setText("Contraseña");

        CTuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CTpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTpassActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Numero Documento");

        CTdocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(24, 24, 24)
                            .addComponent(CTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLuser, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLpass, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(24, 24, 24))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CTapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTdireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTtelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBtipousuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                .addComponent(CTuser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTpass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTdocumento, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTdocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBtipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLuser)
                    .addComponent(CTuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLpass)
                    .addComponent(CTpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        UIusuario us = new UIusuario();
        
        dispose();
        
        us.setVisible(true);
         
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean entrar = true;
        
        
        if((CBtipousuario.getSelectedItem().equals("Instructor"))||(CBtipousuario.getSelectedItem().equals("Aprendiz"))){
            if((CTapellido.getText().equals(""))||(CTcorreo.getText().equals(""))||(CTdireccion.getText().equals(""))||(CTnombre.getText().equals(""))||(CTtelefono.getText().equals(""))||(CBtipousuario.getSelectedItem().equals("Seleccione"))){

                entrar = false;
                JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos", "Informacion...", JOptionPane.WARNING_MESSAGE);

            }
        }
        
        if((CBtipousuario.getSelectedItem().equals("Coordinador"))||(CBtipousuario.getSelectedItem().equals("Lider"))){
            if((CTapellido.getText().equals(""))||(CTcorreo.getText().equals(""))||(CTdireccion.getText().equals(""))||(CTnombre.getText().equals(""))||(CTtelefono.getText().equals(""))||(CBtipousuario.getSelectedItem().equals("Seleccione"))||(CTuser.getText().equals(""))||(CTpass.getText().equals(""))){
            
            entrar = false;
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos", "Informacion...", JOptionPane.WARNING_MESSAGE);
            
            }
        }
        
        if(CBtipousuario.getSelectedItem().equals("Seleccione")){
            entrar = false;
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un usuario", "Informacion...", JOptionPane.WARNING_MESSAGE);
        }
        
        if(entrar){
            int confirm = JOptionPane.showConfirmDialog(null,"Desea actualizar el usuario" , "Actualizar" , JOptionPane.OK_CANCEL_OPTION);

            if(confirm ==  JOptionPane.OK_OPTION){

                actualizar();

            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBtipousuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipousuarioItemStateChanged
        String tipo = (String) CBtipousuario.getSelectedItem();
        

        if((tipo.equals("Lider"))||(tipo.equals("Coordinador"))){
            validarTXT(true);
        }else{
            validarTXT(false);
        }
        
    }//GEN-LAST:event_CBtipousuarioItemStateChanged

    private void CTpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTpassActionPerformed

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

    private void CTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTnombreKeyTyped
        int k=(int)evt.getKeyChar();
        
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
           CTnombre.transferFocus();
        }
    }//GEN-LAST:event_CTnombreKeyTyped

    private void CTapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTapellidoKeyTyped
        int k=(int)evt.getKeyChar();
        
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
           CTapellido.transferFocus();
        }
    }//GEN-LAST:event_CTapellidoKeyTyped

    private void CTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTtelefonoKeyTyped
        
         int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTtelefono.transferFocus();
        }
        
    }//GEN-LAST:event_CTtelefonoKeyTyped

    private void CTcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTcorreoKeyTyped
        
    }//GEN-LAST:event_CTcorreoKeyTyped

    
    
    private void actualizar(){
        
        String nombre = CTnombre.getText();
        String apellido = CTapellido.getText();
        long telefono =   Long.parseLong( CTtelefono.getText());
        long numeroDocumento = Long.parseLong(CTdocumento.getText());
        String correo = CTcorreo.getText();
        String direccion = CTdireccion.getText();
        String TipoUsuario = CBtipousuario.getSelectedItem().toString();
        
        Usuario usuario = new Usuario(id ,nombre, apellido, telefono, correo, direccion, TipoUsuario);
         
         
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        lista.add(usuario);
         
        int i = 0;
            try{
                for(Usuario item: lista){

                    if((item.equals(""))){
                        i=1;
                    }else{
                        i=2;
                         
                    }
                }
            }catch(Exception ex){
                System.out.println("Error: "+ex.getMessage());
            }
            
            if(i == 2){
                
                controladorUsuario.actualizarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "El usuario ha actualizado correctamente", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
                
                
            }else if(i == 1){
                JOptionPane.showMessageDialog(null, "Datos incompletos \n Por favor completar", "Datos incompletos", JOptionPane.INFORMATION_MESSAGE);
            }
            
           
            
            
        
        
    }
    
    
    
    public void validarTXT(boolean estado){
        
        CTuser.setVisible(estado);
        CTpass.setVisible(estado);
        JLpass.setVisible(estado);
        JLuser.setVisible(estado);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBtipousuario;
    private javax.swing.JTextField CTapellido;
    private javax.swing.JTextField CTcorreo;
    private javax.swing.JTextField CTdireccion;
    private javax.swing.JTextField CTdocumento;
    private javax.swing.JTextField CTnombre;
    private javax.swing.JPasswordField CTpass;
    private javax.swing.JTextField CTtelefono;
    private javax.swing.JTextField CTuser;
    private javax.swing.JLabel JLpass;
    private javax.swing.JLabel JLuser;
    private javax.swing.JCheckBoxMenuItem MnewUser;
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
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
