
package Grafico;
import Clases.Usuario;
import Controlador.controladorHibernate;
import Controlador.controladorUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Bloquear();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CTUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CTpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        CBtipo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Narkisim", 3, 36)); // NOI18N
        jLabel1.setText("Login");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Usuario");

        CTUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CTUser)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jLabel3))
                        .addComponent(CTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Usuario");

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Una Opcion---", "Coordinador", "Lider", "Instructor" }));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipoItemStateChanged
        if(CBtipo.getSelectedItem().equals("--Seleccione Una Opcion---")){
            CTUser.setEnabled(false);
            CTpassword.setEnabled(false);
            jLabel4.setEnabled(true);
        }else if(CBtipo.getSelectedItem().equals("Instructor")){    
            CTUser.setEnabled(false);
            CTpassword.setEnabled(true);
            jLabel4.setEnabled(true);
        }else{
            CTUser.setEnabled(true);
            CTpassword.setEnabled(true);
            jLabel4.setEnabled(true);
        }
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String User = CTUser.getText();
        
        int tipo = CBtipo.getSelectedIndex();
        String tip = (String)CBtipo.getSelectedItem();
        String pass2 = CTpassword.getText();
        boolean result = false;
        int aux=0;
        
        if(tip.equalsIgnoreCase("Instructor")){
            String sql = "FROM Usuario WHERE TipoUsuario = 'Instructor' AND Pass = '"+pass2+"'";
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            Usuario usuario2 = new Usuario();
            lista = controladorHibernate.devolverSQL(sql);
            for(Usuario item: lista){
                usuario2.setIdUsuarios(item.getIdUsuarios());
                usuario2.setNombres(item.getNombres());
            }
            seguimientoProfesor sP = new seguimientoProfesor(usuario2);
            sP.setVisible(true);
            dispose();
            tipo = 3;
            result = true;
            
        }
        
        if(tipo != 3){
                    String pass = CTpassword.getText();

                    String SQL = "";
                           SQL += "FROM Usuario Where User='"+User+"' and Pass='"+pass+"'";

                    result = controladorUsuario.validarUsuario(SQL);
                    aux=1;
                    System.out.println("Result = "+result);
                    
        }else{
            
                   
        }
        
        if(result == true){
            JOptionPane.showMessageDialog(rootPane, "Bienvenido "+User,"EnhoraBuena",JOptionPane.INFORMATION_MESSAGE);
            
            if(aux == 1){
                new Menu().setVisible(true);dispose();
            }else if(aux == 2){
                
            }
             
        }else{
            JOptionPane.showMessageDialog(rootPane, "Error usuario no encontrado","Error",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Bloquear(){
         CTUser.setEnabled(false);
         CTpassword.setEnabled(false);
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JTextField CTUser;
    private javax.swing.JPasswordField CTpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
