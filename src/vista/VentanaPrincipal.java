/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.border.*;

import modelo.Archivo;
import modelo.Contacto;
import modelo.Gestionador;
/**
 *
 * @author STEFHANIA NOGUERA E ISABELA ROSERO  
 */
public class VentanaPrincipal extends JFrame {
    private Contacto contacto1;
    private Gestionador gestion1;
    private JButton btnAgregar; 
    private JButton btnEliminar; 
    private JButton btnActualizar; 
    private JButton btnListar;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblId;
    private JLabel lblNacim;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtId;
    private JTextField txtNacim;
    private JPanel jpanel1;
    private JPanel jpanel2;
    private JPanel jpanel3;
    private JPanel jpanel4;
    private JPanel jpanel5;
    private JLabel lblTel;
    private JLabel lblAsoc;
    private JLabel lblDir;
    private JLabel lblTipC;
    private JTextField txtTel;
    private JTextField txtDir;
    private JComboBox cbxAsoc;
    private JButton btnAddTel;
    private JButton btnAddDir;
    private JCheckBox checkEmp, checkEst, checkPr;
    
    private Gestionador gestionador;
    
    public VentanaPrincipal(){
        iniciarComponentes();
        this.getContentPane().setBackground(new Color(255,240,245));
        this.gestionador = new Gestionador(null);
    }
    private void iniciarComponentes(){
        setTitle("Directorio telefónico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setBounds(600,700,50,100);
        setVisible(true); 
        //setResizable(false);
        
        
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");
        btnActualizar = new JButton("Actualizar");
        btnListar = new JButton("Listar");
        lblNombre = new JLabel();
        lblApellido = new JLabel();
        lblId = new JLabel();
        lblNacim = new JLabel();
        txtNombre = new JTextField(10);
        txtApellido = new JTextField(10);
        txtId = new JTextField(10);
        txtNacim = new JTextField(10);
        jpanel1 = new JPanel();
        jpanel2 = new JPanel();
        jpanel3 = new JPanel();
        jpanel4 = new JPanel();
        jpanel5 = new JPanel();
        lblTel = new JLabel();
        lblDir = new JLabel();
        lblAsoc = new JLabel();
        lblTipC = new JLabel();
        txtTel = new JTextField(10);
        txtDir = new JTextField(10);
        cbxAsoc = new JComboBox<>();
        checkEmp = new JCheckBox("Empleado");
        checkEst = new JCheckBox("Estudiante");
        checkPr = new JCheckBox("Profesor");
        btnAddTel = new JButton("Agregar otro");
        btnAddDir = new JButton("Agregar otra");
        
        eventos= new ManejadorDeEventos();
        btnAgregar.addActionListener(eventos);
        
        eventos2= new ManejadorDeEventos2();
        btnEliminar.addActionListener(eventos2);
        
        eventos3= new ManejadorDeEventos3();
        btnActualizar.addActionListener(eventos3);
        
        eventos4= new ManejadorDeEventos4();
        btnListar.addActionListener(eventos4);
        
        jpanel1.setBackground(new Color(255,250,250));
        jpanel1.setBorder(BorderFactory.createTitledBorder(null, "Contacto",
                TitledBorder.CENTER,
                TitledBorder.DEFAULT_POSITION, 
                new Font("Tahoma", 1, 12), new Color(199,21,133)));
               
        lblNombre.setFont(new Font("Tahoma", 1, 11)); 
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
                
        lblApellido.setFont(new Font("Tahoma", 1, 11)); 
        lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
        lblApellido.setText("Apellido");
        
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        
        lblId.setFont(new Font("Tahoma", 1, 11)); 
        lblId.setText("No de Documento ");

        lblNacim.setFont(new Font("Tahoma", 1, 11)); 
        lblNacim.setText("Fecha de nacimiento (dd/mm/aaaa)");
        
        txtId.setEnabled(true);
        txtNacim.setEnabled(true);
        
        GroupLayout jpanel1Layout = new GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                            .addComponent(lblNombre)
                            .addComponent(lblId))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                            .addComponent(txtNombre)
                            .addComponent(txtId))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(lblNacim))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                            .addComponent(txtApellido)
                            .addComponent(txtNacim))))
                .addGap(21, 21, 21))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido))
                .addGap(11, 11, 11)
                .addGroup(jpanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(lblId)
                    .addComponent(txtId)
                    .addComponent(lblNacim)
                    .addComponent(txtNacim))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addContainerGap())
        );  
        
        jpanel2.setBackground(new Color(255,250,250));
        jpanel2.setBorder(BorderFactory.createLineBorder(new Color(255,182,193), 2, true));
        
        lblTel.setFont(new Font("Tahoma", 1, 11)); 
        //lblTel.setVerticalAlignment(SwingConstants.CENTER);
        lblTel.setText("Telefono");
        
        txtTel.setEnabled(true);
                
        lblAsoc.setFont(new Font("Tahoma", 1, 11)); 
        //lblAsoc.setVerticalAlignment(SwingConstants.CENTER);
        lblAsoc.setText("Asociado");
        
        cbxAsoc.setModel(new DefaultComboBoxModel<>(new String[] 
        { "Movil", "Casa", "Oficina"}));
        cbxAsoc.setEnabled(true);
        
        Box caja1 = Box.createVerticalBox();
        caja1.add(lblTel);
        caja1.add(Box.createVerticalStrut(8));
        caja1.add(txtTel);
        caja1.add(Box.createVerticalStrut(8));
        
        Box caja2 = Box.createVerticalBox();
        caja2.add(lblAsoc);
        caja2.add(Box.createVerticalStrut(8));
        caja2.add(cbxAsoc);
        caja2.add(Box.createVerticalStrut(8));
        caja2.add(btnAddTel);
        
               
        Box caja3 = Box.createVerticalBox();
        caja3.add(caja1);
        caja3.add(caja2);

        jpanel2.add(caja3,BorderLayout.CENTER);
        
        jpanel3.setBackground(new Color(255,250,250));
        jpanel3.setBorder(BorderFactory.createLineBorder(new Color(255,182,193), 2, true));
        
        lblDir.setFont(new Font("Tahoma", 1, 11)); 
        lblDir.setHorizontalAlignment(SwingConstants.CENTER);
        lblDir.setText("Direccion");
        
        txtDir.setEnabled(true);
        
        Box caja4 = Box.createVerticalBox();
        caja4.add(lblDir);
        caja4.add(Box.createVerticalStrut(8));     
        caja4.add(txtDir);
        caja4.add(Box.createVerticalStrut(8));
        caja4.add(btnAddDir);
        
        jpanel3.add(caja4,BorderLayout.CENTER);
        
        jpanel4.setBackground(new Color(255,250,250));
        jpanel4.setBorder(BorderFactory.createLineBorder(new Color(255,182,193), 2, true));
        
        lblTipC.setFont(new Font("Tahoma", 1, 11)); 
        lblTipC.setHorizontalAlignment(SwingConstants.CENTER);
        lblTipC.setText("Tipo de Contacto");
        
        Box caja5 = Box.createVerticalBox();
        caja5.add(lblTipC);
        caja5.add(Box.createVerticalStrut(8));
        caja5.add(checkEmp);
        caja5.add(Box.createVerticalStrut(5));
        caja5.add(checkEst);
        caja5.add(Box.createVerticalStrut(5));
        caja5.add(checkPr);
        
        jpanel4.add(caja5,BorderLayout.CENTER);
        
        jpanel5.setBackground(new Color(255,250,250));
        jpanel5.setBorder(BorderFactory.createLineBorder(new Color(255,182,193), 2, true));
        
        Box caja6 = Box.createHorizontalBox();
        caja6.add(btnAgregar);
        caja6.add(Box.createHorizontalStrut(40));
        caja6.add(btnEliminar);
        
        Box caja7 = Box.createHorizontalBox();
        caja7.add(btnActualizar);
        caja7.add(Box.createHorizontalStrut(40));
        caja7.add(btnListar);
        
        Box caja8 = Box.createVerticalBox();
        caja8.add(Box.createVerticalStrut(20));
        caja8.add(caja6);
        caja8.add(Box.createVerticalStrut(20));
        caja8.add(caja7);
        
        jpanel5.add(caja8,BorderLayout.CENTER);
        
       GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel1)
                                            
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanel4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanel5)))
                   
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel1)     
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel2)
                    .addComponent(jpanel3))
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel4)
                    .addComponent(jpanel5))
                    .addContainerGap()
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }
    
    public void agregandoo (){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int id = Integer.parseInt (txtId.getText());
        String dir = txtDir.getText();
        String nacim = txtNacim.getText();
        int tel = Integer.parseInt(txtTel.getText());
        String asoc = (String) cbxAsoc.getSelectedItem();
        String tipC = "";
        
        if (checkEmp.isSelected()){
            tipC = tipC + (checkEmp.getText());
        } else if(checkEst.isSelected()){
            tipC = tipC + (checkEst.getText());
        } else if(checkPr.isSelected()){
            tipC = tipC + (checkPr.getText());
        } else {
            JOptionPane.showMessageDialog(null,"No ha seleccionado un tipo de contacto");
        }
        contacto1 = new Contacto(nombre,apellido,id,tel,asoc,nacim,dir,tipC);
        gestion1 = new Gestionador(contacto1);
        try {
            gestion1.agregarContacto(contacto1);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminandoo (){
        String name = JOptionPane.showInputDialog("Nombre del contacto a eliminar");
        try {
            gestionador.eliminarContacto(name);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizar (){
        gestion1.actualizarContacto();
    }
    public void listar (){  
        try {
            gestion1.listarContacto();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private ManejadorDeEventos eventos;
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnAgregar){  
                    System.out.println("si sirve");
                    agregandoo();
            }
        }}
    private ManejadorDeEventos2 eventos2;
    
    class ManejadorDeEventos2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnEliminar){  
                    System.out.println("si sirve");
                    eliminandoo();
            }
        }}
    
    private ManejadorDeEventos3 eventos3;
    
    class ManejadorDeEventos3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnActualizar){  
                    System.out.println("si sirve");
                    actualizar();
                   
            }
        }}
    
    private ManejadorDeEventos4 eventos4;
    
    class ManejadorDeEventos4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnListar){  
                    System.out.println("si sirve");
                    listar();
                    
            }
        }}
    
    
}
