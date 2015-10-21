
package Grafico;

import Clases.Contratos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Clases.Usuario;
import Clases.Empresa;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import static Grafico.UIusuario.diferenciaEnDias2;
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

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Jefe Inmediato");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Cargo Jefe");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Fecha Inicial");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Fecha Final");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Sede");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Tipo Contrato");

        CBcontrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Contrato de Aprendizaje", "Vinculación Laboral o Contractua", "Proyecto Productivo", "Unidad Productiva Familiar", "Empresas del Estado", "ONG y Sin Animo de Lucro", "Monitorias", "Pasantias" }));
        CBcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBcontratoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Programa");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Ficha");

        BTregistrar.setText("Registrar");
        BTregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregistrarActionPerformed(evt);
            }
        });

        BTlimpiar.setText("Limpiar");

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
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
                        .addGap(48, 48, 48)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBcontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBcontratoActionPerformed

    private void BTregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregistrarActionPerformed
        
        int dias= 0;    
        dias = diferenciaEnDias2(DCinicial.getDate(), DCfinal.getDate());
        boolean entrar = false;
        System.out.println("El numero de dias es: "+dias);
        if((dias>80&dias<95)||(dias>172&dias<185)){
            entrar = true;
        }else{
            entrar = false;
        }
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
                CBaprendiz.addItem(item.getNombres());
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
                CBaprendiz.addItem(item.getNombres());
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
        listaU = controladorHibernate.devolverCampo("Usuario", "Nombres", BuscarU);
        int idU = 0;
        for(Usuario item: listaU){
            idU = item.getIdUsuarios();
        }
                       
        usuario.setIdUsuarios(idU);
        String jefeInmediato = CTjefe.getText();
        String cargoJefe = CTjefe.getText();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
