
package Grafico;

import Clases.Empresa;
import Clases.Usuario;
import Controlador.Hilo;
import Controlador.conexionReporte;
import Controlador.controladorHibernate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controlador.controladorEmpresa;
import Controlador.controladorHibernate;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;




public class UIEmpresa extends javax.swing.JFrame {

    private DefaultTableModel model;
    Usuario usuario = new Usuario();
    public UIEmpresa() {
        initComponents();
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
        cargarTabla();
        CTBuscar();
        cargarTxtEmpresa();
        this.setLocationRelativeTo(null);
    }

    
    private void actualizar(){
        
        int fila = Tempresas.getSelectedRow();
        
        
        String a = model.getValueAt(fila, 0).toString();
        
        int actualizar =  Integer.parseInt(a)  ;
        
        
        String razonsocial = CTrazon.getText();
        String direccion = CTdireccion.getText();
        long nit = Long.parseLong(CTnit.getText());
        long telefono =   Long.parseLong( CTtelefono.getText());
        
        String email = CTemail.getText();
 
         Empresa empresa = new Empresa(actualizar, razonsocial, direccion, nit, telefono, email, "Activo");
         
         
         ArrayList<Empresa> lista = new ArrayList<Empresa>();
         lista.add(empresa);
         
         int i = 0;
            try{
                for(Empresa item: lista){

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
                
                
            }else if(i == 1){
                JOptionPane.showMessageDialog(null, "Datos incompletos \n Por favor completar", "Datos incompletos", JOptionPane.INFORMATION_MESSAGE);
            }
            
           
            
            controladorEmpresa.actualizarEmpresa(empresa);
            
            
      JOptionPane.showMessageDialog(null, "Ha actualizado correctamente", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
      
      cargarTabla();
        
        
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tempresas = new javax.swing.JTable();
        BTdeshabilitar = new javax.swing.JButton();
        CBtipo = new javax.swing.JComboBox();
        CTbuscar = new javax.swing.JTextField();
        BTbuscar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CTrazon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CTdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CTnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CTtelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CTemail = new javax.swing.JTextField();
        BTactualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CTNrazon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CTNDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CTNnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CTNtelefono = new javax.swing.JTextField();
        CTNemail = new javax.swing.JTextField();
        BTregistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TEinhablitadas = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresas");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Empresas Registradas"));

        Tempresas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tempresas);

