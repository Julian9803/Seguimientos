/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Clases.Contratos;
import Clases.Empresa;
import Clases.Usuario;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import java.util.ArrayList;

public class informacionContrato extends javax.swing.JFrame {

    Contratos contrato;
    int id= 0;
    public informacionContrato(Contratos contrato) {
        initComponents();
        id = contrato.getIdContratos();
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
        cargardatosAprendiz(id);
        cargardatosEmpresa(id);
        
        this.setLocationRelativeTo(null);
    }

  
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
        jLabel7 = new javax.swing.JLabel();
        CTUnombre = new javax.swing.JTextField();
        CTUapellidos = new javax.swing.JTextField();
        CTUtelefono = new javax.swing.JTextField();
        CTUcorreo = new javax.swing.JTextField();
        CTUdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CTErazonsocial = new javax.swing.JTextField();
        CTEdireccion = new javax.swing.JTextField();
        CTEnit = new javax.swing.JTextField();
        CTEtelefono = new javax.swing.JTextField();
        CTEemail = new javax.swing.JTextField();
        BTvolver = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        JLBhora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informacion del Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Informacion del Aprendiz");

        jLabel2.setText("Informacion de la Empresa");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Telefono");

        jLabel6.setText("Correo");

        jLabel7.setText("Direccion");

        CTUnombre.setEditable(false);
        CTUnombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTUapellidos.setEditable(false);
        CTUapellidos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTUtelefono.setEditable(false);
        CTUtelefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTUcorreo.setEditable(false);
        CTUcorreo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTUdireccion.setEditable(false);
        CTUdireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel8.setText("Razon Social");

        jLabel9.setText("Direccion");

        jLabel10.setText("Nit");

        jLabel11.setText("Telefono");

        jLabel12.setText("Email");

        CTErazonsocial.setEditable(false);
        CTErazonsocial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTEdireccion.setEditable(false);
        CTEdireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTEnit.setEditable(false);
        CTEnit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTEtelefono.setEditable(false);
        CTEtelefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        CTEemail.setEditable(false);
        CTEemail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        BTvolver.setText("Volver");
        BTvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvolverActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Hora");

        JLBhora.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel10)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel11)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTUnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTErazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTUapellidos)
                            .addComponent(CTEdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTUtelefono)
                            .addComponent(CTEnit, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTUcorreo)
                            .addComponent(CTEtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTUdireccion)
                            .addComponent(CTEemail, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel3)
                            .addGap(114, 114, 114)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(120, 120, 120)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(495, 495, 495)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CTUcorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTUdireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTUtelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CTUnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CTUapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CTEdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTErazonsocial)
                    .addComponent(CTEtelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CTEnit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CTEemail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BTvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BTvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvolverActionPerformed
        dispose();
    }//GEN-LAST:event_BTvolverActionPerformed

    public int cargarIdAprendiz(int idContrato){
        ArrayList<Contratos> lista = new ArrayList<Contratos>();
        lista = controladorHibernate.devolverUnoID("Contratos","idContratos",idContrato);
        Usuario usuario = new Usuario();
        int idUsuario = 0;
    
        for(Contratos item: lista){
            //System.out.println("El id del usuario es: "+item.getUsuario());
            usuario = item.getUsuario();
        }
        System.out.println("Imprimio id Usuario: "+usuario.getIdUsuarios());
        return usuario.getIdUsuarios();
    }
    public int cargarIdEmpresa(int idContrato){
        ArrayList<Contratos> lista = new ArrayList<Contratos>();
        lista = controladorHibernate.devolverUnoID("Contratos", "idContratos", idContrato);
        Empresa empresa = new Empresa();
        int empresaI = 0;
        for(Contratos item: lista){
            empresa = item.getEmpresa();
        }
        System.out.println("Imprimio idEmpresa: "+empresa.getIdEmpresa());
        return empresa.getIdEmpresa();
    }
    
    public void cargardatosAprendiz(int idContrato){
        try{
            
            int idAprendiz = cargarIdAprendiz(idContrato);
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            lista = controladorHibernate.devolverUnoID("Usuario", "idUsuarios", idAprendiz);
            
            for(Usuario item: lista){
                CTUnombre.setText(item.getNombres());
                CTUapellidos.setText(item.getApellidos());
                CTUtelefono.setText(String.valueOf(item.getTelefono()));
                CTUcorreo.setText(item.getCorreo());
                CTUdireccion.setText(item.getDireccion());
                
            }
            
        }catch(Exception ex){
            System.out.println("Error al cargar los datos del prendiz: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void cargardatosEmpresa(int Contrato){
        try{
            int idEmpresa = cargarIdEmpresa(Contrato);
            ArrayList<Empresa> lista = new ArrayList<Empresa>();
            lista = controladorHibernate.devolverUnoID("Empresa", "idEmpresa", idEmpresa);
            for(Empresa item: lista){
                CTErazonsocial.setText(item.getRazonSocial());
                CTEdireccion.setText(item.getDireccion());
                CTEnit.setText(String.valueOf(item.getNit()));
                CTEtelefono.setText(String.valueOf(item.getTelefono()));
                CTEemail.setText(item.getEmail());
            }
        }catch(Exception ex){
            System.out.println("Error al cargar los datos de la empresa: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTvolver;
    private javax.swing.JTextField CTEdireccion;
    private javax.swing.JTextField CTEemail;
    private javax.swing.JTextField CTEnit;
    private javax.swing.JTextField CTErazonsocial;
    private javax.swing.JTextField CTEtelefono;
    private javax.swing.JTextField CTUapellidos;
    private javax.swing.JTextField CTUcorreo;
    private javax.swing.JTextField CTUdireccion;
    private javax.swing.JTextField CTUnombre;
    private javax.swing.JTextField CTUtelefono;
    private javax.swing.JLabel JLBhora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
