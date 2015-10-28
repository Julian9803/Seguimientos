package Clases;
// Generated 15/10/2015 02:12:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.Vector;
import Controlador.controladorHibernate;
import java.util.ArrayList;

/**
 * Seguimientos generated by hbm2java
 */
public class Seguimientos  implements java.io.Serializable {


     private Integer idSeguimientos;
     private Contratos contratos;
     private Usuario usuario;
     private int numero;
     private Date fechaSeguimiento;
     private String ciudad;
     private String tipoInforme;
     private Date fechaInicialPeriodo;
     private Date fechaFinalPeriodo;

     public Vector arrayToVector(){
         Vector lista = new Vector();
         
         
         int idUsuario = usuario.getIdUsuarios();
         ArrayList<Usuario> lista2;
         lista2 = controladorHibernate.devolverUnoID("Usuario", "idUsuario", idUsuario);
         String Usuario = "No cambie";
         for(Usuario item: lista2){
             Usuario = item.getNombres();
         }
         lista.add(this.idSeguimientos);
         lista.add(this.contratos);
         lista.add(Usuario);
         lista.add(this.numero);
         lista.add(this.fechaSeguimiento);
         lista.add(this.ciudad);
         lista.add(this.tipoInforme);
         lista.add(this.fechaInicialPeriodo);
         lista.add(this.fechaFinalPeriodo);
         
     
         
         return lista;
     }
     
    
     
     
    public Seguimientos() {
    }

    
    
    public Seguimientos(Contratos contratos, Usuario usuario, int numero, Date fechaSeguimiento, String ciudad, String tipoInforme, Date fechaInicialPeriodo, Date fechaFinalPeriodo) {
       this.contratos = contratos;
       this.usuario = usuario;
       this.numero = numero;
       this.fechaSeguimiento = fechaSeguimiento;
       this.ciudad = ciudad;
       this.tipoInforme = tipoInforme;
       this.fechaInicialPeriodo = fechaInicialPeriodo;
       this.fechaFinalPeriodo = fechaFinalPeriodo;
    }
   
    public Integer getIdSeguimientos() {
        return this.idSeguimientos;
    }
    
    public void setIdSeguimientos(Integer idSeguimientos) {
        this.idSeguimientos = idSeguimientos;
    }
    public Contratos getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Date getFechaSeguimiento() {
        return this.fechaSeguimiento;
    }
    
    public void setFechaSeguimiento(Date fechaSeguimiento) {
        this.fechaSeguimiento = fechaSeguimiento;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getTipoInforme() {
        return this.tipoInforme;
    }
    
    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }
    public Date getFechaInicialPeriodo() {
        return this.fechaInicialPeriodo;
    }
    
    public void setFechaInicialPeriodo(Date fechaInicialPeriodo) {
        this.fechaInicialPeriodo = fechaInicialPeriodo;
    }
    public Date getFechaFinalPeriodo() {
        return this.fechaFinalPeriodo;
    }
    
    public void setFechaFinalPeriodo(Date fechaFinalPeriodo) {
        this.fechaFinalPeriodo = fechaFinalPeriodo;
    }

    public Vector arrayToVector2(){
        Vector lista = new Vector();
                           
        lista.add(this.idSeguimientos);
//         lista.add(this.contratos);
//        lista.add(this.usuario.getNombres());
        lista.add(this.numero);
        lista.add(this.fechaSeguimiento);
        lista.add(this.ciudad);
        lista.add(this.tipoInforme);
        lista.add(this.fechaInicialPeriodo);
        lista.add(this.fechaFinalPeriodo);
         
     
         
        return lista;
    }
    
    public Vector arrayToVector3(){
        Vector lista = new Vector();
                           
        lista.add(this.idSeguimientos);
        lista.add(this.contratos);
        lista.add(this.usuario);
        lista.add(this.numero);
        lista.add(this.fechaSeguimiento);
        lista.add(this.ciudad);
        lista.add(this.tipoInforme);
        lista.add(this.fechaInicialPeriodo);
        lista.add(this.fechaFinalPeriodo);
         
     
         
        return lista;
    }


}