        BTdeshabilitar.setText("DESHABILITAR");
        BTdeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdeshabilitarActionPerformed(evt);
            }
        });

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Nit", "Razon Social" }));
        CBtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBtipoItemStateChanged(evt);
            }
        });

        CTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTbuscarActionPerformed(evt);
            }
        });
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
        BTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BTbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BTdeshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTdeshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ver / Actualizar", jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Actualizar Informacion"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Informacion Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Razon Social");

        CTrazon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTrazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTrazonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Direccion");

        CTdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NIT");

        CTnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTnitKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");

        CTtelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTtelefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        CTemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BTactualizar.setText("Actualizar");
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Reporte de Empresas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CTdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(CTrazon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTemail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(74, 74, 74))
                    .addComponent(jLabel1))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTnit)
                            .addComponent(CTtelefono)
                            .addComponent(BTactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CTrazon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(CTnit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(CTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(BTactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Actualizar Empresa", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );

        jTabbedPane1.addTab("Empresa", jPanel2);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Nyala", 3, 30)); // NOI18N
        jLabel7.setText("Registrar Empresa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Razon Social");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Direccion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nit");

        CTNnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTNnitActionPerformed(evt);
            }
        });
        CTNnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTNnitKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telefono");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Email");

        CTNtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTNtelefonoKeyTyped(evt);
            }
        });

        BTregistrar.setText("Registrar");
        BTregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregistrarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CTNnit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(CTNDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTNrazon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTNtelefono, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12)
                        .addGap(89, 89, 89)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CTNemail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CTNrazon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTNemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CTNDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTNnit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTNtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nueva Empresa", jPanel5);

        TEinhablitadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TEinhablitadas);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Empresas que se encuentran inhablitadas");

        jButton3.setText("Habilitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Empresas Inhabilitadas", jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Hora");

        JLBhora.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(42, 42, 42)
                .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
        cargarTabla();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregistrarActionPerformed
        boolean entrar = true;
        
        if((CTNDireccion.getText().equals(""))||(CTNemail.getText().equals(""))||(CTNnit.getText().equals(""))||(CTNrazon.getText().equals(""))||(CTNtelefono.getText().equals(""))){
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos", "Informacion...", JOptionPane.WARNING_MESSAGE);
            entrar = false;
        }
        
        int bus = Integer.parseInt(CTNnit.getText());
        ArrayList<Empresa> list = new ArrayList<Empresa>();
        list = controladorHibernate.devolverSQL("FROM Empresa WHERE Nit = "+bus+" ");
        
        for(Empresa item: list){
            entrar = false;
            JOptionPane.showMessageDialog(rootPane, "Lo sentimos una empresa ya se encuentra registrada con este NIT", "Error....", JOptionPane.WARNING_MESSAGE);
            String estado =item.getEstado();
            if(estado.equals("Inactivo")){
                int opc = JOptionPane.showConfirmDialog(rootPane, "Esta empresa se encuentra inhabilitada desea recuperarla?", "Informacion¡¡", JOptionPane.OK_CANCEL_OPTION);
                if(opc==JOptionPane.OK_OPTION){
                    controladorHibernate.Recuperar("Empresa", "idEmpresa", item.getIdEmpresa());
                    JOptionPane.showMessageDialog(rootPane, "La empresa se a recuperado satisfactoriamente", "Informacion...", JOptionPane.INFORMATION_MESSAGE);
                    cargarTabla();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se recupero la empresa", "Informacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(entrar){
            int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de registrar?", "Confirmacion", JOptionPane.OK_CANCEL_OPTION);
            boolean Entrar = true;



            if((opcion == JOptionPane.OK_OPTION)&&(Entrar)){

                String razonSocial = CTNrazon.getText();
                String direcion = CTNDireccion.getText();
                long Nit = Long.parseLong(CTNnit.getText());
                long telefono = Long.parseLong(CTNtelefono.getText());
                String email = CTNemail.getText();
                String estado = "Activo";

                Empresa empresa = new Empresa(razonSocial, direcion, Nit, telefono, email, estado);
                controladorHibernate.insertarObjecto(empresa);
                JOptionPane.showMessageDialog(null, "Se registro la nueva empresa satisfactoriamente","Informacion¡¡",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                cargarTabla();

            }else{
                JOptionPane.showMessageDialog(null, "Se cancelo el registro correctamente","Informacion¡¡",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTregistrarActionPerformed

    private void CTNnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTNnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTNnitActionPerformed

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
        
        boolean entrar = true;
        
        if((CTdireccion.getText().equals(""))||(CTemail.getText().equals(""))||(CTnit.getText().equals(""))||(CTrazon.getText().equals(""))||(CTtelefono.getText().equals(""))){
            JOptionPane.showMessageDialog(rootPane, "Por favor complete los campos", "Informacion...", JOptionPane.WARNING_MESSAGE);
            entrar = false;
        }
        
        if(entrar){
            actualizar();
        }

    }//GEN-LAST:event_BTactualizarActionPerformed

    private void BTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTbuscarKeyReleased

    }//GEN-LAST:event_BTbuscarKeyReleased

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed

    }//GEN-LAST:event_BTbuscarActionPerformed

    private void CTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTbuscarKeyReleased
        String Buscar = CTbuscar.getText();
        String Tipo = (String)CBtipo.getSelectedItem();

        if(Tipo.equals("Razon Social")){
            Tipo = "Razon_Social";
        }

        if(!Buscar.equals("")){
            buscarLike(Tipo, Buscar);
        }else{
            cargarTabla();
        }
    }//GEN-LAST:event_CTbuscarKeyReleased

    private void CTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTbuscarActionPerformed

    }//GEN-LAST:event_CTbuscarActionPerformed

    private void CBtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBtipoItemStateChanged
        if(CBtipo.getSelectedItem().equals("---Seleccione Una Opcion---")){
            CTbuscar.setEnabled(false);
            CTbuscar.setText("");
        }else{
            CTbuscar.setEnabled(true);
        }
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void BTdeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdeshabilitarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de deshabilitar esta empresa","Confimarcion¡¡",JOptionPane.OK_CANCEL_OPTION);
        if(opcion==JOptionPane.OK_OPTION){
            int fila =  Tempresas.getSelectedRow();
            int id = (Integer)Tempresas.getValueAt(fila,0);
            
            Empresa m = new Empresa();
            
            m.setIdEmpresa(id);
            
            controladorEmpresa.eliminarEmpresa(m);
            cargarTabla();
            cargarTablaInhabilitada();
            
        }
    }//GEN-LAST:event_BTdeshabilitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexionReporte conn = new conexionReporte();
        try {
            conn.conectar();
            String dire = "E:\\Proyecto Seguimiento\\Seguimientos\\src\\Reportes\\Empresas.jrxml";
            JasperReport reporteJasper = JasperCompileManager.compileReport(dire);
            JasperPrint mostrarReprote = JasperFillManager.fillReport(reporteJasper, null,conn.getConn());
            JasperViewer.viewReport(mostrarReprote);
        } catch (Exception e) {
            System.out.println("Error al generar el reporte: "+e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int Fila = TEinhablitadas.getSelectedRow();
            int id = (Integer) TEinhablitadas.getValueAt(Fila, 0);
            controladorHibernate.Recuperar("Empresa", "idEmpresa", id);
            JOptionPane.showMessageDialog(rootPane, "La empresa se a recuperado satisfactoriamente", "Informacion...", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
            cargarTablaInhabilitada();

        } catch (Exception ex) {
            System.out.println("Error al activar una empresa " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Lo sentimos no se pudo habilitar la empresa", "Error...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void CTrazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTrazonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTrazonActionPerformed

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

    private void CTnitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTnitKeyTyped
        int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
           CTnit.transferFocus();
        }
    }//GEN-LAST:event_CTnitKeyTyped

    private void CTNnitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTNnitKeyTyped
       int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
           CTNnit.transferFocus();
        }
    }//GEN-LAST:event_CTNnitKeyTyped

    private void CTNtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTNtelefonoKeyTyped
        int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
           CTNtelefono.transferFocus();
        }
    }//GEN-LAST:event_CTNtelefonoKeyTyped
    
    private void cargarTablaInhabilitada(){
        String filas[][] = {};
        String columnas[] = {"idEmpresa", "Razon Social", "Direccion", " NIT ", "Telefono", "Email"};

        model = new DefaultTableModel(filas, columnas);
        TEinhablitadas.setModel(model);

        ArrayList<Empresa> lista = new ArrayList<Empresa>();
        lista = controladorHibernate.devolverTodoInhabilitado("Empresa");
        for (Empresa item : lista) {
            model.addRow(item.arrayToVector());
        }

        esconderId2();

        
    }
    
    private void cargarTabla(){
        String filas[][] = {};
        String columnas[] = {"idEmpresa", "Razon Social", "Direccion", " NIT ", "Telefono", "Email"};

        model = new DefaultTableModel(filas, columnas);
        Tempresas.setModel(model);

        ArrayList<Empresa> lista = new ArrayList<Empresa>();
        lista = controladorHibernate.devolverTodo("Empresa");
        for (Empresa item : lista) {
            model.addRow(item.arrayToVector());
        }

        esconderId();
    }
   
    public void limpiar(){
        CTNrazon.setText("");
        CTNDireccion.setText("");
        CTNnit.setText("");
        CTNtelefono.setText("");
        CTNemail.setText("");
    }
    
    public void esconderId(){
        Tempresas.getColumnModel().getColumn(0).setMaxWidth(0);
        Tempresas.getColumnModel().getColumn(0).setMinWidth(0);
        Tempresas.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void esconderId2(){
        TEinhablitadas.getColumnModel().getColumn(0).setMaxWidth(0);
        TEinhablitadas.getColumnModel().getColumn(0).setMinWidth(0);
        TEinhablitadas.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void CTBuscar (){
        if(CBtipo.getSelectedItem().equals("---Seleccione Una Opcion---")){
            CTbuscar.setEnabled(false);
            CTbuscar.setText("");
        }else{
            CTbuscar.setEnabled(true);
            
        }
    }
    
    public void cargarTxtEmpresa(){
        
        Tempresas.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
            public void valueChanged(ListSelectionEvent e){
                int fila = Tempresas.getSelectedRow();
                if(fila > -1){
                    String columnas[]={"idEmpresa","Razon Social", "Direccion", " NIT ", "Telefono", "Email"};
                    usuario.setIdUsuarios(Integer.parseInt(Tempresas.getValueAt(fila, 0).toString()));
                    CTrazon.setText(Tempresas.getValueAt(fila, 1).toString());
                    CTdireccion.setText(Tempresas.getValueAt(fila, 2).toString());
                    CTnit.setText(Tempresas.getValueAt(fila, 3).toString());
                    CTtelefono.setText(Tempresas.getValueAt(fila, 4).toString());
                    CTemail.setText(Tempresas.getValueAt(fila, 5).toString());
                    
                }
            }
            
        });
        
    }
    
    public void buscarLike(String Tipo, String Buscar){
        
        try{
            String filas[][] = {};
            String columnas[] = {"idEmpresa", "Razon Social", "Direccion", "NIT", "Telefono", "Email"};
            model = new DefaultTableModel(filas, columnas);
            Tempresas.setModel(model);
            
            List<Empresa> list;
            list = controladorHibernate.buscarLike("Empresa", Tipo, Buscar);
            
            for(Empresa item: list){
                model.addRow(item.arrayToVector());
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace();
        }
        
         
        Tempresas.getColumnModel().getColumn(0).setMaxWidth(0);
        Tempresas.getColumnModel().getColumn(0).setMinWidth(0);
        Tempresas.getColumnModel().getColumn(0).setPreferredWidth(0);
     
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTdeshabilitar;
    private javax.swing.JButton BTregistrar;
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JTextField CTNDireccion;
    private javax.swing.JTextField CTNemail;
    private javax.swing.JTextField CTNnit;
    private javax.swing.JTextField CTNrazon;
    private javax.swing.JTextField CTNtelefono;
    private javax.swing.JTextField CTbuscar;
    private javax.swing.JTextField CTdireccion;
    private javax.swing.JTextField CTemail;
    private javax.swing.JTextField CTnit;
    private javax.swing.JTextField CTrazon;
    private javax.swing.JTextField CTtelefono;
    private javax.swing.JLabel JLBhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JTable TEinhablitadas;
    private javax.swing.JTable Tempresas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
