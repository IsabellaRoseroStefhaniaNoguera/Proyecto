/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Contacto implements  Serializable{
    public static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    private int tel;
    private int id;
    private String nacim;
    private String dir;
    private String tipoCont;
    private String asociado;
    
    public Contacto (String nombre, String apellido,int id, int tel, String asociado, String nacim,String dir,String tipoCont){
      this.nombre = nombre;
      this.apellido = apellido;
      this.tel = tel;
      this.id = id;
      this.nacim = nacim;
      this.dir = dir;
      this.tipoCont = tipoCont;
      this.asociado = asociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacim() {
        return nacim;
    }

    public void setNacim(String nacim) {
        this.nacim = nacim;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTipoCont() {
        return tipoCont;
    }

    public void setTipoCont(String tipoCont) {
        this.tipoCont = tipoCont;
    }

    public String getAsociado() {
        return asociado;
    }

    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    public Contacto getContacto(Contacto contacto){
        
        return contacto;
        
        
    }
    
}
