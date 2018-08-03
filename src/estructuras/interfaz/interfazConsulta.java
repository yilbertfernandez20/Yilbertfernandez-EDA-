package estructuras.interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class interfazConsulta extends JFrame {
    public JPanel Ppanel;
    
    public JLabel Lbuscar;
    public JTextField Txtbuscar;
    public JButton Bbuscar, Batras;
    
    public interfazConsulta(){
        inicio();
        confi();
    }
    
    public void confi(){
        setTitle("Proyecto Estructura");
        setDefaultLookAndFeelDecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(Ppanel);
        getContentPane().add(getBatras());
        
        setSize(500,360);
        setVisible(false);
        setAlwaysOnTop(false);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void inicio(){
        Ppanel=new JPanel();
        Ppanel.setLayout(null);
        
        Ppanel.setBounds(25,45,350,300);
        
        Ppanel.add(getLbuscar());
        Ppanel.add(getTxtbuscar());
        Ppanel.add(getBbuscar());
        
    }
    
    public JButton getBatras(){
        Batras=new JButton("Volver");
        Batras.setBounds(380,300,100,25);
        
        return Batras;
    }
    
    public JLabel getLbuscar(){
        Lbuscar=new JLabel("Buscar");
        Lbuscar.setBounds(20,20,100,45);
        
        return Lbuscar;
    }
    
    public JTextField getTxtbuscar(){
        Txtbuscar=new JTextField();
        Txtbuscar.setBounds(120,30,200,25);
        
        return Txtbuscar;
    }
    
    public JButton getBbuscar(){
        Bbuscar=new JButton("Buscar");
        Bbuscar.setBounds(150,60,100,25);
        
        return Bbuscar;
    }
}
