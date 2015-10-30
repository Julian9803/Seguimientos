
package Grafico;

import Clases.Contratos;
import Clases.Seguimientos;
import Clases.Usuario;
import Controlador.Hilo;
import Controlador.conexionReporte;
import Controlador.controladorHibernate;
import static Grafico.asignarContrato.diferenciaEnDias2;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class verContratos extends javax.swing.JFrame {

    public DefaultTableModel model;
    public verContratos() {
        initComponents();
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
        this.setLocationRelativeTo(null);
        cargarTablaContratos();
        cargarTxt();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tcontratos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CTbuscar = new javax.swing.JTextField();
        CBbuscar = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        CBtipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        JLBhora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTactualizar = new javax.swing.JButton();
        BTfinalizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BTVseguimientos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Contratos Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        Tcontratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Tcontratos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buscar Contratos Por");

        CTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTbuscarKeyReleased(evt);
            }
        });

        CBbuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Tipo de Contrato", "Programa", "Ficha" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Ver Contratos Por");

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Finalizado", "Todo" }));
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Hora");

        JLBhora.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(CBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(CBbuscar)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Acciones del Contrato"));

        BTactualizar.setText("Actualizar Contrato");
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });

        BTfinalizar.setText("Finalizar Contrato");
        BTfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTfinalizarActionPerformed(evt);
            }
        });

        jButton2.setText("Detallar Informacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(BTactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BTfinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informacion de Contratos"));

        jButton1.setText("Descargar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Asignar Seguimento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BTVseguimientos.setText("Ver Seguimientos");
        BTVseguimientos.setEnabled(false);
        BTVseguimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVseguimientosActionPerformed(evt);
            }
        });

        jButton4.setText("Reporte de Seguimientos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTVseguimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTVseguimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTbuscarKeyReleased
        String Buscar = CTbuscar.getText();
        String Tipo = (String) CBbuscar.getSelectedItem();
        if(Tipo.equals("Tipo de Contrato")){
            Tipo = "tipoContrato";
        }

        if(!Buscar.equals("")){
            buscarTabla(Tipo, Buscar);
        }else{
            cargarTablaContratos();
        }
    }//GEN-LAST:event_CTbuscarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = Tcontratos.getSelectedRow();
        
        if(fila != -1){
            Contratos contrato = new Contratos();
                    
            contrato.setIdContratos((Integer) Tcontratos.getValueAt(fila, 0));
            System.out.println("El id enviado es: "+contrato.getIdContratos());
            informacionContrato info = new informacionContrato(contrato);
            info.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Por favor seleccione un contrato¡¡","Informacion...",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipoItemStateChanged
       String seleccion = (String)CBtipo.getSelectedItem();
       
       if(seleccion.equals("Todo")){
           buscarTablaTodo();
       }else if(seleccion.equals("Activo")){
           buscarTablaEstado("Estado","Activo");
       }else if(seleccion.equals("Finalizado")){
           buscarTablaEstado("Estado","Finalizado");
       }
       
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
        
        int fila = Tcontratos.getSelectedRow();
        Contratos contrato = new Contratos();
        if(fila != -1){
            
            
            contrato.setIdContratos((Integer)Tcontratos.getValueAt(fila, 0));
            System.out.println("El id enviado es: "+contrato.getIdContratos());
            ActualizarContrato act = new ActualizarContrato(contrato);
            act.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un contrato para actualizar¡¡","Informacion....",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_BTactualizarActionPerformed

    private void BTfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTfinalizarActionPerformed
        int fila = Tcontratos.getSelectedRow();
        
        if(fila != -1){
            int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de fianlizar este contrato?","Confirmacion",JOptionPane.QUESTION_MESSAGE);
            if(opcion == JOptionPane.OK_OPTION){
               finalizarContrato(fila);
               System.out.println("Mensaje");
               cargarTablaContratos(); 
            }else{
                JOptionPane.showMessageDialog(rootPane, "Se cancelo el finalizamiento del contrato","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un contrato para finalizarlo","Error¡¡",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BTfinalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexionReporte conn = new conexionReporte();
        try {
            conn.conectar();
            String dire = "Reportes\\Contratos.jrxml";
            JasperReport reporteJasper = JasperCompileManager.compileReport(dire);
            JasperPrint mostrarReprote = JasperFillManager.fillReport(reporteJasper, null,conn.getConn());
            JasperViewer.viewReport(mostrarReprote);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte: "+e.getMessage());
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = Tcontratos.getSelectedRow();
        
        
        if(fila != -1){
            
            
            Date DCinicial = (Date) Tcontratos.getValueAt(fila, 5);
            Date DCfinal = (Date) Tcontratos.getValueAt(fila, 6);
            int dias= 0;    
            dias = diferenciaEnDias2(DCinicial,DCfinal);
            boolean entrar = false;
            System.out.println("El numero de dias es: "+dias);
            int meses = 0;
            if(dias>80&dias<95){
                meses = 3;
            }
            
            if(dias>175&dias<195){
                meses = 6;
            }
            System.out.println("El valor de meses es: "+meses);
            Contratos contrato = new Contratos();
            int idContrato = (Integer)Tcontratos.getValueAt(fila, 0);
            
            boolean entrarF = true;
            ArrayList<Seguimientos> lista = new ArrayList<Seguimientos>();
            if(meses == 3){
                System.out.println("Entre en el if de 3 meses");
                lista = controladorHibernate.devolverUnoID("Seguimientos", "idContratos", idContrato);
                for(Seguimientos item: lista){
                    entrarF = false;
                }
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos la duracion del contrato es de 3 meses, y ya tiene asignado un seguimiento","Informacion¡¡",JOptionPane.WARNING_MESSAGE);
            }
            int i =0;
            if(meses == 6){
                
                lista = controladorHibernate.devolverUnoID("Seguimientos", "idContratos", idContrato);
                for(Seguimientos item: lista){
                    i++;
                }
                System.out.println("Se repitio = "+i);
                
            }
            
            if(i == 2){
                entrarF = false;
                JOptionPane.showMessageDialog(rootPane, "El contrato alcanso el numero maximo de seguimientos, 2 por 6 meses", "Informacion¡¡", JOptionPane.WARNING_MESSAGE);
            }
            
            
            if(entrarF){
                contrato.setIdContratos(idContrato);
                AsignarSeguimiento as = new AsignarSeguimiento(contrato);
                as.setVisible(true);
            }
                                   
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un contrato para asignar un seguimiento","Informacion",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CBtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBtipoActionPerformed

    private void BTVseguimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVseguimientosActionPerformed
        int fila = Tcontratos.getSelectedRow();
        int idContrato =  (int) Tcontratos.getValueAt(fila, 0);
        
        Contratos contrato = new Contratos();
        contrato.setIdContratos(idContrato);
        verSeguimientos ver = new verSeguimientos(contrato);
        ver.setVisible(true);
                
        
    }//GEN-LAST:event_BTVseguimientosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        conexionReporte conn = new conexionReporte();
        try {
            conn.conectar();
            String dire = "E:\\Proyecto Seguimiento\\Seguimientos\\src\\Reportes\\Seguimiento.jrxml";
            JasperReport reporteJasper = JasperCompileManager.compileReport(dire);
            JasperPrint mostrarReprote = JasperFillManager.fillReport(reporteJasper, null,conn.getConn());
            JasperViewer.viewReport(mostrarReprote);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte: "+e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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

    public  int diferenciaEnDias2(Date fechaMayor, Date fechaMenor) {
       
        long mayor = fechaMayor.getTime();
        long menor = fechaMenor.getTime();
        long diferenciaEn_ms = menor - mayor;
        long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
        return (int) dias;
    }
   
    public void esconderId(){
        Tcontratos.getColumnModel().getColumn(0).setMaxWidth(0);
        Tcontratos.getColumnModel().getColumn(0).setMinWidth(0);
        Tcontratos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    
    public void cargarTablaContratos(){
        try{
            
            String filas[][]={};
            String columnas[]={"idContratos","Empresa","Aprendiz","Jefe Inmediato","Cargo Jefe","Fecha Inicial","Fecha Final","Sede","Tipo Contrato","Programa","Ficha","Estado del Contrato"};
            model = new DefaultTableModel(filas, columnas);
            Tcontratos.setModel(model);
            
            ArrayList<Contratos> lista = new ArrayList<Contratos>();
            lista = controladorHibernate.devolverTodo("Contratos");
            
            //ArrayList<Contratos> empresas = (ArrayList<Contratos>) controladorHibernate.Query("SELECT C FROM Contratos C");
       
            
            for(Contratos item: lista){
                model.addRow(item.arrayToVector());
            }   
            
        }catch(Exception ex){
            System.out.println("Error al cargar la tabla: "+ex.getMessage());
            ex.printStackTrace();
        }
        //esconderId();
    }
    
    public void buscarTablaTodo(){
        String filas[][]={};
        String columnas[]={"idContratos","Empresa","Aprendiz","Jefe Inmediato","Cargo Jefe","Fecha Inicial","Fecha Final","Sede","Tipo Contrato","Programa","Ficha","Estado del Contrato"};
        model = new DefaultTableModel(filas, columnas);
        Tcontratos.setModel(model);
        List<Contratos> lista;
        
        lista = controladorHibernate.devolverSinEstado("Contratos");
        
        for(Contratos item: lista){
            model.addRow(item.arrayToVector());
        }
        
        esconderId();
        
    }
    
    public void buscarTablaEstado(String Campo, String Buscar){
        String filas[][]={};
        String columnas[]={"idContratos","Empresa","Aprendiz","Jefe Inmediato","Cargo Jefe","Fecha Inicial","Fecha Final","Sede","Tipo Contrato","Programa","Ficha","Estado del Contrato"};
        model = new DefaultTableModel(filas, columnas);
        Tcontratos.setModel(model);
        List<Contratos> lista;
        
        lista = controladorHibernate.devolverCampo("Contratos", Campo, Buscar);
        
        for(Contratos item: lista){
            model.addRow(item.arrayToVector());
        }
        esconderId();
    }
    
    public void buscarTabla(String Campo, String Buscar){
        String filas[][]={};
        String columnas[]={"idContratos","Empresa","Aprendiz","Jefe Inmediato","Cargo Jefe","Fecha Inicial","Fecha Final","Sede","Tipo Contrato","Programa","Ficha","Estado del Contrato"};
        model = new DefaultTableModel(filas, columnas);
        Tcontratos.setModel(model);
        List<Contratos> lista;
        
        lista = controladorHibernate.buscarLike("Contratos", Campo, Buscar);
        
        for(Contratos item: lista){
            model.addRow(item.arrayToVector());
        }
        esconderId();
    }
    
    public void finalizarContrato(int miFila){
        
        int idContrato = (Integer) Tcontratos.getValueAt(miFila, 0);
        
        controladorHibernate.delete("Contratos", "idContratos", idContrato);
        model.removeRow(miFila);
        
    }
    
    public void cargarTxt(){
        
        Tcontratos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
            public void valueChanged(ListSelectionEvent e){
                int fila = Tcontratos.getSelectedRow();
                if(fila > -1){
                    BTVseguimientos.setEnabled(true);
                    
                }else{
                    BTVseguimientos.setEnabled(false);
                }
                    
            }
            
        });
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTVseguimientos;
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton BTfinalizar;
    private javax.swing.JComboBox CBbuscar;
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JTextField CTbuscar;
    private javax.swing.JLabel JLBhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JTable Tcontratos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
