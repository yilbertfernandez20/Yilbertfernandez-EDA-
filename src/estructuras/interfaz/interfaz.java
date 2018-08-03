package estructuras.interfaz;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class interfaz extends JFrame {
    
    public JPanel Pprincipal;
    
    public JLabel Lmarca, Lmodelo, Lcolor, Ldescri, Lano;
    public JTextField Txtmarca, Txtmodelo, Txtcolor, TxtDescri, Txtano;
    public JButton Bguardar, BSalir, Bconsultar;
    
    public interfaz(){
        inicio();
        confi();
    }
    public void confi(){
        setTitle("Proyecto Estructura");
        setDefaultLookAndFeelDecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(Pprincipal);
        getContentPane().add(getBsalir());
        
        setSize(500,360);
        setVisible(true);
        setAlwaysOnTop(false);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private JButton getBsalir(){
        BSalir=new JButton("Salir");
        BSalir.setBounds(380,300,100,25);
        return BSalir;
    }
    
    public void inicio(){
        Pprincipal=new JPanel();
        Pprincipal.setLayout(null);
        
        Pprincipal.setBounds(25,45,350,300);
        
        Pprincipal.add(getLmarca());
        Pprincipal.add(getTxtmarca());
        
        Pprincipal.add(getLmodelo());
        Pprincipal.add(getTxtmodelo());
        
        Pprincipal.add(getLano());
        Pprincipal.add(getTxtano());
        
        Pprincipal.add(getLcolor());
        Pprincipal.add(getTxtcolor());
        
        Pprincipal.add(getLdescri());
        Pprincipal.add(getTxtdescri());
        
        Pprincipal.add(getBconsul());
        Pprincipal.add(getBguarda());
    }
    
    public JLabel getLmarca(){
        Lmarca=new JLabel("Marca");
        Lmarca.setBounds(20,20,100,45);
        return Lmarca;
    }
    
    public JTextField getTxtmarca(){
        Txtmarca=new JTextField();
        Txtmarca.setBounds(120,30,200,25);
        
        return Txtmarca;
    }
    
    public JLabel getLmodelo(){
        Lmodelo=new JLabel("Modelo");
        Lmodelo.setBounds(20,55,125,50);
        
        return Lmodelo;
    }
    
    public JTextField getTxtmodelo(){
        Txtmodelo=new JTextField();
        Txtmodelo.setBounds(120,70,200,25);
        
        return Txtmodelo;
    }
    
    public JLabel getLano(){
        Lano=new JLabel("Año");
        Lano.setBounds(20,95,125,50);
        
        return Lano;
    }
    
    public JTextField getTxtano(){
        Txtano=new JTextField();
        Txtano.setBounds(120,110,200,25);
        
        return Txtano;
    }
    
    public JLabel getLcolor(){
        Lcolor=new JLabel("Color");
        Lcolor.setBounds(20,130,125,50);
        
        return Lcolor;
    }
    
    public JTextField getTxtcolor(){
        Txtcolor=new JTextField();
        Txtcolor.setBounds(120,145,200,25);
        
        return Txtcolor;
    }
    
    public JLabel getLdescri(){
        Ldescri=new JLabel("Descripcion");
        Ldescri.setBounds(20,170,125,50);
        
        return Ldescri;
    }
    
    public JTextField getTxtdescri(){
        TxtDescri=new JTextField();
        TxtDescri.setBounds(120,185,200,25);
        
        return TxtDescri;
    }
    
    public JButton getBconsul(){
        Bconsultar=new JButton("Consultar");
        Bconsultar.setBounds(225,220,100,25);
        
        return Bconsultar;
    }
    
    public JButton getBguarda(){
        Bguardar=new JButton("Guardar");
        Bguardar.setBounds(120,220,100,25);
        
        return Bguardar;
    }
}
