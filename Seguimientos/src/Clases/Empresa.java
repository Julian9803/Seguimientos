package Clases;
// Generated 15/10/2015 02:12:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private String razonSocial;
     private String direccion;
     private long nit;
     private long telefono;
     private String email;
     private String estado;
     private Set contratoses = new HashSet(0);

     
     
     
    public Empresa() {
    }

	
    public Empresa(String razonSocial, String direccion, long nit, long telefono, String email, String estado) {
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
    public Empresa(String razonSocial, String direccion, long nit, long telefono, String email, String estado, Set contratoses) {
       this.razonSocial = razonSocial;
       this.direccion = direccion;
       this.nit = nit;
       this.telefono = telefono;
       this.email = email;
       this.estado = estado;
       this.contratoses = contratoses;
    }

    public Empresa(Integer idEmpresa, String razonSocial, String direccion, long nit, long telefono, String email, String estado) {
        this.idEmpresa = idEmpresa;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
   
    
    
    
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public long getNit() {
        return this.nit;
    }
    
    public void setNit(long nit) {
        this.nit = nit;
    }
    public long getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getContratoses() {
        return this.contratoses;
    }
    
    public void setContratoses(Set contratoses) {
        this.contratoses = contratoses;
    }

    public Vector arrayToVector(){
         Vector lista = new Vector();
         lista.add(this.idEmpresa);
         lista.add(this.razonSocial);
         lista.add(this.direccion);
         lista.add(this.nit);
         lista.add(this.telefono);
         lista.add(this.email);
         lista.add(this.estado);
         return lista;
    }

    @Override
    public String toString() {
        return razonSocial; //To change body of generated methods, choose Tools | Templates.
    }


}


