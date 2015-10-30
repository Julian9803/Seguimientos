
package Grafico;

import Clases.Contratos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Clases.Usuario;
import Clases.Empresa;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import static Grafico.UIusuario.diferenciaEnDias2;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class asignarContrato extends javax.swing.JFrame {

    public DefaultComboBoxModel model;
    public asignarContrato() {
        initComponents();
        this.setLocationRelativeTo(null);
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
        ComboBoxAprendiz();
        ComboBoxEmpresa();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBempresa = new javax.swing.JComboBox();
        CTestudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBaprendiz = new javax.swing.JComboBox();
        CTinstructor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CTjefe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CTcargojefe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CTsede = new javax.swing.JTextField();
        CBcontrato = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        CTprograma = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CTficha = new javax.swing.JTextField();
        BTregistrar = new javax.swing.JButton();
        BTlimpiar = new javax.swing.JButton();
        DCinicial = new com.toedter.calendar.JDateChooser();
        DCfinal = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
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

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Crear Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Shonar Bangla", 3, 36)); // NOI18N
        jLabel1.setText("Asignar Contrato");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Empresa");

        CBempresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Empresa---" }));

        CTestudiante.setText("Buscar....");
        CTestudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTestudianteMouseClicked(evt);
            }
        });
        CTestudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTestudianteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTestudianteKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Aprendiz");

        CBaprendiz.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Un Aprendiz---" }));

        CTinstructor.setText("Buscar...");
        CTinstructor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTinstructorMouseClicked(evt);
            }
        });
        CTinstructor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTinstructorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTinstructorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Jefe Inmediato");

        CTjefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTjefeKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Cargo Jefe");

        CTcargojefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTcargojefeKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Fecha Inicial");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Fecha Final");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Sede");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Tipo Contrato");

        CTsede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTsedeKeyTyped(evt);
            }
        });

        CBcontrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Contrato de Aprendizaje", "Vinculación Laboral o Contractua", "Proyecto Productivo", "Unidad Productiva Familiar", "Empresas del Estado", "ONG y Sin Animo de Lucro", "Monitorias", "Pasantias" }));
        CBcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBcontratoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Programa");

        CTprograma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTprogramaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Ficha");

        CTficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTfichaKeyTyped(evt);
            }
        });

        BTregistrar.setText("Registrar");
        BTregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregistrarActionPerformed(evt);
            }
        });

        BTlimpiar.setText("Limpiar");
        BTlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimpiarActionPerformed(evt);
            }
        });

        jLabel12.setText("Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBempresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBaprendiz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CTjefe)
                                    .addComponent(CTcargojefe, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTestudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(CTinstructor)
                            .addComponent(CTprograma))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CTsede, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(DCinicial, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                                .addComponent(DCfinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(CTficha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(BTlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DCinicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(CBempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CTestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CTjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(CTsede, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CTinstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(71, 71, 71)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CTcargojefe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(CBcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTprograma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(CTficha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))))
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
        jMenu2.setText("Seguimientos");

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
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBcontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBcontratoActionPerformed

    private void BTregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregistrarActionPerformed
        boolean entrar1 = true;
        
        if((CTcargojefe.getText().equals(""))||(CTestudiante.getText().equals(""))||(CTficha.getText().equals(""))||(CTinstructor.getText().equals(""))||(CTjefe.getText().equals(""))||(CTprograma.getText().equals(""))||(CTsede.getText().equals(""))||(CBaprendiz.getSelectedItem().equals("--Seleccione Un Aprendiz--"))||(CBaprendiz.getSelectedItem().equals("No hay aprendis con ese nombre"))||(CBempresa.getSelectedItem().equals("---Seleccione una Empresa---"))||(CBempresa.getSelectedItem().equals("No hay registro de empresas"))||(CBcontrato.getSelectedItem().equals("---Seleccione Una Opcion---"))){
            entrar1 = false;
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos", "Informacion...", JOptionPane.WARNING_MESSAGE);            
        }
        
        if(entrar1){
        
            int dias= 0;    
            dias = diferenciaEnDias2(DCinicial.getDate(), DCfinal.getDate());
            boolean entrar = false;
            System.out.println("El numero de dias es: "+dias);
            if((dias>80&dias<95)||(dias>172&dias<185)){
                entrar = true;
            }else{
                entrar = false;
            }
            Date fechaI = DCinicial.getDate();
            Date fechaF = DCfinal.getDate();

            System.out.println("Entrar: "+entrar);
            if(entrar){ 
                int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de registrar este contrato?","Confirmacion¡¡",JOptionPane.OK_CANCEL_OPTION);

                if(opcion == JOptionPane.OK_OPTION){
                    registrar();       
                    JOptionPane.showMessageDialog(null,"Se registro el nuevo contrato correctamente","Informacion¡¡",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Por favor verifique que el contrato dure 3 meses o 6 meses....", "Error¡¡", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTregistrarActionPerformed

    private void CTestudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTestudianteKeyReleased
        String Buscar = CTestudiante.getText();
        if(!Buscar.equals("")){
            comboBoxBuscarEmpresa("Empresa","Razon_Social",Buscar);
        }else{
            ComboBoxEmpresa();
        }
    }//GEN-LAST:event_CTestudianteKeyReleased

    private void CTestudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTestudianteMouseClicked
        CTestudiante.setText("");
    }//GEN-LAST:event_CTestudianteMouseClicked

    private void CTinstructorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTinstructorKeyReleased
        String Buscar = CTinstructor.getText();
        
        if(!Buscar.equals("")){
            ComboBoxBuscarAprendiz("Usuario", "Nombres", Buscar);
        }else{
            ComboBoxAprendiz();
        }
    }//GEN-LAST:event_CTinstructorKeyReleased

    private void CTinstructorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTinstructorMouseClicked
        CTinstructor.setText("");        
    }//GEN-LAST:event_CTinstructorMouseClicked

    private void CTestudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTestudianteKeyTyped
         int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTestudiante.transferFocus();
        }
    }//GEN-LAST:event_CTestudianteKeyTyped

    private void CTinstructorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTinstructorKeyTyped
         int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTinstructor .transferFocus();
        }
    }//GEN-LAST:event_CTinstructorKeyTyped

    private void CTjefeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTjefeKeyTyped
        int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTjefe.transferFocus();
        }
    }//GEN-LAST:event_CTjefeKeyTyped

    private void CTcargojefeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTcargojefeKeyTyped
        int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTcargojefe.transferFocus();
        }
    }//GEN-LAST:event_CTcargojefeKeyTyped

    private void CTsedeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTsedeKeyTyped
        int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTsede.transferFocus();
        }
    }//GEN-LAST:event_CTsedeKeyTyped

    private void CTprogramaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTprogramaKeyTyped
        int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTprograma.transferFocus();
        }
    }//GEN-LAST:event_CTprogramaKeyTyped

    private void CTfichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTfichaKeyTyped
        int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTficha.transferFocus();
        }
    }//GEN-LAST:event_CTfichaKeyTyped

    private void BTlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_BTlimpiarActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        new Login().setVisible(true); dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
    private void limpiar(){
        
        CBempresa.setSelectedIndex(0);
        CBaprendiz.setSelectedIndex(0);
        CTjefe.setText("");
        CTcargojefe.setText("");
        CTprograma.setText("");
        CTficha.setText("");
        CBcontrato.setSelectedIndex(0);
        CTsede.setText("");
       
        
        
    } 
    
    
    
    
    
    
    
    
    public String Nombre(){
        String jul = (String)CBaprendiz.getSelectedItem();
        char[] pas = jul.toCharArray();
        String Nombre = "";
        char aux;
        for(int i = 0; i<pas.length; i++){
            aux = pas[i];
            if(aux=='-'){
                System.out.println("Inicio apellido");
                return Nombre;
            }else{
                Nombre += pas[i];
                
            }
        }
        return "Sin nombre";
    }
    
    public String apellido(){
        String jul = (String)CBaprendiz.getSelectedItem();
        char[] pas = jul.toCharArray();
        String Nombre = "";
        char aux;
        int p = 0;
        for(int i = 0; i<pas.length; i++){
            aux = pas[i];
            if(p == 1){                
                Nombre += pas[i];                
            }
            if(aux=='-'){
                p = 1;
            }
            
        }
        return Nombre;
    }
    
    //Cargar combo box
    public static int diferenciaEnDias2(Date fechaMayor, Date fechaMenor) {

        long mayor = fechaMayor.getTime();
        long menor = fechaMenor.getTime();
        long diferenciaEn_ms = menor - mayor;
        long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
        return (int) dias;

    }
    public void ComboBoxEmpresa(){
       String fila[]={};
       model = new DefaultComboBoxModel(fila);
       CBempresa.setModel(model);
       CBempresa.addItem("---Seleccione una Empresa---");
       ArrayList<Empresa> lista = new ArrayList<Empresa>();
       lista = controladorHibernate.devolverTodo("Empresa");
       
       int tama = lista.size();
       System.out.println("El numero de item es: "+tama);
       
       if(tama != 0){
           for(Empresa item: lista){
               CBempresa.addItem(item.getRazonSocial());
           }
       }else{
           CBempresa.addItem("No hay registro de empresas");
       }
       
       
   }    
    public void comboBoxBuscarEmpresa(String Tabla, String Tipo,String Buscar){
        List<Empresa> list;
        list = controladorHibernate.buscarLike(Tabla, Tipo, Buscar);
        String fila[]={};
        model = new DefaultComboBoxModel(fila);
        CBempresa.setModel(model);
        
        
        

        int tama = list.size();
        System.out.println("El numero de item es: "+tama);

        if(tama != 0){
            for(Empresa item: list){
                CBempresa.addItem(item.getRazonSocial());
            }
        }else{
            CBempresa.addItem("No hay registro de empresas");
        }
        
    }
    
    public void ComboBoxAprendiz(){
       String fila[]={};
       model = new DefaultComboBoxModel(fila);
       CBaprendiz.setModel(model);
       CBaprendiz.addItem("--Seleccione Un Aprendiz--");
       
       ArrayList<Usuario> lista = new ArrayList<Usuario>();
       
       lista = controladorHibernate.devolverTodoTipo("Usuario","Aprendiz");
       
       int tama = lista.size();
       System.out.println("El numero de item es: "+tama);
       
       if(tama != 0){
            for(Usuario item: lista){
                CBaprendiz.addItem(item.getNombres() +"-"+ item.getApellidos() );
            }   
       }else{
           CBempresa.addItem("No hay registro de aprendises");
       }
       
         
             
   }
    public void ComboBoxBuscarAprendiz(String Tabla, String Tipo, String Buscar){
        List<Usuario> list;
        list = controladorHibernate.buscarLikeTipo(Tabla, Tipo, Buscar, "TipoUsuario");
        String fila[]={};
        model = new DefaultComboBoxModel(fila);
        CBaprendiz.setModel(model);
        
        int tama = list.size();
        System.out.println("El numero de item es: "+tama);
       
        if(tama != 0){
            for(Usuario item: list){
                CBaprendiz.addItem(item.getNombres()+"-"+ item.getApellidos());
            }   
        }else{
           CBaprendiz.addItem("No hay aprendis con ese nombre");
        }
        
        
        
        
    }
    
    //Metodos Registrar
    
    public void registrar(){
        Empresa empresa = new Empresa();
        Usuario usuario = new Usuario();
        
        
        //empresa.setIdEmpresa((Integer)CBempresa.getSelectedItem());
        //usuario.setIdUsuarios((Integer)CBaprendiz.getSelectedItem());  
        String Nombre = Nombre();
        String Apellido = apellido();
        
        
        String BuscarE = (String) CBempresa.getSelectedItem();
        ArrayList<Empresa> lista = new ArrayList<Empresa>();
        lista = controladorHibernate.devolverCampo("Empresa", "Razon_Social", BuscarE);
        int idE = 0;
        for(Empresa item: lista){
            idE = item.getIdEmpresa();
        }
        
        empresa.setIdEmpresa(idE);
        
        String BuscarU = (String) CBaprendiz.getSelectedItem();
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        String SQL = "FROM Usuario WHERE Nombres ='"+Nombre+"' AND Apellidos = '"+Apellido+"' AND Estado = 'Activo'";
                System.out.println("El SQL de Usuarios es: "+SQL);
        listaU = controladorHibernate.devolverSQL(SQL);
        int idU = 0;
        for(Usuario item: listaU){
            idU = item.getIdUsuarios();
        }
                       
        usuario.setIdUsuarios(idU);
        String jefeInmediato = CTjefe.getText();
        String cargoJefe = CTcargojefe.getText();
        Date fechaInicial = DCinicial.getDate();
        Date fechaFinal = DCfinal.getDate();
        String sede = CTsede.getText();
        String tipoContrato = (String)CBcontrato.getSelectedItem();
        String programa = CTprograma.getText();
        int ficha = Integer.parseInt(CTficha.getText());
        String estado = "Activo";
        
        try{
            Contratos contrato = new Contratos(empresa, usuario, jefeInmediato, cargoJefe, fechaInicial, fechaFinal, sede, tipoContrato, programa, ficha, estado);
            controladorHibernate.insertarObjecto(contrato);
            System.out.println("Guarde correctamente");
        }catch(Exception ex){
            System.out.println("Error al guardar: "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asignarContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTlimpiar;
    private javax.swing.JButton BTregistrar;
    private javax.swing.JComboBox CBaprendiz;
    private javax.swing.JComboBox CBcontrato;
    private javax.swing.JComboBox CBempresa;
    private javax.swing.JTextField CTcargojefe;
    private javax.swing.JTextField CTestudiante;
    private javax.swing.JTextField CTficha;
    private javax.swing.JTextField CTinstructor;
    private javax.swing.JTextField CTjefe;
    private javax.swing.JTextField CTprograma;
    private javax.swing.JTextField CTsede;
    private com.toedter.calendar.JDateChooser DCfinal;
    private com.toedter.calendar.JDateChooser DCinicial;
    private javax.swing.JLabel JLBhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
