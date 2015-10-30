
package Grafico;

import Clases.Contratos;
import Clases.Empresa;
import Clases.Usuario;
import Controlador.Hilo;
import Controlador.controladorHibernate;
import Util.HibernateUtil;
import java.awt.event.KeyEvent;
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
        Hilo hilo = new Hilo(JLBhora);
        hilo.start();
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
       
       
       if(tama != 0){
            for(Usuario item: lista){
                CBaprendiz.addItem(item.getNombres()+"-"+item.getNumeroDocumento());
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
        try{
            String NUsuario = Nombre();
            long DocumentoU = Long.parseLong(documento());

            String BEmpresa = (String) CBempresa.getSelectedItem();

            ArrayList<Empresa> listaE = new ArrayList<Empresa>();
            listaE = controladorHibernate.devolverCampo("Empresa", "Razon_Social", BEmpresa);
            int idE = 0;
            for(Empresa itemE: listaE){
                idE = itemE.getIdEmpresa();
            }

            
            ArrayList<Usuario> listaU = new ArrayList<Usuario>();
            String SQL = "FROM Usuario WHERE Nombres ='"+NUsuario+"' AND NumeroDocumento = "+DocumentoU+" ";
            listaU = controladorHibernate.devolverSQL(SQL);
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
        }catch(Exception ex){
            System.out.println("Error en el metodo de actualisar: "+ex.getMessage());
            ex.printStackTrace();
        }
        
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
    
    public String documento(){
        String jul = (String)CBaprendiz.getSelectedItem();
        char[] pas = jul.toCharArray();
        String documento = "";
        char aux;
        int p = 0;
        for(int i = 0; i<pas.length; i++){
            aux = pas[i];
            if(p == 1){                
                documento += pas[i];                
            }
            if(aux=='-'){
                p = 1;
            }
            
        }
        return documento;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        JLBhora = new javax.swing.JLabel();
        DCinicial = new com.toedter.calendar.JDateChooser();
        DCfinal = new com.toedter.calendar.JDateChooser();
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
        setTitle("Actualizar Contrato");
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

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

        CTjefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTjefeKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cargo Gefe");

        CTcargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTcargoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Inicial");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Final");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Sede");

        CTsede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTsedeKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipo Contrato");

        CBcontrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Contrato de Aprendizaje", "Vinculación Laboral o Contractua", "Proyecto Productivo", "Unidad Productiva Familiar", "Empresas del Estado", "ONG y Sin Animo de Lucro", "Monitorias", "Pasantias" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Programa");

        CTprograma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTprogramaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ficha");

        CTficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTfichaKeyTyped(evt);
            }
        });

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

        CTaprendiz.setEditable(false);
        CTaprendiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTaprendizKeyTyped(evt);
            }
        });

        CTempresa.setEditable(false);
        CTempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTempresaKeyTyped(evt);
            }
        });

        CTcontrato.setEditable(false);
        CTcontrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTcontratoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Hora");

        JLBhora.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        DCinicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DCinicialKeyTyped(evt);
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
                            .addComponent(CTsede)
                            .addComponent(CBcontrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CTficha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCfinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DCinicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CTcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(54, 54, 54)
                .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(JLBhora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CTaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DCinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CBaprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CTempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CBempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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
        boolean entrar = true;
        
        if((CTaprendiz.getText().equals(""))||(CTcargo.getText().equals(""))||(CTempresa.getText().equals(""))||(CTficha.getText().equals(""))||(CTjefe.getText().equals(""))||(CTprograma.getText().equals(""))||(CTsede.getText().equals(""))||(CBaprendiz.getSelectedItem().equals("--Seleccione Un Aprendiz--"))||(CBempresa.getSelectedItem().equals("---Seleccione una Empresa---"))){
            entrar = false;
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos", "Informacion....", JOptionPane.WARNING_MESSAGE);
        }
        
        if(entrar){
            int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de actualizar este contrato?", "Confirmacion..¡", JOptionPane.OK_CANCEL_OPTION);
            if(opcion == JOptionPane.OK_OPTION){
                try{
                    actualizarDatos();
                    JOptionPane.showMessageDialog(rootPane, "Se actualizo correctamente la informacion","EnhoraBuena¡¡",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, "Lo sentimos ocurrio un problema al actualizar...","Error",JOptionPane.WARNING_MESSAGE);
                    System.out.println("Error al actualizar: "+ex.getMessage());
                    ex.printStackTrace();
                }    
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CTaprendizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTaprendizKeyTyped
        int k=(int)evt.getKeyChar();
        
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTaprendiz.transferFocus();
        }
    }//GEN-LAST:event_CTaprendizKeyTyped

    private void CTempresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTempresaKeyTyped
        int k=(int)evt.getKeyChar();
        
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTempresa.transferFocus();
        }
    }//GEN-LAST:event_CTempresaKeyTyped

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

    private void CTcargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTcargoKeyTyped
       int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTcargo.transferFocus();
        }
    }//GEN-LAST:event_CTcargoKeyTyped

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

    private void CTcontratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTcontratoKeyTyped
         int k=(int)evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar numeros!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            CTcontrato.transferFocus();
        }
    }//GEN-LAST:event_CTcontratoKeyTyped

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

    private void DCinicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DCinicialKeyTyped
       int k=(int)evt.getKeyChar();
        if (k < 123 && k > 64) {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar ese tipo de caracter!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
         if(k==10){
            DCinicial.transferFocus();
        }
    }//GEN-LAST:event_DCinicialKeyTyped

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
    private javax.swing.JLabel JLBhora;
    private javax.swing.JCheckBoxMenuItem MnewUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    // End of variables declaration//GEN-END:variables
}
