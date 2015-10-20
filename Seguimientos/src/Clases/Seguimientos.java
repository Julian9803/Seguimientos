package Clases;
// Generated 15/10/2015 02:12:57 PM by Hibernate Tools 4.3.1


import java.util.Date;

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




}


