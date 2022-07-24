/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class Gestionador implements Serializable {
    public static final long serialVersionUID = 1L;
    private Contacto contacto;
    private ArrayList<Contacto> listaContactos;
    FileWriter escribir;
    PrintWriter pw;
    boolean eliminarSN;
    File archivo = new File("src/archivos/archivoContactos.txt");
    
    public Gestionador(Contacto contacto) {
        this.contacto = contacto;
        listaContactos = new ArrayList<>();
        //grabarContacto();
    }

    public Contacto getListaContactos(int num) {
        return listaContactos.get(num-1);
    }
    
    public void agregarContacto(Contacto contacto) throws IOException{
        listaContactos.add(contacto);
        grabarContacto(contacto);
    }
    
    /*public void imprimirLista(){
    for (int i=0; i<listaContactos.size(); i++){
    System.out.println(listaContactos.get(i));
    }
    }*/
    private void grabarContacto(Contacto contacto) throws IOException{
    
        FileWriter archivoTexto = new FileWriter(archivo,true);
        
        PrintWriter pw = new PrintWriter(archivoTexto);
        
        pw.println(contacto.getNombre() + ";" + contacto.getApellido()+ ";" + contacto.getId() + ";" + contacto.getTipoCont() + ";" + contacto.getNacim() + ";" + contacto.getDir() + ";" + contacto.getTel() + ";" + contacto.getAsociado());
        
        try {
           if ( archivoTexto != null)
              archivoTexto.close();
        } catch (IOException e2) {
              e2.printStackTrace();
        }
    }
    
    public void eliminarContacto(String name) throws IOException{
        
        File f = new File("src/archivos/archivoContactos.txt");
        Scanner fileScanner = new Scanner(f);
        String lineasGuardadas = "";

        int lineNumber = 0;
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            if (!line.contains(name)){
                lineasGuardadas += line + "\n";
            }
            lineNumber++;
        }
        
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(f));
        bw2.write(lineasGuardadas);
        bw2.close();

        fileScanner.close();
    }

    public void actualizarContacto(){
        Scanner scan = new Scanner(System.in);
	String n = JOptionPane.showInputDialog("Introduzca el nombre del contacto a actualizar: ");
	File f = new File("src/archivos/archivoContactos.txt");
	try {
	    BufferedReader freader = new BufferedReader(new FileReader(f));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = freader.readLine()) != null) {
		String[] st = s.split(";");
		String nm = st[0];
		String ta = st[1];
		String id = st[2];
		String tel = st[3];
                String as = st[4];
                String nac = st[5];
		String di = st[6];
		String tc = st[7];
		
		if (n.equals(nm)) {
                    JOptionPane.showMessageDialog(null, nm + " " + ta);
                    //System.out.println("Ingrese el nuevo telefono, su asociado, la dirección y el tipo de contacto");
                    tel = JOptionPane.showInputDialog("Escriba el nuevo telefono");
                    as = JOptionPane.showInputDialog("Escriba el nuevo asociado");
		    di = JOptionPane.showInputDialog("Escriba la nueva dirección");
                    tc = JOptionPane.showInputDialog("Escriba el nuevo tipo de contacto");
                    
                    eliminarContacto(n);
                    
                    Contacto contactoactual = new Contacto(nm,ta, Integer.parseInt(id),Integer.parseInt(tel),as,nac,di,tc);
                    
                    agregarContacto(contactoactual);
                    
                    /*for (int i=0; i<st.length; i++){
                    pw.println(st[i]+" ");}*/
		}
	    }
	    freader.close();
	} catch (Exception e) {
	}
    }
    

    
    public void listarContacto() throws FileNotFoundException, IOException{ //imprimir el archivo pues
        FileInputStream fis = new FileInputStream(new File("src/archivos/archivoContactos.txt"));
        DataInputStream dis = new DataInputStream(fis);
	BufferedReader reader = new BufferedReader(new InputStreamReader(dis));
	String st;
	ArrayList al = new ArrayList();
	while ((st = reader.readLine()) != null) {
	    al.add(st);
	}
	Iterator itr;
	for (itr = al.iterator(); itr.hasNext();) {
	    String str = itr.next().toString();
	    String[] splitSt = str.split(";");
	    String na = "", ta = "", id = "", tel = "", nac = "", di = "", tc = "", as = ""; ;
		for (int i = 0; i < splitSt.length; i++) {
	            na = splitSt[0];
		    ta = splitSt[1];
		    id = splitSt[2];
		    tel = splitSt[3];
                    as = splitSt[4];
                    nac = splitSt[5];
		    di = splitSt[6];
		    tc = splitSt[7];
		}
             JOptionPane.showMessageDialog(null, "Lista Contactos \n" +na + ";" + ta + ";" + id + ";" + tel + ";" + as + ";" + nac + ";" + di + ";" + tc);        }        
    }


    
    
    
}
