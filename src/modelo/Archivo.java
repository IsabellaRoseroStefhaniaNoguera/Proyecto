/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.File;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */
public class Archivo implements  Serializable{
    public static final long serialVersionUID = 1L;
    File archivo = new File("archivoContactos.txt");

    public Archivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
