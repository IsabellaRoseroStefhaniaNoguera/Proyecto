/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.io.IOException;
import modelo.*;
/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        
        VentanaInicio ventana = new VentanaInicio();
        Contacto contacto = new Contacto("Rose", "Rossi",43567, 4664,"sthhs", "thrrj", "ethrjrj", "3egeh");
        Contacto contacto2 = new Contacto("Ansel", "Jones",43567, 4664,"sthhs", "thrrj", "ethrjrj", "3egeh");
        

        /*Gestionador gestion = new Gestionador(contacto);
        Gestionador gestion1 = new Gestionador(contacto2);
        gestion.agregarContacto(contacto);
        gestion.agregarContacto(contacto2);
        gestion.eliminarContacto();
        gestion1.actualizarContacto();
        gestion.listarContacto();*/
       
        // TODO code application logic here
        
    }
    
}
