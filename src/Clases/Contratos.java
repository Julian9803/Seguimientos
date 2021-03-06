package Clases;
// Generated 15/10/2015 02:12:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import Controlador.controladorHibernate;
import java.util.ArrayList;

/**
 * Contratos generated by hbm2java
 */
public class Contratos  implements java.io.Serializable {


     private int idContratos;
     private Empresa empresa;
     private Usuario usuario;
     private String jefeInmediato;
     private String cargoJefe;
     private Date fechaInicial;
     private Date fechaFinal;
     private String sede;
     private String tipoContrato;
     private String programa;
     private int ficha;
     private String estado;
     private Set seguimientoses = new HashSet(0);

     public Vector arrayToVector(){
        Vector lista = new Vector();

        lista.add(this.idContratos);
        
        int idEmpresa = empresa.getIdEmpresa();
        ArrayList<Empresa> listaE = new ArrayList<Empresa>();
        listaE = controladorHibernate.devolverUnoID("Empresa", "idEmpresa", idEmpresa);
        String RazonSocial ="No Cambie";
        for(Empresa item: listaE){
            RazonSocial = item.getRazonSocial();
        }
        lista.add(RazonSocial);
        
        int idUsuario = usuario.getIdUsuarios();
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        listaU = controladorHibernate.devolverUnoID("Usuario", "idUsuarios", idUsuario);
        String Usuario = "No hay Usuario";
        for(Usuario item: listaU){
            Usuario = item.getNombres();
        }
        lista.add(Usuario);
        lista.add(this.jefeInmediato);
        lista.add(this.cargoJefe);
        lista.add(this.fechaInicial);
        lista.add(this.fechaFinal);
        lista.add(this.sede);
        lista.add(this.tipoContrato);
        lista.add(this.programa);
        lista.add(this.ficha);
        lista.add(this.estado);



        return lista;
    }
     
    public Contratos() {
    }

	
    public Contratos(int idContratos, Empresa empresa, Usuario usuario, String jefeInmediato, String cargoJefe, Date fechaInicial, Date fechaFinal, String sede, String tipoContrato, String programa, int ficha, String estado) {
        this.idContratos = idContratos;
        this.empresa = empresa;
        this.usuario = usuario;
        this.jefeInmediato = jefeInmediato;
        this.cargoJefe = cargoJefe;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.sede = sede;
        this.tipoContrato = tipoContrato;
        this.programa = programa;
        this.ficha = ficha;
        this.estado = estado;
    }
    public Contratos(int idContratos, Empresa empresa, Usuario usuario, String jefeInmediato, String cargoJefe, Date fechaInicial, Date fechaFinal, String sede, String tipoContrato, String programa, int ficha, String estado, Set seguimientoses) {
       this.idContratos = idContratos;
       this.empresa = empresa;
       this.usuario = usuario;
       this.jefeInmediato = jefeInmediato;
       this.cargoJefe = cargoJefe;
       this.fechaInicial = fechaInicial;
       this.fechaFinal = fechaFinal;
       this.sede = sede;
       this.tipoContrato = tipoContrato;
       this.programa = programa;
       this.ficha = ficha;
       this.estado = estado;
       this.seguimientoses = seguimientoses;
    }

    public Contratos(Empresa empresa, Usuario usuario, String jefeInmediato, String cargoJefe, Date fechaInicial, Date fechaFinal, String sede, String tipoContrato, String programa, int ficha, String estado) {
        this.empresa = empresa;
        this.usuario = usuario;
        this.jefeInmediato = jefeInmediato;
        this.cargoJefe = cargoJefe;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.sede = sede;
        this.tipoContrato = tipoContrato;
        this.programa = programa;
        this.ficha = ficha;
        this.estado = estado;
        
    }
    
    
    
    
   
    public int getIdContratos() {
        return this.idContratos;
    }
    
    public void setIdContratos(int idContratos) {
        this.idContratos = idContratos;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getJefeInmediato() {
        return this.jefeInmediato;
    }
    
    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }
    public String getCargoJefe() {
        return this.cargoJefe;
    }
    
    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }
    public Date getFechaInicial() {
        return this.fechaInicial;
    }
    
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }
    public Date getFechaFinal() {
        return this.fechaFinal;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    public String getSede() {
        return this.sede;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
    }
    public String getTipoContrato() {
        return this.tipoContrato;
    }
    
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public String getPrograma() {
        return this.programa;
    }
    
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public int getFicha() {
        return this.ficha;
    }
    
    public void setFicha(int ficha) {
        this.ficha = ficha;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getSeguimientoses() {
        return this.seguimientoses;
    }
    
    public void setSeguimientoses(Set seguimientoses) {
        this.seguimientoses = seguimientoses;
    }

    


}


