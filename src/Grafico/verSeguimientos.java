
package Grafico;

import Clases.Contratos;
import Clases.Empresa;
import Clases.Seguimientos;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class verSeguimientos extends javax.swing.JFrame {

    Contratos contrato;
    int idContrato;
    public DefaultTableModel model;
    public DefaultComboBoxModel modelC;
    public verSeguimientos(Contratos contrato) {
        initComponents();       
        idContrato = contrato.getIdContratos();
        Hilo hilo = new Hilo(JLhora);
        cargarTabla();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tseguimientos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLhora = new javax.swing.JLabel();
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
        setFocusable(false);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Segumientos del Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        Tseguimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tseguimientos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel1.setText("Hora");

        JLhora.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(JLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    public void cargarTabla(){
        try{
            String filas[][]={};
            String columnas[]={"idSeguimientos","Numero","Fecha Seguimiento","Ciudad","Tipo Informe","Fecha Inicial Periodo","Fecha Final Periodo"};
            model = new DefaultTableModel(filas, columnas);
            Tseguimientos.setModel(model);

            ArrayList<Seguimientos> lista = new ArrayList<Seguimientos>();
            lista = controladorHibernate.devolverSinEstado("Seguimientos");
            for(Seguimientos item: lista){
                model.addRow(item.arrayToVector2());
                System.out.println("Psaso por el for");
            }
        }catch(Exception ex){
            System.out.println("Se genero un  exeption: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JTable Tseguimientos;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
