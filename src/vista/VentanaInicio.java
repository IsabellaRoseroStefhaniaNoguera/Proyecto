package vista;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInicio extends JFrame{
    private JButton btnInicio; 
    
    public VentanaInicio(){
        iniciarComponentes();
        this.getContentPane().setBackground(new Color(255,240,245));
    }
    private void iniciarComponentes(){
        
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        btnInicio = new JButton("Iniciar");
        btnInicio.setBounds(50,60, 100,50);
        add(btnInicio);
        
        eventos= new ManejadorDeEventos();//tambien xd
        btnInicio.addActionListener(eventos);
    }
    private ManejadorDeEventos eventos;
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnInicio){             
                dispose(); 
                VentanaPrincipal ventana1 = new VentanaPrincipal();
            }
        }
     }
}