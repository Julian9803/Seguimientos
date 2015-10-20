
package Grafico;

import Clases.Contratos;
import Clases.Usuario;
import Controlador.controladorHibernate;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class verContratos extends javax.swing.JFrame {

    public DefaultTableModel model;
    public verContratos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaContratos();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tcontratos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CTbuscar = new javax.swing.JTextField();
        CBbuscar = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        CBtipo = new javax.swing.JComboBox();
        BTfinalizar = new javax.swing.JButton();
        BTactualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton2.setText("Detallar Informacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buscar Contratos Por");

        CTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTbuscarKeyReleased(evt);
            }
        });

        CBbuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Empresa", "Aprendiz", "Tipo de Contrato", "Programa", "Ficha" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Ver Contratos Por");

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todo", "Activo", "Finalizado" }));
        CBtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBtipoItemStateChanged(evt);
            }
        });

        BTfinalizar.setText("Finalizar Contrato");
        BTfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTfinalizarActionPerformed(evt);
            }
        });

        BTactualizar.setText("Actualizar Contrato");
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(BTfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(BTactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
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
                        .addGap(0, 150, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(CBbuscar)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(BTfinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void CTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTbuscarKeyReleased
        String Buscar = CTbuscar.getText();
        String Tipo = (String) CBbuscar.getSelectedItem();
        
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
           cargarTablaContratos();
       }else if(seleccion.equals("Activo")){
           buscarTabla("Estado","Activo");
       }else if(seleccion.equals("Finalizado")){
           buscarTabla("Estado","Finalizado");
       }
       
    }//GEN-LAST:event_CBtipoItemStateChanged

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
        
        int fila = Tcontratos.getSelectedRow();
        Contratos contrato = new Contratos();
        if(fila != -1){
            
            Contratos con = (Contratos) controladorHibernate.unicode("SELECT C FROM Contratos C WHERE idContratos="+Tcontratos.getValueAt(fila, 0).toString());
            System.out.println(con.getEmpresa());
//            contrato.setIdContratos((Integer)Tcontratos.getValueAt(fila, 0));
//            System.out.println("El id enviado es: "+contrato.getIdContratos());
            ActualizarContrato act = new ActualizarContrato(con);
            act.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un contrato para actualizar¡¡","Informacion....",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_BTactualizarActionPerformed

    private void BTfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTfinalizarActionPerformed
        int fila = Tcontratos.getSelectedRow();
        
        if(fila != -1){
            finalizarContrato(fila);
            System.out.println("Mensaje");
            cargarTablaContratos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un contrato para eliminarlo","Error¡¡",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BTfinalizarActionPerformed

   
    public void cargarTablaContratos(){
        try{
            
            String filas[][]={};
            String columnas[]={"idContratos","Empresa","Aprendiz","Jefe Inmediato","Cargo Jefe","Fecha Inicial","Fecha Final","Sede","Tipo Contrato","Programa","Ficha","Estado del Contrato"};
            model = new DefaultTableModel(filas, columnas);
            Tcontratos.setModel(model);
            
            ArrayList<Contratos> lista = new ArrayList<Contratos>();
            lista = controladorHibernate.devolverSinEstado("Contratos");
            
            //ArrayList<Contratos> empresas = (ArrayList<Contratos>) controladorHibernate.Query("SELECT C FROM Contratos C");
       
            
            for(Contratos item: lista){
                model.addRow(item.arrayToVector());
            }   
            
        }catch(Exception ex){
            System.out.println("Error al cargar la tabla: "+ex.getMessage());
            ex.printStackTrace();
        }
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
        
    }
    
    public void finalizarContrato(int miFila){
        
        int idContrato = (Integer) Tcontratos.getValueAt(miFila, 0);
        
        controladorHibernate.delete("Contratos", "idContratos", idContrato);
        model.removeRow(miFila);
        
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
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton BTfinalizar;
    private javax.swing.JComboBox CBbuscar;
    private javax.swing.JComboBox CBtipo;
    private javax.swing.JTextField CTbuscar;
    private javax.swing.JTable Tcontratos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
