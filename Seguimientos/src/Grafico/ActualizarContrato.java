
package Grafico;

import Clases.Contratos;
import Clases.Empresa;
import Clases.Usuario;
import Controlador.controladorHibernate;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class ActualizarContrato extends javax.swing.JFrame {
    int idContrato = 0;
    public DefaultComboBoxModel model;
    Contratos contrato;    
    public ActualizarContrato(Contratos contrato) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        idContrato = contrato.getIdContratos();
        cargarDatos(idContrato);
        cargarComboAprendiz();
        cargarComboEmpresa();
    }
    
    public void cargarDatos(int id){
        try{
            
            ArrayList<Contratos> lista = new ArrayList<Contratos>();
            lista = controladorHibernate.devolverUnoID("Contratos", "idContratos", id);
            
            for(Contratos item: lista){
                Usuario usuario = item.getUsuario();
                Empresa empresa = item.getEmpresa();
                int idusuario = usuario.getIdUsuarios();
                int idEmpresa = empresa.getIdEmpresa();
                
                ArrayList<Usuario> listaU = new ArrayList<Usuario>();
                ArrayList<Empresa> listaE = new ArrayList<Empresa>();
                listaU = controladorHibernate.devolverUnoID("Usuario", "idUsuarios", idusuario);
                listaE = controladorHibernate.devolverUnoID("Empresa", "idEmpresa", idEmpresa);
                
                for(Usuario itemU: listaU){
                    CTaprendiz.setText(itemU.getNombres());
                }
                for(Empresa itemE: listaE){
                    CTempresa.setText(itemE.getRazonSocial());
                }
                        
                
                CTjefe.setText(item.getJefeInmediato());
                CTcargo.setText(item.getCargoJefe());
                CTprograma.setText(item.getPrograma());
                DCinicial.setDate(item.getFechaInicial());
                DCfinal.setDate(item.getFechaFinal());
                CTsede.setText(item.getSede());
                CTcontrato.setText(item.getTipoContrato());
                CTficha.setText(String.valueOf(item.getFicha()));
                
            }
            
        }catch(Exception ex){
            System.out.println("Error al cargar los datos: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void cargarComboAprendiz(){
        
//          ArrayList<Usuario> empresas = (ArrayList<Usuario>) controladorHibernate.Query("SELECT C FROM Usuario C WHERE tipoUsuario='Aprendiz'");
//       for(Usuario e:empresas){
//           CBaprendiz.addItem(e);
//       }
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
           CBaprendiz.addItem("No hay registro de aprendizes");
       }
    }
    
    public void cargarComboEmpresa(){
        
//      ArrayList<Empresa> empresas = (ArrayList<Empresa>) controladorHibernate.Query("SELECT C FROM Empresa C");
//       for(Empresa e:empresas){
//           CBempresa.addItem(e);
//       }
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
    
    public void actualizarDatos(){
        String BUsuario = (String) CBaprendiz.getSelectedItem();
        String BEmpresa = (String) CBempresa.getSelectedItem();
        
        ArrayList<Empresa> listaE = new ArrayList<Empresa>();
        listaE = controladorHibernate.devolverCampo("Empresa", "Razon_Social", BEmpresa);
        int idE = 0;
        for(Empresa itemE: listaE){
            idE = itemE.getIdEmpresa();
        }
        
        String BUusario = (String) CBaprendiz.getSelectedItem();
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        listaU = controladorHibernate.devolverCampo("Usuario", "Nombres", BUsuario);
        int idU = 0;
        for(Usuario itemUs: listaU){
            idU = itemUs.getIdUsuarios();
        }
        
        Usuario usuario = new Usuario();
        usuario.setIdUsuarios(idU);
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(idE);
//        Empresa empr = (Empresa) CBempresa.getSelectedItem();
//        System.out.println(empr.getDireccion()+"zxzxczxczxc");    
//        Usuario apre = (Usuario) CBaprendiz.getSelectedItem();
        
        String jefeInmediato = CTjefe.getText();
        String cargoJefe = CTcargo.getText();
        Date fechaInicial = DCinicial.getDate();
        Date fechaFinal = DCfinal.getDate();
        String Sede = CTsede.getText();
        String tipoContrato = (String)CBcontrato.getSelectedItem();
        String Programa = CTprograma.getText();
        int Ficha = Integer.parseInt(CTficha.getText());
        
//        contrato.setIdContratos(idContrato);
//        contrato.setEmpresa(empresa);
//        contrato.setUsuario(usuario);
//        contrato.setJefeInmediato(jefeInmediato);
//        contrato.setCargoJefe(cargoJefe);
//        contrato.setFechaFinal(fechaFinal);
//        contrato.setFechaInicial(fechaInicial);
//        contrato.setTipoContrato(tipoContrato);
//        contrato.setPrograma(Programa);
//        contrato.setFicha(Ficha);
        
        //Contratos contrat = new Contratos(empresa, usuario, jefeInmediato, cargoJefe, fechaInicial, fechaFinal, Sede, tipoContrato, Programa, Ficha, "Activo");
        Contratos cont = new Contratos(idContrato, empresa, usuario, jefeInmediato, cargoJefe, fechaInicial, fechaFinal, Sede, tipoContrato, Programa, Ficha, Sede);
        controladorHibernate.actualalizarContrato(cont);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBaprendiz = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        CBempresa = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        CTjefe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CTcargo = new javax.swing.JTextField();
        DCinicial = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DCfinal = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        CTsede = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBcontrato = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        CTprograma = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CTficha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CTaprendiz = new javax.swing.JTextField();
        CTempresa = new javax.swing.JTextField();
        CTcontrato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Actualizar Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel1.setText("Informacion del Contrato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Aprendiz");

        CBaprendiz.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Empresa");

        CBempresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jefe Inmediato");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cargo Gefe");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Inicial");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Final");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Sede");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipo Contrato");

        CBcontrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Contrato de Aprendizaje", "Vinculación Laboral o Contractua", "Proyecto Productivo", "Unidad Productiva Familiar", "Empresas del Estado", "ONG y Sin Animo de Lucro", "Monitorias", "Pasantias" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Programa");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ficha");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CTaprendiz, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CBaprendiz, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)
                        .addComponent(CTjefe, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CTcargo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CTprograma, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DCinicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DCfinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CTsede)
                            .addComponent(CBcontrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CTficha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CTcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CTaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DCinicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(CBaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CTempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CBempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CTjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CTsede, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CTcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CBcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CTprograma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CTficha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verContratos ver = new verContratos();
        ver.setEnabled(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de actualizar este contrato?", "Confirmacion..¡", JOptionPane.OK_CANCEL_OPTION);
        if(opcion == JOptionPane.OK_OPTION){
            try{
                actualizarDatos();
                JOptionPane.showMessageDialog(rootPane, "Se actualiso correctamente la informacion","EnhoraBuena¡¡",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Lo sentimo ocurrios un problema al actualizar...","Error",JOptionPane.WARNING_MESSAGE);
                System.out.println("Error al actualizar: "+ex.getMessage());
                ex.printStackTrace();
            }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBaprendiz;
    private javax.swing.JComboBox CBcontrato;
    private javax.swing.JComboBox CBempresa;
    private javax.swing.JTextField CTaprendiz;
    private javax.swing.JTextField CTcargo;
    private javax.swing.JTextField CTcontrato;
    private javax.swing.JTextField CTempresa;
    private javax.swing.JTextField CTficha;
    private javax.swing.JTextField CTjefe;
    private javax.swing.JTextField CTprograma;
    private javax.swing.JTextField CTsede;
    private com.toedter.calendar.JDateChooser DCfinal;
    private com.toedter.calendar.JDateChooser DCinicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
